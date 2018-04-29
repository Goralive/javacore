package com.inosovskyi.app.classwork.lesson16;

public class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int gear = 0;

    public void changeCadence (int newValue){
        this.cadence = newValue;
    }
    public void changeGear (int newValue){
        this.gear = newValue;
    }
    public void printValue (){
        System.out.println("Here is our cadence " + cadence + " and gear " + gear);
    }
}
