package com.inosovskyi.app.homework.lesson7;

import java.util.Arrays;

public class RandomNumbersArray {
    static public void oddNumbersRandomArray() {

        int counter = 0;
        int[] randomNumbers = new int[15];

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNum = (int) (Math.random() * 10);
            randomNumbers[i] += randomNum;
            int randomTemp = randomNum % 2;
            if (randomTemp == 0) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("In the array " + counter + " odd numbers, cheers");


    }

}
