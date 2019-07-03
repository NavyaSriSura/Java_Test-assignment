package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest
{
    StringRepeat stringRepeat;
    @Before
    public void setUp()
    {
        stringRepeat=new StringRepeat();
    }
    @After
    public void tearDown()
    {
        stringRepeat=null;
    }
  @Test
    public void givenAStringRepeatLastNumberOfGivenCharacters()
  {

      String result=stringRepeat.stringRepeatMethod("navya",3);
      assertEquals("navyavyavyavya",result);
  }

    @Test
    public void givenAStringRepeatLastNumberCharacters()
    {

        String result=stringRepeat.stringRepeatMethod("Stackroute",3);
        assertEquals("Stackrouteuteuteute",result);
    }
    @Test
    public void givenAStringShouldReturngivenNumberOfLastCharacters()
    {
        String result=stringRepeat.stringRepeatMethod("route",2);
        assertEquals("routetete",result);
    }

    @Test
    public void givenAInValidStringReturnError()
    {
        String result=stringRepeat.stringRepeatMethod("route",6);
        assertEquals("Enter Valid number",result);
    }
}