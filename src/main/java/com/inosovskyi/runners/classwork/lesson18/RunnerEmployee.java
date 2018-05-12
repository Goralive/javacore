package com.inosovskyi.runners.classwork.lesson18;

import com.inosovskyi.app.classwork.lesson18.AgeComparator;
import com.inosovskyi.app.classwork.lesson18.Employee;

import java.util.ArrayList;
import java.util.Collections;


public class RunnerEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(33,"Vladyshka"));
        employees.add(new Employee(27, "Igore4ek"));
        employees.add(new Employee(29,"Serege4ka"));
        Collections.sort(employees, new AgeComparator());
        for (Employee emp : employees){
            System.out.println(emp);
        }

    }
}
