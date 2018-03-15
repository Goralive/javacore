package com.inosovskyi.app.classwork.lesson4;

public class NarrowingCasting {
    int narrowInt = 0;
    float narrowFloat = 3.14159f;


    public void narrowing() {

        narrowInt = (int) narrowFloat;
        System.out.println(narrowInt);
    }
}
