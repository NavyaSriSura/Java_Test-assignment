package com.stackroute;

public class StringReverse {
    public  String ReverseMethod(String string) {
        if (string == null || string.isEmpty())//incase of empty and null stirng, ask for another valid string
            return "please enter string";
        else
        {
            String reverse = "";
            //loop for reversing the string
            for (int i = string.length() - 1; i >=0; --i) {
                reverse = reverse+ string.charAt(i);
            }
            return reverse;
        }

    }
}
