package com.inosovskyi.app.classwork.lesson9;

public class NewArray {

    public void arrayCreation() {
        int[] arrayNew = new int[15];
        int numbersArray = 0;

        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = numbersArray;
            numbersArray = numbersArray + 5;
            System.out.println(arrayNew[i]);
        }
        for (int someElement : arrayNew) {
            System.out.print(" " + someElement);
        }
    }
}
