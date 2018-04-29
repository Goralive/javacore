package com.inosovskyi.app.classwork.lesson15;

public class BMW extends Car {
    String bmw;
    public String drive (){
        String bmw = "I drive bmw";
        return bmw;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "bmw='" + bmw + '\'' +
                '}';
    }
}
