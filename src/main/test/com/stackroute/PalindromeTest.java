package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest
{
    Palindrome palindrome;
    @Before
    public void setUp()
    {
         palindrome=new Palindrome();
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        palindrome=null;
        System.out.println("After");
    }
    @Test
    public void givenANumberShouldCheckIfItIsAPalindrome()
    {

        String result=palindrome.check_Palindrome(12321);
        assertEquals(result,"Palindrome");
    }
    @Test
    public void givenPalindromeShouldReturnTrueIfSumOfEvenIsGreaterThan25ornot()
    {
        Palindrome palindrome=new Palindrome();
        Boolean result=palindrome.addEven(121);
        assertEquals(result,false);
    }
    @Test
    public void givenANumberShouldReturnPalindrome()
    {
        Palindrome palindrome=new Palindrome();
        String result=palindrome.check_Palindrome(545);
        assertEquals(result,"Palindrome");
    }


}