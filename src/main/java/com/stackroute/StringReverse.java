package com.stackroute;

public class StringReverse {
    public  String ReverseMethod(String string) {
        if (string == null || string.isEmpty())
            return string;
        else
        {
            String reverse = "";
            for (int i = string.length() - 1; i >=0; --i) {
                reverse = reverse+ string.charAt(i);
            }
            return reverse;
        }

    }
}
