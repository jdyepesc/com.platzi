package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_once() {
        String result2 =StringUtil.repeat("hola",1);
        Assert.assertEquals("hola",result2);

    }

    @Test
    public void repeat_string_multiple_times(){
        String result2 =StringUtil.repeat("hola",3);
        Assert.assertEquals("holaholahola",result2);
    }

    @Test
    public void repeat_string_zero_times(){
        String result2 =StringUtil.repeat("hola",0);
        Assert.assertEquals("",result2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        String result2 =StringUtil.repeat("hola",-1);
        Assert.assertEquals("hola",result2);
    }

    @Test
    public void word_is_not_empty(){
        Assert.assertFalse(StringUtil.isEmpty("Palabra"));
    }

    @Test
    public void quotationMarks_is_Empty(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void space_is_Empty(){
        String str = new String(" ");
        Assert.assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void null_is_empty(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

}