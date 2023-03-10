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

package com.navercorp.pinpoint.profiler.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.UUID;

/**
 * @author Woonduk Kang(emeroad)
 */
public class ObjectConverterTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    public void convert_sqlTime() {
        Time sqlTime = new Time(System.currentTimeMillis());
        String stringTime = convert(sqlTime);

        Assertions.assertEquals(stringTime, sqlTime.toString());
    }

    @Test
    public void convert_byte() {
        byte byte1 = 0;
        String convert = convert(byte1);

        Assertions.assertEquals(convert, String.valueOf(byte1));
    }

    private String convert(Object param) {
        Object[] args = new Object[]{new Object(), param};
        ObjectConverter objectConverter = new ObjectConverter();
        return objectConverter.convert(args);
    }

    @Test
    public void convert_UUID() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = convert(uuid);
        Assertions.assertEquals(uuidStr, uuidStr);
    }
}