package com.navercorp.pinpoint.bootstrap.plugin.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReflectionUtilsTest {

    @Test
    public void test_getParameterTypeName() {
        String parameterTypeName = ReflectionUtils.getParameterTypeName(int.class);
        Assertions.assertEquals("int", parameterTypeName);
    }

    @Test
    public void test_getParameterTypeName1() {
        int[] v = new int[0];
        String parameterTypeName = ReflectionUtils.getParameterTypeName(v.getClass());
        Assertions.assertEquals("int[]", parameterTypeName);
    }

    @Test
    public void test_getParameterTypeName2() {
        int[][] v = new int[0][0];
        String parameterTypeName = ReflectionUtils.getParameterTypeName(v.getClass());
        Assertions.assertEquals("int[][]", parameterTypeName);
    }

}