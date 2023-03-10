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

package com.navercorp.pinpoint.bootstrap.classloader;

import java.util.List;
import java.util.Objects;

/**
 * @author emeroad
 */
public class ProfilerLibClass implements LibClass {

    private final String[] profilerClass;

    public ProfilerLibClass(List<String> profilerClass) {
        Objects.requireNonNull(profilerClass, "profilerClass");

        this.profilerClass = profilerClass.toArray(new String[0]);
    }

    @Override
    public boolean onLoadClass(String clazzName) {
        for (String libClassName : profilerClass) {
            if (clazzName.startsWith(libClassName)) {
                return ON_LOAD_CLASS;
            }
        }
        return DELEGATE_PARENT;
    }
}
