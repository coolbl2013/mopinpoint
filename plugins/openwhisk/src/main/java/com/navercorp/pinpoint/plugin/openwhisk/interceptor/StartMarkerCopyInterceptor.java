/*
 * Copyright 2018 NAVER Corp.
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
package com.navercorp.pinpoint.plugin.openwhisk.interceptor;

import com.navercorp.pinpoint.bootstrap.async.AsyncContextAccessor;
import com.navercorp.pinpoint.bootstrap.interceptor.AroundInterceptor;
import com.navercorp.pinpoint.plugin.openwhisk.accessor.PinpointTraceAccessor;

/**
 * @author Seonghyun Oh
 */
public class StartMarkerCopyInterceptor implements AroundInterceptor {

    public StartMarkerCopyInterceptor() {
    }

    @Override
    public void before(Object target, Object[] args) {
    }

    @Override
    public void after(Object target, Object[] args, Object result, Throwable throwable) {
        ((AsyncContextAccessor) (result))._$PINPOINT$_setAsyncContext(((AsyncContextAccessor) (target))._$PINPOINT$_getAsyncContext());
        ((PinpointTraceAccessor) (result))._$PINPOINT$_setPinpointTrace(((PinpointTraceAccessor) (target))._$PINPOINT$_getPinpointTrace());
    }
}

