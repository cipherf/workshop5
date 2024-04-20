package com.phone;

import java.util.Scanner;

// pourya fahimi 40231042

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        boolean isAddedAlireza = phonebook.addContact("alireza", "09303026140", "bojnourd", 17);
        boolean isAddedAmirDuck =  phonebook.addContact("amirDuck", "09339833926", "sadeghie", 19);
        boolean isAddedMoein = phonebook.addContact("moein", "09104699072", "karaj", 18);


        Scanner scanf = new Scanner(System.in);
        System.out.println("enter user name:");
        String custName = scanf.nextLine().strip();
        System.out.println("enter user phone:");
        String custPhone = scanf.nextLine().strip();
        System.out.println("enter user address:");
        String custAddr = scanf.nextLine();
        System.out.println("enter user age:");
        int custAge = Integer.parseInt(scanf.nextLine().strip());
        boolean isAddedCust = phonebook.addContact(custName, custPhone, custAddr, custAge);



        System.out.println("added all contacts");



        Contact mahdiCont = phonebook.getContact("mahdi");
        Contact morteza = phonebook.getContact("morteza");

        int avgAge = phonebook.getAvgAge();
        System.out.println("average age of contacts is: " + avgAge);


        phonebook.printContacts();
    }
}
