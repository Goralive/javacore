package com.inosovskyi.runners.classwork.lesson4;

import com.inosovskyi.app.classwork.lesson4.NarrowingCasting;
import com.inosovskyi.app.classwork.lesson4.WideningCasting;

public class WideningRunner {
    public static void main(String[]args){

    WideningCasting wideningCasting = new WideningCasting();
    NarrowingCasting narrowingCasting = new NarrowingCasting();

    wideningCasting.widening();
    narrowingCasting.narrowing();

    }
}
