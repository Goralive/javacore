package com.inosovskyi.runners;

import com.inosovskyi.app.homework.lesson6.Menu;

import java.util.NoSuchElementException;

public class HomeTaskSix {
    public static void main(String[] args) {
           try {
                Menu.menuLogic();
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Seems you write something strange, please try again");
                Menu.menuLogic();
            }
        }
    }
