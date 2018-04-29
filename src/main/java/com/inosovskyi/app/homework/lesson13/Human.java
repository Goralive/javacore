package com.inosovskyi.app.homework.lesson13;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        if (validAge(age)) {
            this.age = age;
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validAge(age)) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    private boolean validAge(int age) {
        if (age > 0 && age <= 120) {
            System.out.println("New age setted");
            return true;
        } else {
            System.out.println("Age invalid");
            return false;
        }
    }
}
