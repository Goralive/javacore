package com.inosovskyi.app.homework.lesson6;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class Menu {


    public static int userInput() {
        System.out.println("\nChoose (1) if you want to start right-angled triangle program");
        System.out.println("Choose (2) if you want to start calculate circle area program");
        System.out.println("Choose (3) if you want to define what number is bigger/smaller");
        System.out.println("Choose (4) if you want to define, if the number is even or odd");
        System.out.println("Choose (0) to exit the program");

        return Integer.parseInt(UserInputScanner.userString());
    }

    public static void menuLogic() {

        switch (userInput()) {
            case 0:
                System.out.println("Good bye!");
                System.exit(1);
            case 1:
                System.out.println(RightAngledTriangle.sideCalculation());
                Menu.menuLogic();
            case 2:
                System.out.println("Circle area is " + CalculateCircleArea.squareCircle());
                Menu.menuLogic();
            case 3:
                WhatNumberBigger.evenNumber();
                Menu.menuLogic();
            case 4:
                System.out.println(NumberEvenOdd.logicEvenOrOdd());
                Menu.menuLogic();
            default:
                System.out.println("Pick number from 0 - 4");
                Menu.menuLogic();
        }
    }
}

