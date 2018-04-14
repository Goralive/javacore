package com.inosovskyi.app.homework.lesson7;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class LessonSevenMenu {

    static public void menu () {
        System.out.println("\nGreetigs, here is the hometask #7\nPick number from 1-7, if you want exit, pick 0\n");
        System.out.println("Pick\t1 if you want to see task A\nPick\t2 if you want to see task B\nPick\t3 if you want to see task C\nPick\t4 if you want to see task D\nPick\t5 if you want to see task E\nPick\t6 if you want to see task F\nPick\t7 if you want to see task G\n");


        try {
            switch (Integer.parseInt(UserInputScanner.userString())) {
                case 0:
                    System.exit(1);
                case 1:
                    System.out.println("Task A: Array Odd numbers");
                    OddNumbers.odd();
                    LessonSevenMenu.menu();
                case 2:
                    System.out.println("Task B: EvenArray");
                    EvenArray.evenArrayPrint();
                    LessonSevenMenu.menu();
                case 3:
                    System.out.println("Task C: Random numbers [0:9]");
                    RandomNumbersArray.oddNumbersRandomArray();
                    LessonSevenMenu.menu();
                case 4:
                    System.out.println("Task D: Random numbers [0:999]");
                    RandomMaxMinNumber.randomNuMinMax();
                    LessonSevenMenu.menu();
                case 5:
                    System.out.println("Task E: Two dimensional array [10:99] ");
                    TwoDimesionalArray.creationTwoDemesionalArray();
                    LessonSevenMenu.menu();
                case 6:
                    System.out.println("Task F: Two dimensional array [1:999]");
                    RigthAlignArray.hugeArray();
                    LessonSevenMenu.menu();
                case 7:
                    System.out.println("Task G: Multiple calculation");
                    CalculrationMultipleNumbers.userInput();
            }
        } catch (Exception e) {
            System.out.println("Something go wrong");
            LessonSevenMenu.menu();
        }

    }
}
