package com.stackroute;

public class PrintNumbers {
    public String printMethod(int n)
    {
        String var="";
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                var+=i;
            }
        }
        return var;
    }
}
