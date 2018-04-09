package com.inosovskyi.app.classwork.lesson9;

public class MultiDementionalArray {
    public void twoDementionalArray() {
        int[][] intArray = new int[2][3];
        for (int i = 0; i < intArray.length; i++) {
            System.out.println();
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = i * j;
                System.out.print("*");
            }
        }
    }
}
