package com.inosovskyi.app.homework.lesson4.utils.convertos;

import java.util.Scanner;

public class PrimitiveConvertor {

    public void floatToChar(float floatUserInput) {

        int convertorToInt = (int) floatUserInput;
        char fromIntToChar = (char) convertorToInt;

        System.out.println("Input float value is " + floatUserInput + "\n Output char value is " + fromIntToChar);

    }

    public void intToChar(int intUserInput) {

        char intergetToChar = (char) intUserInput;

        System.out.println("Input int value is " + intUserInput + "\n Output char value is " + intergetToChar);
    }

    public void charToInt(char charUserInput) {

        int characterToInt = (int) charUserInput;

        System.out.println("Input int value is " + charUserInput + "\n Output char value is " + characterToInt);

    }
}
