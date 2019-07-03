package com.stackroute;

public class SumOfDigits
{
    public int sumDigits(String number)
    {
         String[] numberString=number.split(" ");//splitting string with space
         int sum=0;
         int numbers[]=new int[numberString.length];

         for(int i=0;i<numberString.length;i++)
         {
             numbers[i]=Integer.parseInt(numberString[i]);
             sum+=numbers[i];
         }
         return sum;
    }
}
