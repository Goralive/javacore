package com.inosovskyi.app.homework.myCollection;

import java.util.Map;
import java.util.TreeMap;

public class Group {
    private String groupName;
    private Map<String,String> phoneNumbers = new TreeMap();


    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public void showTelephoneNumber(String someValue){

    }
    public Map<String,String> addTelephoneNumber (String telephoneNumber, String accountName){
        phoneNumbers.put(telephoneNumber,accountName);
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return
                "Group='" + groupName + '\'' +
                '}';
    }
}
