package com.stackroute;

public class PrintNumbers {
    public String printMethod(int n)
    {

        String var="";
        if(n<0)
            var="Only Positive Integers are allowed";
        else
            {
            for (int i = 1; i <= n; i++) {//loops for printing sequence of numbers
                for (int j = 1; j <= i; j++) {
                    var += i;
                }
            }
        }
        return var;
    }
}
