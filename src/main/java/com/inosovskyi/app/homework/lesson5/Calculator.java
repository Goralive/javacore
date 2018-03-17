package com.inosovskyi.app.homework.lesson5;

import java.util.Scanner;

public class Calculator {

    public void getUserInput () {

        Scanner sc = new Scanner(System.in);


        System.out.println("Write a first number: ");
        String firstStNumber = sc.nextLine();
        System.out.println("Write a second number: ");
        String secondStNumber = sc.nextLine();
        System.out.println("Choose operation from / , * , - , + ");
        String operatorSt = sc.nextLine();


        Double firstNumber = Double.valueOf(firstStNumber);  // преобразовую тип из Str в double используя метод valueof, возможно лучше использовать конструктор
        Double secondNumber = Double.valueOf(secondStNumber);



        if (operatorSt.equals("*")){
            System.out.println("Here is the result of the firstNumber * secondNumber = " + (firstNumber * secondNumber));
        }
        if (operatorSt.equals("-")){
            System.out.println("Here is the result of the firstNumber - secondNumber = " + (firstNumber - secondNumber));
        }
        if (operatorSt.equals("+")){
            System.out.println("Here is the result of the firstNumber + secondNumber = " + (firstNumber + secondNumber));
        }
        if (operatorSt.equals("/")){
            System.out.println("Here is the result of the firstNumber / secondNumber = " + (firstNumber / secondNumber));
        }
        else {
            System.out.println("Was chosen incorrect operator. Try again and choose between * / + -");
        }
    }

}

