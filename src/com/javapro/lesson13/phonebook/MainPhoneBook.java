package com.javapro.lesson13.phonebook;

import com.javapro.lesson13.phonebook.model.PhoneBook;

public class MainPhoneBook {

  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();

    phoneBook.add("Andrey", "+380670234567");
    phoneBook.add("Andrey","+3308671234567");
    phoneBook.add("Ivan", "+380675514433");
    phoneBook.add("Robert", "+380673456789");
    phoneBook.add("Alexander", "+380674567891");
    System.out.println(phoneBook.add("Andrey", "+380676543210"));

    System.out.println(phoneBook.find("Andrey"));

    System.out.println(phoneBook.findAll("Andrey"));
  }
}

