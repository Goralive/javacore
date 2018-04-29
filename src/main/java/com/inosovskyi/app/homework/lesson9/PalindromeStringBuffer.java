package com.inosovskyi.app.homework.lesson9;

public class PalindromeStringBuffer {

    static public void checkPalindrome(String palindrome) {

        StringBuffer stringBuffer = new StringBuffer(palindrome).reverse();
        if (palindrome.equalsIgnoreCase(String.valueOf(stringBuffer))) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }

    static public void secondVariationPalindrome(String palindrome) {
        if (palindrome.length() == 1)
            System.out.println("Palindrome from 1 letter");
        for (int i = 0; i < palindrome.length() / 2; ++i) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1)) {
                System.out.println("This is not a palindrome");
                break;
            } else System.out.println("Seems it's a palindrome");
            break;
        }

    }

    static public void thirdVariationPalindrome(String palindrome) {
        String reverse = "";
        for (int i = palindrome.length() - 1; i >= 0; --i) {
            reverse += palindrome.charAt(i);
        }
        if (palindrome.equals(reverse) == true) {
            System.out.println("You write a palindrome!");
        } else {
            System.out.println("Nice try but it's not a palindrome");
        }
    }
}

