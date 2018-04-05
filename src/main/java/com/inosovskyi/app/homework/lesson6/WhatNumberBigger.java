package com.inosovskyi.app.homework.lesson6;

import java.util.Scanner;

public class WhatNumberBigger {

    public static void evenNumber (){

        System.out.println("Greetings, write two numbers, and you will see what number is bigger\nWrite first integer: ");
        Scanner sc = new Scanner(System.in);

        int numberOne = Integer.parseInt(sc.nextLine());
        System.out.println("Write the second integer: ");
        int numberTwo = Integer.parseInt(sc.nextLine());

        if (numberTwo > numberOne && numberTwo != numberOne){
            System.out.println("Number two is bigger");
        }
        if (numberOne > numberTwo && numberOne != numberTwo){
            System.out.println("Number one is bigger");
        }
        if (numberOne == numberTwo) {
            System.out.println("Numbers seems to be equal");
        }
    }
}
