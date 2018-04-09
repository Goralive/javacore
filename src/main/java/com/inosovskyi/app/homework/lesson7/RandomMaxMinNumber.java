package com.inosovskyi.app.homework.lesson7;

import java.util.Arrays;

public class RandomMaxMinNumber {

    static public void randomNuMinMax() {
        boolean isSorted = false;
        int buf;
        int[] aLotOfNumbers = new int[15];
        for (int i = 0; i < aLotOfNumbers.length; i++) {
            aLotOfNumbers[i] += Math.random() * 1000;
        }
        System.out.println(Arrays.toString(aLotOfNumbers));
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < aLotOfNumbers.length - 1; i++) {
                if (aLotOfNumbers[i] < aLotOfNumbers[i + 1]) {
                    isSorted = false;

                    buf = aLotOfNumbers[i];
                    aLotOfNumbers[i] = aLotOfNumbers[i + 1];
                    aLotOfNumbers[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString((aLotOfNumbers)));
        System.out.println("Max value is: " + aLotOfNumbers[0]);
        System.out.println("Min value is: " + aLotOfNumbers[14]);
    }
}
