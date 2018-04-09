package com.inosovskyi.app.homework.lesson7;

import java.util.Scanner;

public class CalculrationMultipleNumbers {

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        try {
            while (true) {
                System.out.println("Write a next int or type exit to finish");
                String nextLine = sc.nextLine().toLowerCase();
                if (nextLine.equals("exit")) {
                    System.out.println("Yours results is:\t" + temp);
                    break;
                } else {
                    int multiplay = Integer.parseInt(nextLine);
                    temp += multiplay;
                }
            }
        } catch (Exception e) {
            System.out.println("Something go wrong, and your calculation was reset :-( But you have a second chance");
            userInput();
        }
    }
}












