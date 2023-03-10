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

package com.navercorp.pinpoint.bootstrap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

/**
 * @author netspider
 */
public class ValidIdCheckerTest {

    private final Pattern p = Pattern.compile("[^a-zA-Z0-9._(\\-)]");

    @Test
    public void checkValidId() {
        Assertions.assertFalse(p.matcher("PINPOINT123").find());
        Assertions.assertFalse(p.matcher("P1NPOINT").find());
        Assertions.assertFalse(p.matcher("1PNPOINT").find());
        Assertions.assertFalse(p.matcher("P1NPOINT.DEV").find());
        Assertions.assertFalse(p.matcher("P1NPOINT..DEV").find());
        Assertions.assertFalse(p.matcher("P1N.POINT.DEV").find());
        Assertions.assertFalse(p.matcher("P1NPOINT-DEV").find());
        Assertions.assertFalse(p.matcher("P1NPOINT_DEV").find());
        Assertions.assertFalse(p.matcher("P1N_POINT_DEV").find());
    }

    @Test
    public void checkInvalidId() {
        Assertions.assertTrue(p.matcher("P1NPOINT가").find()); //include Korean character for test
        Assertions.assertTrue(p.matcher("P1NPOINT ").find());
        Assertions.assertTrue(p.matcher("P1NPOINT+").find());
        Assertions.assertTrue(p.matcher("PINPO+INT").find());
    }
}
