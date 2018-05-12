package com.inosovskyi.app.classwork.lesson16;

import java.util.Comparator;

public class Porsche extends Mashine {
    private double cubic;
    private String gear;
    private int ram;



    @Override
    public double cubicDisplacement(double cubic) {

        this.cubic = cubic;
        return super.cubicDisplacement(5.0);
    }

    @Override
    public String gear(String gear) {
        this.gear = gear;
        return "Automotive" ;
    }

    @Override
    public int ram(int ram) {
        this.ram = ram;
        return 8;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "cubic=" + cubic +
                ", gear='" + gear + '\'' +
                ", ram=" + ram +
                '}';
    }

}
