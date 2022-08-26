package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("AB1!"));
    }

    @Test
    public void medium_when_has_only_letters_and_numbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcd12234"));
    }

    @Test
    public void strong_when_has_only_letters_and_symbols(){
        assertEquals(STRONG,PasswordUtil.assessPassword("abcd1234!"));
    }



}