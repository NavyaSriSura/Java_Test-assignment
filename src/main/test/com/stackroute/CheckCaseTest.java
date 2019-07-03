package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;

public class CheckCaseTest {
    CheckCase checkCase;
    @Before
    public void setUp()
    {
        checkCase=new CheckCase();
    }
    @After
    public void tearDown()
    {
        checkCase=null;
    }
    @Test
public  void givenACharacterShouldReturnUpperCaseOrNot()
{

String Result=checkCase.checkCaseMeth('A');
assertEquals("UpperCase",Result);

}
    @Test
    public  void givenACharacterShouldReturnLowerCaseOrNot()
    {

        String Result=checkCase.checkCaseMeth('a');
        assertEquals("LowerCase",Result);

    }
    @Test
    public  void givenACharacterShouldReturnDigitOrNot()
    {

        String Result=checkCase.checkCaseMeth('1');
        assertEquals("Digit",Result);

    }
    @Test
    public  void givenACharacterShouldReturnSpecialSymbolOrNot()
    {

        String Result=checkCase.checkCaseMeth('@');
        assertEquals("SpecialSymbol",Result);
    }
   @Test
    public void givenSpaceReturnSpecialCharacter()
   {
       String Result=checkCase.checkCaseMeth(' ');
       assertEquals("SpecialSymbol",Result);
   }

}