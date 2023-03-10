/*
 * Copyright 2017 NAVER Corp.
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

package com.navercorp.pinpoint.bootstrap.instrument.matcher.operand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jaehong.kim
 */
public class PackageInternalNameMatcherOperandTest {

    @Test
    public void base() {
        PackageInternalNameMatcherOperand operand = new PackageInternalNameMatcherOperand("com");
        assertEquals("com", operand.getPackageInternalName());
        assertEquals(3, operand.getExecutionCost());
        assertTrue(operand.isIndex());
        assertTrue(operand.match("com"));
    }

    public void packageNameisEmpty() {
        PackageInternalNameMatcherOperand operand = new PackageInternalNameMatcherOperand("");
        assertEquals("", operand.getPackageInternalName());
        assertTrue(operand.match(""));
        assertTrue(operand.match("com"));
        assertTrue(operand.match("org"));
    }

    @Test
    public void packageNameisNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            PackageInternalNameMatcherOperand operand = new PackageInternalNameMatcherOperand(null);
        });
    }
}