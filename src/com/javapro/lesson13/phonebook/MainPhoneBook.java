package com.javapro.lesson13.phonebook;

public class MainPhoneBook {

  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.add("Andrey", "+380671234567");
    phoneBook.add("Ivan", "+380672345678");
    phoneBook.add("Robert", "+380673456789");
    phoneBook.add("Alexander", "+380674567891");
    System.out.println(phoneBook.add("Andrey", "+380676543210"));

    System.out.println(phoneBook.find("Ivan"));

    System.out.println(phoneBook.findAll("Iva"));
  }
}

