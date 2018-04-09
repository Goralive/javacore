package com.inosovskyi.runners;

import com.inosovskyi.app.homework.lesson9.PalindromeStringBuffer;

import java.util.Scanner;

public class HomeTaskNine {
    public static void main(String[] args) {
        System.out.println("\nGreetigs, here is the hometask #9\nPick number from 1-3, if you want exit, pick 0\nDifferent realization :-)");
        Scanner sc = new Scanner(System.in);

        try {
            switch (Integer.parseInt(sc.nextLine())) {
                case 0:
                    System.exit(1);
                case 1:
                    System.out.println("You choose make Palindrome using StringBuffer\nWrite a palindrome");
                    PalindromeStringBuffer.checkPalindrome(sc.nextLine().toLowerCase());
                    HomeTaskNine.main(null);
                case 2:
                    System.out.println("Write a palindrome for 2nd variation");
                    PalindromeStringBuffer.secondVariationPalindrome(sc.nextLine().toLowerCase());
                    HomeTaskNine.main(null);
                case 3:
                    System.out.println("Write a palindrome for 3d variation");
                    PalindromeStringBuffer.thirdVariationPalindrome(sc.nextLine().toLowerCase());
                    HomeTaskNine.main(null);
            }
        } catch (Exception e) {
            System.out.println("Something go wrong");
            HomeTaskNine.main(null);
        }
    }
}
