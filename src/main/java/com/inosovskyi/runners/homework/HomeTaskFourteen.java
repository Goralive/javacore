package com.inosovskyi.runners.homework;

import com.inosovskyi.app.homework.lesson14.*;

public class HomeTaskFourteen {
    public static void main(String[] args) {
        Flower rose = new Rose(50,"White","Granpri");
        Flower violet = new Violets(20,"Violet","Grampy");
        Flower tupil = new Tulip(35,"Red","Pomodoro");
        Flower [] flowersType = {rose, violet, tupil};
        Bouquet bouquet = new Bouquet(7);
        bouquet.addSomeFlowers(flowersType);
        System.out.println(bouquet);
    }
}
