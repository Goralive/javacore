package com.inosovskyi.runners.homework.lesson6;

import com.inosovskyi.app.homework.lesson6.CalculateCircleArea;
import com.inosovskyi.app.homework.lesson6.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

           try {
                Menu.menuLogic();

            } catch (NumberFormatException e) {
                System.out.println("Seems you write something strange, please try again");
                Menu.menuLogic();
            }
        }

    }
