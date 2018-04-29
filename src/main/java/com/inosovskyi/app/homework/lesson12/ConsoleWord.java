package com.inosovskyi.app.homework.lesson12;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;
import com.inosovskyi.app.homework.lesson6.Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleWord {
    public String nameOfFile (){
        System.out.println("Hello, write a file name: ");
        return UserInputScanner.userString();
    }
    public void writeIntoFile (String nameOfFile) {
        File userFile = new File("src\\main\\resources\\" + nameOfFile +".txt");
        System.out.println("Write some text: ");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(userFile))) {
                     String temp;
            while (!(temp = UserInputScanner.userString()).toLowerCase().equals("exit")) {
                writer.append(temp);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
