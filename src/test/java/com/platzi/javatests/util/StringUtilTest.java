package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testRepeat() {
       String result =StringUtil.repeat("hola",3);
        Assert.assertEquals("holaholahola",result);



        String result2 =StringUtil.repeat("hola",1);
        Assert.assertEquals("hola",result2);

    }
}