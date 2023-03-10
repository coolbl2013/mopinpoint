/*
 * Copyright 2020 NAVER Corp.
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

package com.navercorp.pinpoint.profiler.context.errorhandler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;


/**
 * @author Woonduk Kang(emeroad)
 */
public class ParentClassThrowableMatcherTest {

    public static class SQLExceptionEx extends SQLException {
    }

    @Test
    public void match() {

        ThrowableMatcher classNameMatcher = new ClassNameThrowableMatcher(new String[]{SQLException.class.getName()});
        ThrowableMatcher matcher = new ParentClassThrowableMatcher(classNameMatcher);

        Assertions.assertTrue(matcher.match(SQLExceptionEx.class));

    }


    @Test
    public void match_fail() {

        ThrowableMatcher classNameMatcher = new ClassNameThrowableMatcher(new String[]{RuntimeException.class.getName()});
        ThrowableMatcher matcher = new ParentClassThrowableMatcher(classNameMatcher);

        Assertions.assertFalse(matcher.match(SQLExceptionEx.class));

    }
}