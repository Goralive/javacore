package com.inosovskyi.app.homework.lesson12;

import java.io.*;

public class PalindromMagic {
    public void readFile (String pathNameInput, String pathNameOutput){
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(pathNameInput)));
            BufferedWriter write = new BufferedWriter(new FileWriter(new File (pathNameOutput)))) {
           String line;
            while ((line = reader.readLine()) != null){
                String mainString = line.toLowerCase();
                String reverse = new StringBuilder(mainString).reverse().toString();


                if (mainString.equals(reverse)){
                    write.append(line + " - It's a palindrome");
                    write.newLine();
                    write.flush();
                } else {
                    write.append(line + " - Not a palindrome");
                    write.newLine();
                    write.flush();
                }
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
