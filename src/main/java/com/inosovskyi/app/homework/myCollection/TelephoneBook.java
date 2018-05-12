package com.inosovskyi.app.homework.myCollection;

import java.util.HashSet;
import java.util.Set;

public class TelephoneBook {
    private Set<Group> groupSet = new HashSet<>();

    public Group createGroup(String groupName) {
        Group group = new Group(groupName);
        groupSet.add(group);
        return group;
    }

    public Set<Group> getGroupSet() {
        return groupSet;
    }



    public void setGroupSet(Set<Group> groupSet) {
        this.groupSet = groupSet;
    }

    public Group searchGroup (String groupName){

        for(Group group : groupSet){
            if (groupName.equals(group.getGroupName())) {
                return group;
            }
        }
        return createGroup(groupName);
    }
}
