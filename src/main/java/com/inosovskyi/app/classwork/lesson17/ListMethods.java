package com.inosovskyi.app.classwork.lesson17;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class ListMethods {
    public ArrayList listOfWords() {

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Write some words. When you are finish write exit to finish and see how many words do you write");
        String temp;
       while (!(temp = UserInputScanner.userString()).toLowerCase().equals("exit")) {
           arrayList.add(temp);


       }

       return arrayList;
    }

    public String addSomewords (ArrayList arrayList) {
        HashMap hashMap = new HashMap();

        for (int i = 0; i <arrayList.size() ; i++) {
            hashMap.put(i,arrayList);
        }
        return hashMap.toString();
    }

}
