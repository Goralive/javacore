package com.inosovskyi.runners.homework.lesson6;

import com.inosovskyi.app.homework.lesson6.CalculateCircleArea;
import com.inosovskyi.app.homework.lesson6.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x < 1) {
            try {
                Menu.menuLogic();
            } catch (NumberFormatException e) {
                System.out.println("Seems you write not an Int or double, try again");
            }
        }

    }

}