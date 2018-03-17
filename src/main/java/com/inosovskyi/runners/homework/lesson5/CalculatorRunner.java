package com.inosovskyi.runners.homework.lesson5;

import com.inosovskyi.app.homework.lesson5.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {


        Calculator calc = new Calculator();

        try {
            calc.getUserInput();
        } catch (NumberFormatException e){
            System.out.println("Seems you are writing not an int");
        }

    }
}