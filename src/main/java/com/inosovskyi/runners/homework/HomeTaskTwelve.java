package com.inosovskyi.runners.homework;

import com.inosovskyi.app.homework.lesson12.RandomArrayBuffer;

import java.io.File;
import java.io.IOException;

public class HomeTaskTwelve {
    public static void main(String[] args) {
        RandomArrayBuffer arrayBuffer = new RandomArrayBuffer();
       try {
           arrayBuffer.randomIntArray();
           arrayBuffer.readNumbersFromFile();
           String currentDir = System.getenv("buffer.path.hometask");

           File file = new File(currentDir);
           System.out.println(file.getAbsolutePath());
       } catch (IOException e){
           System.out.println("Something go wrong try again");
          e.printStackTrace();

       }

    }
}
