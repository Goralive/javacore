package com.inosovskyi.app.classwork.lesson18;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        int ageEmployee1 = employee1.getAge();
        int ageEmployee2 = employee2.getAge();
        if (ageEmployee1 > ageEmployee2){
            return 1;
        }
        else if (ageEmployee1 < ageEmployee2){
            return -1;
        } else {
            return 0;
        }

    }

}
