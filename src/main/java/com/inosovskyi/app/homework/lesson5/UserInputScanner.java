package com.inosovskyi.app.homework.lesson5;

import java.util.Scanner;

//TODO add scanner to all hometasks

 public class UserInputScanner {
     private static Scanner sc = new Scanner(System.in);

     public static double userStringToDouble() {
        return Double.valueOf(sc.nextLine());
    }

     public static String userString (){
        return sc.nextLine();
    }

}
