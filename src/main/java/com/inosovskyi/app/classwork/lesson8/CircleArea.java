package com.inosovskyi.app.classwork.lesson8;

import java.util.Scanner;
// pr2
public class CircleArea {

    public void calculateBiggerArea() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double area1 = Math.PI * Math.pow(sc.nextDouble(), 2);
        System.out.println("Enter the second radius");
        double area2 = Math.PI * Math.pow(sc.nextDouble(), 2);
        if (area1 == area2) {
            System.out.println("The same");
        } else
        if (area1 > area2) {
            System.out.println("Area 1 is bigger");
        } else
            System.out.println("Area 2 is bigger");

    }
}
