package com.inosovskyi.app.homework.lesson7;

public class RigthAlignArray {

    static public void hugeArray() {
        int[][] array = new int[8][5];
        int couter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1000);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("List\t" + couter + ":\t");
            couter++;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
