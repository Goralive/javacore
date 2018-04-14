package com.inosovskyi.app.classwork.lesson12;

import java.io.*;

public class Exception {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\input.txt"));
            String line;

            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();

            String firstLine = "First Line";
            String secondLine = "Second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.newLine();
        writer.close();
        }
    }

