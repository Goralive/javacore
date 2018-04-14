package com.inosovskyi.app.homework.lesson5;

public class Calculator {
    public int multiplication(int a, int b) {

        return a * b;
    }

    public int division(int a, int b) {

        return a / b;
    }

    public int increment(int a, int b) {

        return a + b;

    }

    public int deduction(int a, int b) {

        return a - b;
    }

    public double degree(double a, double b) {

        return Math.pow(a, b);
    }

    public double random() {

        return Math.random();
    }

    public double round(double a, double b) {

        double result = a + b;

        return Math.round(result);
    }

    public double sqrt(int a) {

        Double.valueOf(a);

        return Math.sqrt(a);
    }

    public int mathMax(int a, int b) {

        return Math.max(a, b);
    }

    public int mathMin(int a, int b) {

        return Math.min(a, b);

    }

    public boolean trueStatement() {

        boolean is = true;

        return is;
    }


}
