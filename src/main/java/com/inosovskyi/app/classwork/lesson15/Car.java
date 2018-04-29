package com.inosovskyi.app.classwork.lesson15;

public class Car {
    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    private AirConditioner airConditioner;


    public String drive (){
        String driving = "Car drive";
        return driving;
    }
}
