package com.inosovskyi.app.homework.lesson6;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;


public class RightAngledTriangle {
    // c2 = a2 + b2
    public static String sideCalculation() {

        System.out.println("Greetings friend, this program to verify if 3 digest can be the side of the right angle Triangle");

        System.out.println("Write side A: ");
        double sideA = Math.pow(UserInputScanner.userStringToDouble(), 2);

        System.out.println("Write side B: ");
        double sideB = Math.pow(UserInputScanner.userStringToDouble(), 2);

        System.out.println("Write side C: ");
        double sideC = Math.pow(UserInputScanner.userStringToDouble(), 2);

        if (sideC == sideA + sideB || sideA == sideB + sideC || sideB == sideA + sideC) {

            return "This 3 digest can be the side of the right angle Triangle ";
        } else return "You choose wrong digest, try again \n Cheers!";

    }
}
