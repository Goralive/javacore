package com.inosovskyi.app.homework.lesson12;



public enum  MenuEnum {
      PALINDROME, INT_NUMBERS, EXIT, WORD;



    public static MenuEnum commandToMenu (int choiseNumber){
        switch (choiseNumber){
            case 0:
                return MenuEnum.EXIT;
            case 1:
                return MenuEnum.PALINDROME;
            case 2:
                return MenuEnum.INT_NUMBERS;
            case 3:
                return MenuEnum.WORD;
            default:
                return MenuEnum.EXIT;
        }
    }

}




