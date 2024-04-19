package com.phone;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String, Contact> contactHashMap;
    private int numberOfContacts;

    Phonebook(){
        contactHashMap = new HashMap<>();
        numberOfContacts = 0;
    }

    public boolean addContact(String name,  String phoneNumber, String address,int age){
        Contact newContact = new Contact(name, phoneNumber, address, age);
        ArrayList<Contact> contacts = new ArrayList<>(contactHashMap.values());
        if (contacts.contains(newContact) ){
            return false;
        }
        contactHashMap.put(name, newContact);
        numberOfContacts++;
        return true;
    }

    public void printContacts(){
        ArrayList<Contact> contacts = new ArrayList<>(contactHashMap.values());
        System.out.println("\nprinting contacts:");
        for(Contact el : contacts){

            System.out.println(el);
            System.out.print("--------------------------------------------------------------\n");
        }
        return;
    }
    public Contact getContact(String name){
        return contactHashMap.get(name);
    }

    public int getAvgAge(){
        ArrayList<Contact> contacts = new ArrayList<>(contactHashMap.values());
        double sum = 0.00001;
        for(Contact el : contacts){
            System.out.println(el);
            sum += el.getAge();
        }
        return (int) Math.round(sum / contacts.size());
    }
}
