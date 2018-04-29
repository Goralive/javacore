package com.inosovskyi.app.classwork.lesson12;

import java.io.File;
import java.net.URL;

public class ReadFromFile {

    public void fromResources(){


    getClass().getClassLoader().getResource("output.txt");
    URL resource = getClass().getClassLoader().getResource("user.json");
    File userJSON;
        if (resource != null)



        userJSON = new File(resource.getFile());
    }
}
