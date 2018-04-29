package com.inosovskyi.runners.homework;

import com.inosovskyi.app.homework.lesson4.utils.convertos.PrimitiveConvertor;

public class HomeTaskFour {
    public static void main(String[] args) {

        PrimitiveConvertor primConv = new PrimitiveConvertor();

        primConv.floatToChar(2.6f);
        primConv.intToChar(22);
        primConv.charToInt('S');
    }
}
