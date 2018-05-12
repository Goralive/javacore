package com.inosovskyi.app.classwork.lesson16;

public enum ListOfCelebrations {
    NEW_YEAR(1, "January", "New Year"), EIGHT_OF_MARCH(8, "March", "Eight of March");
    private int day;
    private String mounth;

    private String celebration;

     ListOfCelebrations(int day, String mounth, String celebration) {

        this.mounth = mounth;
        this.celebration = celebration;

    }
    public int getDay() {
        return day;
    }
}
