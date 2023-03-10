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

package com.navercorp.pinpoint.bootstrap.interceptor;

import com.navercorp.pinpoint.bootstrap.context.SpanRecorder;
import com.navercorp.pinpoint.bootstrap.context.Trace;
import com.navercorp.pinpoint.bootstrap.context.TraceContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SpanSimpleAroundInterceptorTest {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Test
    public void lifeCycle() {
        Trace trace = newTrace();
        TraceContext context = newTraceContext(trace);

        TestSpanSimpleAroundInterceptor interceptor = new TestSpanSimpleAroundInterceptor(context);

        checkSpanInterceptor(context, interceptor);
    }

    @Test
    public void beforeExceptionLifeCycle() {

        Trace trace = newTrace();
        TraceContext context = newTraceContext(trace);

        TestSpanSimpleAroundInterceptor interceptor = new TestSpanSimpleAroundInterceptor(context) {
            @Override
            protected void doInBeforeTrace(SpanRecorder trace, Object target, Object[] args) {
                touchBefore();
                throw new RuntimeException();
            }
        };

        checkSpanInterceptor(context, interceptor);
    }

    private Trace newTrace() {
        Trace trace = mock(Trace.class);
        when(trace.canSampled()).thenReturn(true);

        return trace;
    }

    private TraceContext newTraceContext(final Trace trace) {
        final Answer answer = new Answer() {
            private boolean stop = false;

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                final String methodName = invocation.getMethod().getName();
                if (methodName.equals("removeTraceObject")) {
                    stop = true;
                }
                if (stop) {
                    return null;
                }
                return trace;
            }
        };

        TraceContext traceContext = mock(TraceContext.class);
        when(traceContext.currentRawTraceObject()).thenAnswer(answer);
        when(traceContext.newTraceObject()).thenAnswer(answer);
        when(traceContext.removeTraceObject()).thenAnswer(answer);
        return traceContext;
    }


    @Test
    public void afterExceptionLifeCycle() {

        Trace trace = newTrace();
        TraceContext context = newTraceContext(trace);

        TestSpanSimpleAroundInterceptor interceptor = new TestSpanSimpleAroundInterceptor(context) {
            @Override
            protected void doInAfterTrace(SpanRecorder trace, Object target, Object[] args, Object result, Throwable throwable) {
                touchAfter();
                throw new RuntimeException();
            }
        };

        checkSpanInterceptor(context, interceptor);
    }

    @Test
    public void beforeAfterExceptionLifeCycle() {

        Trace trace = newTrace();
        TraceContext context = newTraceContext(trace);

        TestSpanSimpleAroundInterceptor interceptor = new TestSpanSimpleAroundInterceptor(context) {
            @Override
            protected void doInBeforeTrace(SpanRecorder recorder, Object target, Object[] args) {
                touchBefore();
                throw new RuntimeException();
            }

            @Override
            protected void doInAfterTrace(SpanRecorder recorder, Object target, Object[] args, Object result, Throwable throwable) {
                touchAfter();
                throw new RuntimeException();
            }
        };

        checkSpanInterceptor(context, interceptor);
    }

    @Test
    public void traceCreateFail() {
        TraceContext context = mock(TraceContext.class);
        when(context.newTraceObject()).thenReturn(null);

        TestSpanSimpleAroundInterceptor interceptor = new TestSpanSimpleAroundInterceptor(context);

        checkTraceCreateFailInterceptor(context, interceptor);
    }

    private void checkSpanInterceptor(TraceContext context, TestSpanSimpleAroundInterceptor interceptor) {
        Trace createTrace = interceptor.createTrace(null, null);
        interceptor.before(new Object(), null);
        Assertions.assertEquals(interceptor.getBeforeTouchCount(), 1, "beforeTouchCount");
        Trace before = context.currentRawTraceObject();
        Assertions.assertEquals(createTrace, before);

        interceptor.after(new Object(), null, null, null);
        Assertions.assertEquals(interceptor.getAfterTouchCount(), 1, "afterTouchCount");
        Trace after = context.currentRawTraceObject();
        Assertions.assertNull(after);
    }

    private void checkTraceCreateFailInterceptor(TraceContext context, TestSpanSimpleAroundInterceptor interceptor) {
        Trace createTrace = interceptor.createTrace(null, null);
        Assertions.assertNull(createTrace);
        interceptor.before(new Object(), null);

        Assertions.assertEquals(interceptor.getBeforeTouchCount(), 0);
        Assertions.assertNull(context.currentRawTraceObject());

        interceptor.after(new Object(), null, null, null);
        Assertions.assertEquals(interceptor.getAfterTouchCount(), 0);
        Assertions.assertNull(context.currentRawTraceObject());
    }


    @Test
    public void testCreateTrace() {

    }

    @Test
    public void testDoInAfterTrace() {

    }

    public static class TestSpanSimpleAroundInterceptor extends SpanSimpleAroundInterceptor {
        private int beforeTouchCount;
        private int afterTouchCount;

        public TestSpanSimpleAroundInterceptor(TraceContext traceContext) {
            super(traceContext, null, TestSpanSimpleAroundInterceptor.class);
        }

        @Override
        protected Trace createTrace(Object target, Object[] args) {
            return traceContext.newTraceObject();
        }

        @Override
        protected void doInBeforeTrace(SpanRecorder recorder, Object target, Object[] args) {
            touchBefore();
        }

        protected void touchBefore() {
            beforeTouchCount++;
        }

        public int getAfterTouchCount() {
            return afterTouchCount;
        }

        @Override
        protected void doInAfterTrace(SpanRecorder recorder, Object target, Object[] args, Object result, Throwable throwable) {
            touchAfter();
        }

        protected void touchAfter() {
            afterTouchCount++;
        }

        public int getBeforeTouchCount() {
            return beforeTouchCount;
        }

        @Override
        protected void deleteTrace(Trace trace, Object target, Object[] args, Object result, Throwable throwable) {
        }
    }
}