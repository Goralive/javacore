package com.inosovskyi.app.classwork.lesson11;

public class Palindrome {

    public void checkPalindrome() {

        String quote = "boooob";
        StringBuffer stringBuffer = new StringBuffer(quote);
        StringBuffer quote2 = stringBuffer.reverse();
        if (quote.equalsIgnoreCase(String.valueOf(quote2))) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}