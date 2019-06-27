package com.stackroute;

public class CheckCase {
   public String checkCaseMeth(char ch)
   {
       String var="";
       if(ch>=65 && ch<=90) //checking with ASCII values
       {
           var=  "UpperCase";
       }
       else if (ch>=97 && ch<=122)
       {
           var=  "LowerCase";
       }
       else if(ch>=48 && ch<=57)
       {
           var=   "Digit";
       }
       else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127))
       {
           var=  "SpecialSymbol";
       }
       return var;
   }
}
