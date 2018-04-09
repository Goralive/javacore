package com.inosovskyi.app.homework.lesson7;

import java.util.Arrays;

public class EvenArray {

    static public void evenArrayPrint() {

        int[] backword = new int[50];
        int even = 1;
        for (int i = 0; i < backword.length; i++) {
            backword[i] = even;
            even = even + 2;
        }
        System.out.print(Arrays.toString(backword).replace('[', '(').replace(']', ')').replace(',', ' '));
        System.out.println();
        for (int i = 0; i < backword.length / 2; i++) {
            int tmp = backword[i];
            backword[i] = backword[backword.length - 1 - i];
            backword[backword.length - 1 - i] = tmp;

        }
        System.out.println(Arrays.toString(backword).replace('[', '(').replace(']', ')').replace(',', ' '));

    }
}
