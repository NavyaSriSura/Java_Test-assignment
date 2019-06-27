package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortInDescendingTest {
    SortInDescending sortInDescending;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        sortInDescending=new SortInDescending();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        sortInDescending=null;
    }
    @Test
    public void givenANumberShouldReturnDescendingOrder()
    {
       String result=sortInDescending.sort(1234);
       assertEquals("4321",result);
    }
    @Test
    public void givenANumberShouldReturnDescendingOrderOfThatNumber()
    {
        String result=sortInDescending.sort(89765);
        assertEquals("98765",result);
    }
    @Test
    public void givenANumberShouldReturnDescending()
    {
        String result=sortInDescending.sort(65748);
        assertEquals("87654",result);
    }
    public void givenANumberInDescendingOrderShouldCheckIfSumOfEvenIsGreaterThan15()
    {
        boolean result=sortInDescending.addEven(9843);
        assertEquals("false",result);
    }
}