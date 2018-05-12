package com.inosovskyi.runners.homework;

import com.inosovskyi.app.homework.myCollection.Menu;
import com.inosovskyi.app.homework.myCollection.TelephoneBook;


public class HomeTaskCollections {
    public static void main(String[] args) {

       Menu.setTelephoneBook(new TelephoneBook());
       Menu.menuTelephoneBook();
    }
}
