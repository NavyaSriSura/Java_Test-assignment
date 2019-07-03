package com.stackroute;

public class OddEven
{
    public  String checkOddEven(int n)
    {
        String var;
        if(n<0)//incase of negative numbers, give error
        {
            return "Enter a Positive Number";
        }
        if(n>20 && n<30)
        {
            if(n%2==1)
            {
                var="Tom";
            }
            else
            {
               var="Jerry";
            }
        }
        else var="NotTomNotJerry";
        return var;
    }
}
