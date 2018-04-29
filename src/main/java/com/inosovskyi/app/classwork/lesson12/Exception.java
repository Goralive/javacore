package com.inosovskyi.app.classwork.lesson12;

import java.io.*;

//TODO 1. Copy file to resources 2. ReadFromFile 3. Palindrome 4. Write To file 5. FileRunner

public class Exception {
    public void buffReader () throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(System.getenv("write.path")));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
    public void buffWriter () throws IOException {
            String firstLine = "First Line";
            String secondLine = "Second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(System.getenv("write.path"))));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.newLine();
        writer.flush();
        writer.close();
        }
    }

