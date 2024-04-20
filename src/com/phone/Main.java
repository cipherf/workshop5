package com.phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("mahdi", "09011234567", "Tehran", 29);
        phonebook.addContact("amir", "09021234567", "Tabriz", 22);
        phonebook.addContact("pouya", "09031234567", "Mashhad", 38);


        Scanner reader = new Scanner(System.in);
        System.out.println("enter user name:");
        String newContactName = reader.nextLine().strip();
        System.out.println("enter user phone:");
        String newContactPhone = reader.nextLine().strip();
        System.out.println("enter user address:");
        String newContactAddr = reader.nextLine();
        System.out.println("enter user age:");
        int newContactAge = Integer.parseInt(reader.nextLine().strip());
        phonebook.addContact(newContactName, newContactPhone, newContactAddr, newContactAge);



        System.out.println("added all contacts");



        phonebook.getContact("mahdi");
        phonebook.getContact("morteza");

        int avgAge = phonebook.getAvgAge();
        System.out.println("average age of contacts is: " + avgAge);


        phonebook.printContacts();
    }
}
