/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context;

import com.navercorp.pinpoint.bootstrap.context.SpanRecorder;
import com.navercorp.pinpoint.bootstrap.context.Trace;
import com.navercorp.pinpoint.bootstrap.context.TraceId;
import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.profiler.context.active.ActiveTraceHandle;
import com.navercorp.pinpoint.profiler.context.id.DefaultTraceRoot;
import com.navercorp.pinpoint.profiler.context.id.DefaultTraceId;
import com.navercorp.pinpoint.profiler.context.id.DefaultTransactionIdEncoder;
import com.navercorp.pinpoint.profiler.context.id.TraceRoot;
import com.navercorp.pinpoint.profiler.context.id.TransactionIdEncoder;
import com.navercorp.pinpoint.profiler.context.recorder.DefaultSpanRecorder;
import com.navercorp.pinpoint.profiler.context.recorder.WrappedSpanEventRecorder;
import com.navercorp.pinpoint.profiler.context.storage.SpanStorage;
import com.navercorp.pinpoint.profiler.metadata.JsonMetaDataService;
import com.navercorp.pinpoint.profiler.metadata.SqlMetaDataService;
import com.navercorp.pinpoint.profiler.metadata.StringMetaDataService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Mockito.*;

/**
 * @author emeroad
 */
@RunWith(MockitoJUnitRunner.class)
public class TraceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String agentId = "agent";
    private final long agentStartTime = System.currentTimeMillis();
    private final long traceStartTime = agentStartTime + 100;

    private final TransactionIdEncoder encoder = new DefaultTransactionIdEncoder(agentId, agentStartTime);

    @Mock
    private AsyncContextFactory asyncContextFactory = mock(AsyncContextFactory.class);
    @Mock
    private StringMetaDataService stringMetaDataService;
    @Mock
    private SqlMetaDataService sqlMetaDataService;
    @Mock
    private JsonMetaDataService jsonMetaDataService;


    @Test
    public void trace() {

        final TraceId traceId = new DefaultTraceId(agentId, agentStartTime, 1);
        final TraceRoot traceRoot = new DefaultTraceRoot(traceId, agentId, traceStartTime, 0);

        final CallStack callStack = newCallStack(traceRoot);
        final Span span = newSpan(traceRoot);

        boolean root = span.getTraceRoot().getTraceId().isRoot();
        SpanRecorder spanRecorder = new DefaultSpanRecorder(span, root, true, stringMetaDataService, sqlMetaDataService, jsonMetaDataService);
        WrappedSpanEventRecorder wrappedSpanEventRecorder = new WrappedSpanEventRecorder(asyncContextFactory, stringMetaDataService, sqlMetaDataService, jsonMetaDataService, null);

        AsyncContextFactory asyncContextFactory = mock(AsyncContextFactory.class);

        SpanStorage storage = mock(SpanStorage.class);

        Trace trace = new DefaultTrace(span, callStack, storage, asyncContextFactory, true, spanRecorder, wrappedSpanEventRecorder, ActiveTraceHandle.EMPTY_HANDLE);
        trace.traceBlockBegin();

        // get data form db
        getDataFromDB(trace);

        // response to client

        trace.traceBlockEnd();

        verify(storage, times(2)).store(Mockito.any(SpanEvent.class));
        verify(storage, never()).store(Mockito.any(Span.class));
    }


    @Test
    public void popEventTest() {

        final TraceId traceId = new DefaultTraceId(agentId, agentStartTime, 1);
        final TraceRoot traceRoot = new DefaultTraceRoot(traceId, agentId, traceStartTime, 0);

        final CallStack callStack = newCallStack(traceRoot);

        final Span span = newSpan(traceRoot);

        final boolean root = span.getTraceRoot().getTraceId().isRoot();
        SpanRecorder spanRecorder = new DefaultSpanRecorder(span, root, true, stringMetaDataService, sqlMetaDataService, jsonMetaDataService);
        WrappedSpanEventRecorder wrappedSpanEventRecorder = new WrappedSpanEventRecorder(asyncContextFactory, stringMetaDataService, sqlMetaDataService, jsonMetaDataService, null);


        AsyncContextFactory asyncContextFactory = mock(AsyncContextFactory.class);

        SpanStorage storage = mock(SpanStorage.class);

        Trace trace = new DefaultTrace(span, callStack, storage, asyncContextFactory, true, spanRecorder, wrappedSpanEventRecorder, ActiveTraceHandle.EMPTY_HANDLE);

        trace.close();

        verify(storage, never()).store(Mockito.any(SpanEvent.class));
        verify(storage).store(Mockito.any(Span.class));
    }

    private void getDataFromDB(Trace trace) {
        trace.traceBlockBegin();

        // db server request
        // get a db response
        trace.traceBlockEnd();
    }


    private CallStack newCallStack(TraceRoot traceRoot) {
        final CallStackFactory callStackFactory = new CallStackFactoryV1(64);
        return callStackFactory.newCallStack(traceRoot);
    }

    private Span newSpan(TraceRoot traceRoot) {
        final SpanFactory spanFactory = new DefaultSpanFactory("appName", agentId, agentStartTime, ServiceType.STAND_ALONE, encoder);
        return spanFactory.newSpan(traceRoot);
    }

}