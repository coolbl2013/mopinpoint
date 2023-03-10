/*
 * Copyright 2018 NAVER Corp.
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

package com.navercorp.pinpoint.bootstrap.instrument.transformer;

import com.navercorp.pinpoint.bootstrap.instrument.InstrumentException;
import com.navercorp.pinpoint.bootstrap.instrument.Instrumentor;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.mock.PrivateConstructor;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.mock.PublicConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.ProtectionDomain;

/**
 * @author Woonduk Kang(emeroad)
 */
public class TransformCallbackCheckerTest {

    @Test
    public void validate() {
        TransformCallbackChecker.validate(PublicConstructor.class);
    }

    @Test
    public void validate_private() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            TransformCallbackChecker.validate(PrivateConstructor.class);
        });
    }

    @Test
    public void validate_inner_static() {
        TransformCallbackChecker.validate(Static.class);
    }


    @Test
    public void validate_inner_non_static() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            TransformCallbackChecker.validate(NotStatic.class);
        });
    }

    @Test
    public void validate_inner_no_constructor() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            TransformCallbackChecker.validate(NoConstructor.class);
        });
    }


    public class NotStatic implements TransformCallback {

        @Override
        public byte[] doInTransform(Instrumentor instrumentor, ClassLoader classLoader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws InstrumentException {
            return null;
        }
    }

    public static class Static implements TransformCallback {

        @Override
        public byte[] doInTransform(Instrumentor instrumentor, ClassLoader classLoader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws InstrumentException {
            return null;
        }
    }

    public static class NoConstructor implements TransformCallback {
        private NoConstructor() {
        }

        @Override
        public byte[] doInTransform(Instrumentor instrumentor, ClassLoader classLoader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws InstrumentException {
            return null;
        }
    }


    @Test
    public void transform_local_inner() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            class LocalInner implements TransformCallback {

                @Override
                public byte[] doInTransform(Instrumentor instrumentor, ClassLoader classLoader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws InstrumentException {
                    return null;
                }
            }
            TransformCallbackChecker.validate(LocalInner.class);
        });
    }

    @Test
    public void transform_anonymous_inner_class() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            TransformCallback anonymousCallback = new TransformCallback() {

                @Override
                public byte[] doInTransform(Instrumentor instrumentor, ClassLoader classLoader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws InstrumentException {
                    return null;
                }
            };
            TransformCallbackChecker.validate(anonymousCallback.getClass());
        });
    }
}