package com.inosovskyi.app.homework.lesson6;

import java.util.Scanner;

public class RightAngledTriangle {
// c2 = a2 + b2
    public static String sideCalculation (){
        System.out.println("Greetings friend, this program to verify if 3 digest can be the side of the right angle Triangle");
        Scanner sc = new Scanner(System.in);

        System.out.println("Write side A: ");
        double sideA = Math.pow(sc.nextDouble(),2);

        System.out.println("Write side B: ");
        double sideB = Math.pow(sc.nextDouble(),2);

        System.out.println("Write side C: ");
        double sideC = Math.pow(sc.nextDouble(),2);

        if (sideC == sideA + sideB || sideA == sideB + sideC || sideB == sideA + sideC) {

            return "This 3 digest can be the side of the right angle Triangle ";
        }
        else return "You choose wrong digest, try again \n Cheers!";

    }
}
