package com.inosovskyi.app.homework.myCollection;

import com.inosovskyi.app.homework.lesson5.UserInputScanner;

public class Menu {
    private static TelephoneBook telephoneBook;

    public static void menuTelephoneBook() {

        System.out.println("Hello,\n 0 = exit \n" + "1 = create new group\n"+"2 = list of groups");
        switch (Integer.parseInt(UserInputScanner.userString())) {
            case 0:
                System.out.println("Good bye!");
                System.exit(1);
            case 1:
                System.out.println("Group name");
                menuGroup(telephoneBook.searchGroup(UserInputScanner.userString()));
                break;
            case 2:
                System.out.println("Here is the list of groups:");
                System.out.println((telephoneBook.getGroupSet()));
                menuTelephoneBook();
        }
    }

    public static void menuGroup(Group group) {
        System.out.println(group.getPhoneNumbers());
        System.out.println("0 = exit\n" + "1 = enter New contact");
        switch (Integer.parseInt(UserInputScanner.userString())) {
            case 0:
                System.out.println("Good bye my group!");
                menuTelephoneBook();
                break;
            case 1:
                System.out.println("Telephone number");
                String telephoneNumber = UserInputScanner.userString();
                System.out.println("Enter name");
                String userName = UserInputScanner.userString();
                System.out.println(group.addTelephoneNumber(telephoneNumber,userName));
                menuGroup(group);
                break;
        }
    }

    public static TelephoneBook getTelephoneBook() {
        return telephoneBook;
    }

    public static void setTelephoneBook(TelephoneBook telephoneBook) {
        Menu.telephoneBook = telephoneBook;
    }
}

