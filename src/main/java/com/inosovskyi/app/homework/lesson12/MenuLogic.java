package com.inosovskyi.app.homework.lesson12;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class MenuLogic {
    public void menu() {
        System.out.println("Hello: ");

        switch (MenuEnum.commandToMenu(Integer.parseInt(UserInputScanner.userString()))) {
            case EXIT: //Choose 0
                System.out.println("Good bye");
                System.exit(1);
            case PALINDROME: //Choose 1
                new PalindromMagic().readFile("src\\main\\resources\\palindrome.txt", "src\\main\\resources\\palindromeResults.txt");
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
