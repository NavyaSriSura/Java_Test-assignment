package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;
    @Before
    public void setUp()
    {
        stringReverse=new StringReverse();
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        stringReverse=null;
        System.out.println("After ");
    }
    @Test
    public void givenAStringShouldReturnReverseOfTheString()
    {
        String result=stringReverse.ReverseMethod("Navya");
        assertEquals(result,"ayvaN");
    }
    @Test
    public void givenAStringShouldReturnReverseOfString()
    {
        String result=stringReverse.ReverseMethod("NavyaSri");
        assertEquals(result,"irSayvaN");
    }
    @Test
    public void givenAStringShouldReturnStringReverse()
    {
        String result=stringReverse.ReverseMethod("stackroute");
        assertEquals(result,"etuorkcats");
    }
}