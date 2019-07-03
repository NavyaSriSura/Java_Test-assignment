package com.stackroute;

public class StringRepeat
{
    public String stringRepeatMethod(String string,int number)
    {
        String var="";
        int length,repeat;
        length = string.length();
        if(length<number)//return error incase negative number is givne
            return var="Enter Valid number";
        repeat = length - number;
        for(int j=0;j<length;j++)
        var+=string.charAt(j);
        //concatenating the substring with actual string
        for (int i = 0; i < number; i++) {
            var+=string.substring(repeat);
        }
        return var;
    }
}
