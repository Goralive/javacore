package com.inosovskyi.app.homework.lesson5;

import java.util.Scanner;

public class CalculatorWithScanner {

    Scanner sc = new Scanner(System.in);


    public double getFirstUserInput() {

        System.out.println("Write a first number: ");

        String firstStNumber = sc.nextLine();

        Double firstNumber = Double.valueOf(firstStNumber);

        return Double.valueOf(firstNumber);

    }

    public double getSecondUserInput() {

        System.out.println("Write a second number: ");
        String secondStNumber = sc.nextLine();

        Double secondNumber = Double.valueOf(secondStNumber);

        return Double.valueOf(secondNumber);
   }

    public double calculation() {

        double firstNumber = getFirstUserInput();
        double secondNumber = getSecondUserInput();

        System.out.println("Choose operation from / , * , - , + ");
        String operatorSt = sc.nextLine();

        double result = 0;
        switch (operatorSt) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Wrong operator, try next time");
                break;
        }
        return result;
    }
}


//        Double secondNumber = Double.valueOf(secondStNumber);
//
//        if (operatorSt.equals("*")){
//            System.out.println("Here is the result of the firstNumber * secondNumber = " + (firstNumber * secondNumber));
//        }
//        if (operatorSt.equals("-")){
//            System.out.println("Here is the result of the firstNumber - secondNumber = " + (firstNumber - secondNumber));
//        }
//        if (operatorSt.equals("+")){
//            System.out.println("Here is the result of the firstNumber + secondNumber = " + (firstNumber + secondNumber));
//        }
//        if (operatorSt.equals("/")){
//            System.out.println("Here is the result of the firstNumber / secondNumber = " + (firstNumber / secondNumber));
//        }
//        else {
//            System.out.println("Was chosen incorrect operator. Try again and choose between * / + -");
//        }
//
//        System.out.println("Choose operation from / , * , - , + ");
//        String operatorSt = sc.nextLine();
//    }
//
//}

