package com.phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        boolean isAddedAlireza = phonebook.addContact("alireza", "09303026140", "bojnourd",17);
        boolean isAddedAmirhossein =  phonebook.addContact("amirhossein", "09339833926", "Tehran", 19);
        boolean isAddedPouria = phonebook.addContact("pouria", "09389663315", "Piroozi", 19);


        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter user name:");
        String custName = reader.nextLine().strip();
        System.out.println("Please enter user phone:");
        String custPhone = reader.nextLine().strip();
        System.out.println("Please enter user address:");
        String custAddr = reader.nextLine();
        System.out.println("Please enter user age:");
        int custAge = Integer.parseInt(reader.nextLine().strip());
        boolean isAddedCust = phonebook.addContact(custName, custPhone, custAddr, custAge);



        System.out.println("added all contacts");



        Contact AlirzeaCont = phonebook.getContact("Alireza");
        Contact mortezaCont = phonebook.getContact("morteza");

        int avgAge = phonebook.getAvgAge();
        System.out.println("average age of contacts is: " + avgAge);


        phonebook.printContacts();
    }
}
