package com.stackroute;

public class Palindrome
{
    public  String check_Palindrome(long num){
        String var="";
        long temp = num, sum = 0, r, r1, s = 0;
        while (num > 0) //loop for reversing number
        {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (sum == temp) {

            var="Palindrome";


        } else {
            var="Not A Palindrome";
        }
        return var;
    }

    public boolean addEven(int number)
    {
        int temp=number,remainder,addEven=0;
        while(temp>0)//adding even digits in  a number
        {
            remainder=temp%10;
            if(remainder%2==0)
            {
                addEven+=remainder;
            }
            temp/=10;
        }
      if(addEven>25) //true if sum is greater than 25
          return true;
      else return false;

    }
}
