package com.inosovskyi.app.homework.lesson6;

import java.util.Scanner;

public class NumberEvenOdd {

    public static String logicEvenOrOdd (){
        System.out.println("Greetings, now you will know this number Even or odd, ");
        Scanner sc = new Scanner(System.in);

        int number1 = Integer.parseInt(sc.nextLine()) % 2;

        if ( number1 == 0) {
             return "Number is even";
        } else
            return "Number is odd";
    }
}
