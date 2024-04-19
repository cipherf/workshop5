package com.phone;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        boolean isAddedMahdi = phonebook.addContact("mahdi", "09011234567", "Tehran", 29);
        boolean isAddedAmir =  phonebook.addContact("amir", "09021234567", "Tabriz", 22);
        boolean isAddedPouya = phonebook.addContact("pouya", "09031234567", "Mashhad", 38);
        System.out.println("added all contacts");
        Contact mahdiCont = phonebook.getContact("mahdi");
        Contact montezaCont = phonebook.getContact("morteza");
    }
}
