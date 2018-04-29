package com.inosovskyi.runners.homework;

import com.inosovskyi.app.homework.lesson12.ConsoleWord;
import com.inosovskyi.app.homework.lesson12.MenuEnum;
import com.inosovskyi.app.homework.lesson12.PalindromMagic;
import com.inosovskyi.app.homework.lesson12.RandomArrayNumbers;
import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class HomeTaskTwelve {
    public static void main(String[] args) {
        System.out.println("Hello: ");

        switch (MenuEnum.commandToMenu(Integer.parseInt(UserInputScanner.userString()))) {
            case EXIT: //Choose 0
                System.out.println("Good bye");
                System.exit(1);
            case PALINDROME: //Choose 1
                new PalindromMagic().readFile("src\\main\\resources\\palindrome.txt","src\\main\\resources\\palindromeResults.txt");
                break;
            case INT_NUMBERS: //Choose 2
                RandomArrayNumbers arrayBuffer = new RandomArrayNumbers();
                arrayBuffer.randomIntArray(20);
                arrayBuffer.writeSortNumbers(arrayBuffer.readNumbersFromFile(), "W:\\javacore\\src\\main\\resources\\results.txt");
                break;
            case WORD: // 3
                ConsoleWord consoleWord = new ConsoleWord();
                consoleWord.writeIntoFile(consoleWord.nameOfFile());
        }

    }
}
