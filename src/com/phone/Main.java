package com.phone;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("mahdi", "09011234567", "Tehran");
        phonebook.addContact("amir", "09021234567", "Tabriz");
        phonebook.addContact("pouya", "09031234567", "Mashhad");

        phonebook.getContact("mahdi");
        phonebook.getContact("morteza");
    }
}
