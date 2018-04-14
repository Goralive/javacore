package com.inosovskyi.app.homework.lesson5;

public class CalculatorWithScanner {
    double result;

    public double calculation() {

        System.out.println("Write a first number: ");
        double firstNumber = UserInputScanner.userStringToDouble();
        System.out.println("Write a second number: ");
        double secondNumber = UserInputScanner.userStringToDouble();

        System.out.println("Choose operation from / , * , - , + ");
        String operatorSt = UserInputScanner.userString();

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
        System.out.println(result);
        return result;
    }

}
