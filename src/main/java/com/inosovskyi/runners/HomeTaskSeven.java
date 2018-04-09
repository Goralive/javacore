package com.inosovskyi.runners;

import com.inosovskyi.app.homework.lesson7.*;

import java.util.Scanner;

public class HomeTaskSeven {
    public static void main(String[] args) {
        System.out.println("\nGreetigs, here is the hometask #7\nPick number from 1-7, if you want exit, pick 0\n");
        System.out.println("Pick\t1 if you want to see task A\nPick\t2 if you want to see task B\nPick\t3 if you want to see task C\nPick\t4 if you want to see task D\nPick\t5 if you want to see task E\nPick\t6 if you want to see task F\nPick\t7 if you want to see task G\n");
        Scanner sc = new Scanner(System.in);

        try {
            switch (Integer.parseInt(sc.nextLine())) {
                case 0:
                    System.exit(1);
                case 1:
                    System.out.println("Task A: Array Odd numbers");
                    OddNumbers.odd();
                    HomeTaskSeven.main(null);
                case 2:
                    System.out.println("Task B: EvenArray");
                    EvenArray.evenArrayPrint();
                    HomeTaskSeven.main(null);
                case 3:
                    System.out.println("Task C: Random numbers [0:9]");
                    RandomNumbersArray.oddNumbersRandomArray();
                    HomeTaskSeven.main(null);
                case 4:
                    System.out.println("Task D: Random numbers [0:999]");
                    RandomMaxMinNumber.randomNuMinMax();
                    HomeTaskSeven.main(null);
                case 5:
                    System.out.println("Task E: Two dimensional array [10:99] ");
                    TwoDimesionalArray.creationTwoDemesionalArray();
                    HomeTaskSeven.main(null);
                case 6:
                    System.out.println("Task F: Two dimensional array [1:999]");
                    RigthAlignArray.hugeArray();
                    HomeTaskSeven.main(null);
                case 7:
                    System.out.println("Task G: Multiple calculation");
                    CalculrationMultipleNumbers.userInput();
            }
        } catch (Exception e) {
            System.out.println("Something go wrong");
            HomeTaskSeven.main(null);
        }
    }
}
