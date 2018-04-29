package com.inosovskyi.app.homework.lesson12;

import java.io.*;
import java.util.Arrays;

public class RandomArrayBuffer {

    public void randomIntArray() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(System.getenv("buffer.path.hometask"))));
        for (int i = 0; i < 9; i++) {
            String temp = Integer.toString((int) (Math.random() * 100));
            writer.append(temp);
            writer.append(", ");
            writer.flush();

        }
        writer.append("777");
        writer.close();
    }

    public void readNumbersFromFile() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(System.getenv("buffer.path.hometask"))));
        //int [] arrayRandomNumbers = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        String strReadArray [] = reader.readLine().split(", ");
        int numberArray[] = new int[strReadArray.length];
        for (int i = 0; i <strReadArray.length ; i++) {
            numberArray[i] = Integer.parseInt(strReadArray[i]);


        }
    }
}
