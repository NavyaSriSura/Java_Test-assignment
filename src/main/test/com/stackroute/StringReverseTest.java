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
    }
    @After
    public void tearDown()
    {
        stringReverse=null;
    }
    @Test
    public void givenAStringReturnReverseOfTheString()
    {
        String result=stringReverse.ReverseMethod("Navya");
        assertEquals("ayvaN",result);
    }
    @Test
    public void givenAStringReturnReverseOfString()
    {
        String result=stringReverse.ReverseMethod("NavyaSri");
        assertEquals("irSayvaN",result);
    }
    @Test
    public void givenAStringReturnStringReverse()
    {
        String result=stringReverse.ReverseMethod("stackroute");
        assertEquals("etuorkcats",result);
    }
    @Test
    public void givenEmptyStringReturnError()
    {
        String result=stringReverse.ReverseMethod("");
        assertEquals("please enter string",result);
    }
    @Test
    public void givenNullReturnNull()
    {
        String result=stringReverse.ReverseMethod(null);
        assertEquals("please enter string",result);
    }
}