package com.phone;

import java.util.Objects;

public class Contact {
    private final String name, phoneNumber, address;
    private final int age;


    public Contact(String name, String phoneNumber, String address, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getAge(){
        return age;
    }


    @Override
    public String toString(){
        return "name: " + getName() + " | address: " + getAddress() + " | phone: " + getPhoneNumber() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, address);
    }
}
