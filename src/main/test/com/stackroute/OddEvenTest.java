package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    OddEven oddEven;
    @Before
    public void setUp()
    {
        oddEven=new OddEven();
    }
    @After
    public void tearDown()
    {
        oddEven=null;
    }
@Test
public  void givenANumberBetween20and30ShouldReturntJerryIfEven()
{

    String result=oddEven.checkOddEven(28);
    assertEquals(result,"Jerry");
}
    @Test
    public  void givenANumberBetween20and30ShouldReturntTomIfOdd()
    {

        String result=oddEven.checkOddEven(27);
        assertEquals(result,"Tom");
    }
    @Test
    public  void givenANumberNotBetween20and30ShouldReturnNotTomNotJerry()
    {
        String result=oddEven.checkOddEven(8);
        assertEquals(result,"NotTomNotJerry");
    }
    @Test
    public void givenNegativeNumberReturnError()
    {
        String result=oddEven.checkOddEven(-1);
        assertEquals(result,"Enter a Positive Number");
    }
}