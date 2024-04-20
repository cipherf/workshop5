package com.phone;

import java.util.Scanner;
//Arvin amirhosseini 40231405

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        boolean isAddedMahdi = phonebook.addContact("mahdi", "09011234567", "Tehran", 29);
        boolean isAddedAmir =  phonebook.addContact("amir", "09021234567", "Tabriz", 22);
        boolean isAddedPouya = phonebook.addContact("pouya", "09031234567", "Mashhad", 38);


        Scanner reader = new Scanner(System.in);
        System.out.println("enter user name:");
        String custName = reader.nextLine().strip();
        System.out.println("enter user phone:");
        String custPhone = reader.nextLine().strip();
        System.out.println("enter user address:");
        String custAddr = reader.nextLine();
        System.out.println("enter user age:");
        int custAge = Integer.parseInt(reader.nextLine().strip());
        boolean isAddedCust = phonebook.addContact(custName, custPhone, custAddr, custAge);



        System.out.println("added all contacts");



        Contact mahdiCont = phonebook.getContact("mahdi");
        Contact montezaCont = phonebook.getContact("morteza");

        int avgAge = phonebook.getAvgAge();
        System.out.println("average age of contacts is: " + avgAge);


        phonebook.printContacts();
    }
}
