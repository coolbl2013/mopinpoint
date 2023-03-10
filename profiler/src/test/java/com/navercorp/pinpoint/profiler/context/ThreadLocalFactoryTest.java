/*
 * Copyright 2017 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context;

import com.navercorp.pinpoint.bootstrap.context.Trace;
import com.navercorp.pinpoint.exception.PinpointException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * @author Woonduk Kang(emeroad)
 */
public abstract class ThreadLocalFactoryTest {
    protected final TraceFactory sampledTraceFactory = newTraceFactory(true);

    protected final TraceFactory unsampledTraceFactory = newTraceFactory(false);

    protected final Logger logger = LogManager.getLogger(this.getClass());

    public TraceFactory newTraceFactory(boolean sampled) {

        final Trace trace = mock(Trace.class);
        when(trace.canSampled()).thenReturn(sampled);

        final Trace disable = mock(Trace.class);
        when(disable.canSampled()).thenReturn(false);

        final BaseTraceFactory baseTraceFactory = mock(BaseTraceFactory.class);
        when(baseTraceFactory.newTraceObject()).thenReturn(trace);
        when(baseTraceFactory.disableSampling()).thenReturn(disable);

        Binder<Trace> binder = new ThreadLocalBinder<>();

        TraceFactory traceFactory = new DefaultTraceFactory(baseTraceFactory, binder);
        return traceFactory;
    }

    @AfterEach
    public void tearDown() throws Exception {
        sampledTraceFactory.removeTraceObject();
        unsampledTraceFactory.removeTraceObject();
    }

    @Test
    public void nullTraceObject() {
        TraceFactory traceFactory = sampledTraceFactory;

        Trace currentTraceObject = traceFactory.currentTraceObject();
        Assertions.assertNull(currentTraceObject);

        Trace rawTraceObject = traceFactory.currentRawTraceObject();
        Assertions.assertNull(rawTraceObject);

        traceFactory.newTraceObject();
        Assertions.assertNotNull(traceFactory.currentRawTraceObject());
    }


    @Test
    public void testCurrentTraceObject() {
        TraceFactory traceFactory = sampledTraceFactory;

        Trace newTrace = traceFactory.newTraceObject();
        Trace currentTrace = traceFactory.currentTraceObject();

        Assertions.assertNotNull(currentTrace);
        Assertions.assertSame(newTrace, currentTrace);
    }

    @Test
    public void testCurrentTraceObject_unsampled() {
        TraceFactory traceFactory = unsampledTraceFactory;

        Trace newTrace = traceFactory.newTraceObject();
        Trace currentTrace = traceFactory.currentTraceObject();

        Assertions.assertNull(currentTrace);
        Assertions.assertNotEquals(newTrace, currentTrace);
    }


    @Test
    public void testCurrentRawTraceObject() {
        TraceFactory traceFactory = sampledTraceFactory;

        Trace trace = traceFactory.newTraceObject();
        Trace rawTrace = traceFactory.currentRawTraceObject();

        Assertions.assertNotNull(rawTrace);
        Assertions.assertSame(trace, rawTrace);
    }

    @Test
    public void testCurrentRawTraceObject_unsampled() {
        TraceFactory traceFactory = unsampledTraceFactory;

        Trace trace = traceFactory.newTraceObject();
        Trace rawTrace = traceFactory.currentRawTraceObject();

        Assertions.assertNotNull(rawTrace);
        Assertions.assertSame(trace, rawTrace);
    }

    @Test
    public void testDisableSampling() {

        TraceFactory traceFactory = sampledTraceFactory;

        Trace trace = traceFactory.disableSampling();
        Trace rawTrace = traceFactory.currentRawTraceObject();

        Assertions.assertNotNull(rawTrace);
        Assertions.assertSame(trace, rawTrace);
    }

    @Test
    public void testContinueTraceObject() {
    }

    @Test
    public void testNewTraceObject() {
        TraceFactory traceFactory = sampledTraceFactory;

        traceFactory.newTraceObject();
        Trace rawTraceObject = traceFactory.currentRawTraceObject();
        Assertions.assertNotNull(rawTraceObject);

    }


    @Test
    public void duplicatedTraceStart() {
        Assertions.assertThrows(PinpointException.class, () -> {
            TraceFactory traceFactory = sampledTraceFactory;

            traceFactory.newTraceObject();
            traceFactory.newTraceObject();
        });
    }

    @Test
    public void testDetachTraceObject() {
        TraceFactory traceFactory = this.sampledTraceFactory;

        traceFactory.newTraceObject();
        traceFactory.removeTraceObject();

        Trace rawTraceObject = traceFactory.currentRawTraceObject();
        Assertions.assertNull(rawTraceObject);
    }
}