package com.inosovskyi.app.classwork.lesson14;

public class Student extends Person {

    private String university;
    private String response = " ";
    public Student(String name, String university) {
        super(name);
        this.university = university;

    }

    public String getResponse() {
        return name;
    }
}

