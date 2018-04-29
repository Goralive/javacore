package com.inosovskyi.app.classwork.lesson12;

import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        String currentDir = System.getenv("write.path");

        File file = new File(currentDir);
        System.out.println(file.getAbsolutePath());



    }
}
