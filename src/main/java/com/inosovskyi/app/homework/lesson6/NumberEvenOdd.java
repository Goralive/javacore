package com.inosovskyi.app.homework.lesson6;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class NumberEvenOdd {

    public static String logicEvenOrOdd (){
        System.out.println("Greetings, now you will know this number Even or odd, ");

        int number1 = Integer.parseInt(UserInputScanner.userString()) % 2;

        if ( number1 == 0) {
             return "Number is even";
        } else
            return "Number is odd";
    }
}
