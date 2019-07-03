package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintNumbersTest
{
    PrintNumbers printNumbers;
    @Before
    public void setUp()
    {
        printNumbers=new PrintNumbers();

    }
    @After
    public void Terminate()
    {
        printNumbers=null;
    }
    @Test
    public void givenANumberShouldReturnSeriesOfthatNumber()
    {

        String result=printNumbers.printMethod(5);
        assertEquals("122333444455555",result);
    }
    @Test
    public void givenANegativeNumberShouldReturnError()
    {
        String result=printNumbers.printMethod(-1);
        assertEquals("Only Positive Integers are allowed",result);
    }
    @Test
    public void givenZeroReturnEmptyString()
    {
        String result=printNumbers.printMethod(0);
        assertEquals("",result);
    }

}
