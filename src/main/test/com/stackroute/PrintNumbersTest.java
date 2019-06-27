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
        System.out.println("Before");
    }
    @After
    public void Terminate()
    {
        printNumbers=null;
        System.out.println("After");
    }
 @Test
    public void givenANumberShouldReturnSeriesOfthatNumber()
    {

        String result=printNumbers.printMethod(5);
        assertEquals("122333444455555",result);
    }
}
