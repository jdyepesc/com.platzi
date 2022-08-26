package com.platzi.javatests.util;



public class StringUtilTest {
    public static void main(String[] args) {
       String result =StringUtil.repeat("hola",3);
       System.out.println(result);

        if (!result.equals("holaholahola")) {
            System.out.println("ERROR");
        }

        String result2 =StringUtil.repeat("Hola",2);
        System.out.println(result2);

        if (!result.equals("hola")) {
            System.out.println("ERROR");
        }

    }
}