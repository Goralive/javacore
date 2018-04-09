package com.inosovskyi.app.classwork.lesson11;

import java.util.Arrays;

public class TransitionString {
    public void stringHistory() {
        int aToString = 4;
        double dToString = 2.7;
        long lToString = 16518879L;
        boolean bToString = false;

        String doubleValue = String.valueOf(dToString);
        String booleanValue = String.valueOf(bToString);
        String longValue = String.valueOf(lToString);
        String intValue = String.valueOf(aToString);

        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(longValue);
        System.out.println(intValue);
        System.out.println();


        String stringToDisplay = "";
        char[] charArrayToString = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        for (int i = 0; i < charArrayToString.length; i++) {

            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
        System.out.println();

        stringToDisplay = Arrays.toString(charArrayToString).replace(",", "").replace("[", "").replace("]", "").replace(" ", "").trim();
        System.out.println(stringToDisplay);


    }
}
