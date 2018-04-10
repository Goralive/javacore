package com.inosovskyi.app.homework.lesson9;

import java.util.Scanner;

public class MenuPalindrom {
    static public void menu() {
        System.out.println("\nGreetigs, here is the hometask #9\nPick number from 1-3, if you want exit, pick 0\nDifferent realization :-)");
        Scanner sc = new Scanner(System.in);

        try {
            switch (Integer.parseInt(sc.nextLine())) {
                case 0:
                    System.exit(1);
                case 1:
                    System.out.println("You choose make Palindrome using StringBuffer\nWrite a palindrome");
                    PalindromeStringBuffer.checkPalindrome(sc.nextLine().toLowerCase());
                    MenuPalindrom.menu();
                case 2:
                    System.out.println("Write a palindrome for 2nd variation");
                    PalindromeStringBuffer.secondVariationPalindrome(sc.nextLine().toLowerCase());
                    MenuPalindrom.menu();
                case 3:
                    System.out.println("Write a palindrome for 3d variation");
                    PalindromeStringBuffer.thirdVariationPalindrome(sc.nextLine().toLowerCase());
                    MenuPalindrom.menu();
            }
        } catch (Exception e) {
            System.out.println("Something go wrong");
            MenuPalindrom.menu();
        }
    }
}
