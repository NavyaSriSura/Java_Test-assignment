package com.stackroute;

public class VowelConsonant
{
    public String vowelConsonantCheck(String word)
    {
        String var="";
        for(int i=0;i<word.length();++i)
        {
            char ch= word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                var+="Vowel";
            }
            else if (ch>='a' && ch<='z')
            {
                var+="Consonant";
            }
            else
            {
                System.out.print("Please enter a valid letter");
            }
        }
        return var;
    }
}
