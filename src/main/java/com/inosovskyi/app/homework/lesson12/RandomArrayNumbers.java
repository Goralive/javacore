package com.inosovskyi.app.homework.lesson12;

import java.io.*;
import java.util.Arrays;

public class RandomArrayNumbers {

    public void randomIntArray(int arrayLength) {


        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(System.getenv("buffer.path.hometask"))))) {
            for (int i = 0; i < arrayLength; i++) {
                String temp = Integer.toString((int) (Math.random() * 100));
                writer.append(temp);
                writer.flush();
                if (i != arrayLength - 1) {
                    writer.append(", ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] readNumbersFromFile() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(System.getenv("buffer.path.hometask"))))) {
            String strReadArray[] = reader.readLine().split(", ");
            int numberArray[] = new int[strReadArray.length];
            for (int i = 0; i < strReadArray.length; i++) {
                numberArray[i] = Integer.parseInt(strReadArray[i]);
            }
            Arrays.sort(numberArray);
            return numberArray;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeSortNumbers(int[] numberArray, String pathName) {
        File createNewFile = new File(pathName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(createNewFile));) {
            createNewFile.createNewFile();

            for (int i = 0; i < numberArray.length; i++) {
                writer.append(Integer.toString(numberArray[i]));

                if (i != numberArray.length - 1) {
                    writer.write(", ");
                }
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
