package com.javapro.lesson13.phonebook.model;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

  private final List<Record> records = new ArrayList<>();

  public List<Record> add(String name, String number) {
    if (name == null || number == null) {
      System.out.println("name or number can't be null");
    } else {
      records.add(new Record(name, number));
    }

    return records;
  }

  public Record find(String name) {
    for (Record record : records) {
      if (record.getName().equals(name)) {
        return record;
      }
    }
    return null;
  }

  public List<Record> findAll(String name) {
    List<Record> findAll = new ArrayList<>();
    if (find(name) == null) {
      return null;
    }
    for (Record record : records) {
      if (name.equals(record.getName())) {
        findAll.add(record);
      }
    }
    return findAll;
  }

  @Override
  public String toString() {
    return "" + records + "" ;
  }
}
