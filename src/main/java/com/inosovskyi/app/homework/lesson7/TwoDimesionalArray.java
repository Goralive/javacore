package com.inosovskyi.app.homework.lesson7;

import java.util.Arrays;

public class TwoDimesionalArray {

    static public void creationTwoDemesionalArray() {
        int[][] twoDementionalArray = new int[8][5];

        for (int i = 0; i < twoDementionalArray.length; i++) {
            for (int j = 0; j < twoDementionalArray[i].length; j++) {
                twoDementionalArray[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        for (int i = 0; i < twoDementionalArray.length; i++) {
            for (int j = 0; j < twoDementionalArray[i].length; j++) {
                System.out.print(twoDementionalArray[i][j] + " \t");
            }
            System.out.println(" ");
        }

    }
}
