package com.inosovskyi.app.homework.lesson7;

public class OddNumbers {

    public void odd (){
        int [] oddNumbers = new int[10];
        int odd = 2;
        for (int i = 0; i <oddNumbers.length ; i++) {
            oddNumbers[i] = odd;
            System.out.print(oddNumbers[i] + " ");
            odd = odd + 2;
       }
        for (int column:oddNumbers) {
            System.out.print("\n" + column);
        }
    }
}
