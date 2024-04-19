package com.phone;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, Contact> contactHashMap;

    Phonebook(){
        contactHashMap = new HashMap<>();
    }

    public boolean addContact(String name,  String phoneNumber, String address){
        Contact newContact = new Contact(name, phoneNumber, address);
        ArrayList<Contact> contacts = new ArrayList<>(contactHashMap.values());
        if (contacts.contains(newContact) ){
            return false;
        }
        contactHashMap.put(name, newContact);
        return true;
    }

    public void printContacts(){
        ArrayList<Contact> contacts = new ArrayList<>(contactHashMap.values());
        for(Contact el : contacts){
            System.out.println(el);
            System.out.print("--------------------------------------------------------------");
        }

    }
    public Contact getContact(String name){
        return contactHashMap.get(name);
    }
}
