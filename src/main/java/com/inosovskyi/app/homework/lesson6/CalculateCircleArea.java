package com.inosovskyi.app.homework.lesson6;


import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateCircleArea {

    public static double squareCircle (){

        System.out.println("Hello, enter the radius: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        double userDouble = Double.valueOf(userInput);
        double result = Math.PI * Math.pow(userDouble,2);

        return Math.rint(result);

    }
}
