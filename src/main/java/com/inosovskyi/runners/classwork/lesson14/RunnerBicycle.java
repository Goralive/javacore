package com.inosovskyi.runners.classwork.lesson14;

import com.inosovskyi.app.classwork.lesson14.Bicycle;
import com.inosovskyi.app.classwork.lesson14.Student;

public class RunnerBicycle {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(5,"Str");
        System.out.println(bicycle.wheelSize);
        System.out.println(bicycle.color);

        Student student = new Student("Inokentii","Shevchenko");
        System.out.println(student.getResponse());


//        bicycle.setColor("White");
//        bicycle.setWheelSize(35);
//        System.out.println(bicycle.ride());
//        System.out.println(bicycle.getWheelSize());
//        System.out.println(bicycle.getColor());
//
//        Bicycle bicycle1 = new Bicycle(1,"Borrow");
//        System.out.println(bicycle1.getColor());
//        System.out.println(bicycle1.getWheelSize());
    }
}
