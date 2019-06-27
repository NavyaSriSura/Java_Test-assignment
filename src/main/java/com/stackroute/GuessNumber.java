package com.stackroute;

public class GuessNumber {
    public String  compare(int num1, int num2)
    {
        String variable;
        if (num1 > num2) {
            variable="Your Guess is too High";
        } else if (num1 < num2) {
            variable="Your Guess is too Low";
        } else {
            variable="Your Guess is Correct";

        }
        return variable;
    }
}
