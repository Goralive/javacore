package com.inosovskyi.app.classwork.lesson14;

public class Bicycle {
    public int wheelSize;
    public String color;
    public Bicycle (int wheelSize, String color){
        this (wheelSize);
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public Bicycle (int wheelSize){
        this ();
        this.wheelSize = wheelSize;
    }
    public Bicycle (){
        this.wheelSize = 26;
        this.color = "red";

    }
    public String ride (){
        return "Wroom!";
    }

//    public int getWheelSize() {
//        return wheelSize;
//    }
//
//    public void setWheelSize(int wheelSize) {
//        this.wheelSize = wheelSize;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
}
