package com.inosovskyi.app.homework.lesson6;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;


public class CalculateCircleArea {

    public static double squareCircle() {

        System.out.println("Hello, enter the radius: ");
        double userDouble = Double.valueOf(UserInputScanner.userStringToDouble());
        double result = Math.PI * Math.pow(userDouble, 2);

        return Math.rint(result);
    }
}
