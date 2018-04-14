package com.inosovskyi.app.homework.lesson9;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class MenuPalindrom {
    static public void menu() {
        System.out.println("\nGreetigs, here is the hometask #9\nPick number from 1-3, if you want exit, pick 0\nDifferent realization :-)");

        try {
            switch (Integer.parseInt(UserInputScanner.userString())) {
                case 0:
                    System.exit(1);
                case 1:
                    System.out.println("You choose make Palindrome using StringBuffer\nWrite a palindrome");
                    PalindromeStringBuffer.checkPalindrome(UserInputScanner.userString().toLowerCase());
                    MenuPalindrom.menu();
                case 2:
                    System.out.println("Write a palindrome for 2nd variation");
                    PalindromeStringBuffer.secondVariationPalindrome(UserInputScanner.userString().toLowerCase());
                    MenuPalindrom.menu();
                case 3:
                    System.out.println("Write a palindrome for 3d variation");
                    PalindromeStringBuffer.thirdVariationPalindrome(UserInputScanner.userString().toLowerCase());
                    MenuPalindrom.menu();
            }
        } catch (Exception e) {
            System.out.println("Something go wrong");
            MenuPalindrom.menu();
        }
    }
}
