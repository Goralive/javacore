package com.inosovskyi.app.homework.lesson7;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class CalculrationMultipleNumbers {

    public static void userInput() {

        int temp = 0;
        try {
            while (true) {
                System.out.println("Write a next int or type exit to finish");
                String nextLine = UserInputScanner.userString().toLowerCase();
                if (nextLine.equals("exit")) {
                    System.out.println("Yours results is:\t" + temp);
                    LessonSevenMenu.menu();
                } else {

                    temp += Integer.parseInt(nextLine);
                }
            }
        } catch (Exception e) {
            System.out.println("Something go wrong, and your calculation was reset :-( But you have a second chance");
            userInput();
        }
    }
}












