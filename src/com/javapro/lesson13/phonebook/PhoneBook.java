package com.javapro.lesson13.phonebook;

import java.util.ArrayList;
import java.util.List;
public class PhoneBook {

  private final List<Record> records = new ArrayList<>();

  public PhoneBook() {

  }

  public List<Record> add(String name, String number) {
    records.add(new Record(name, number));
    return records;
  }

  public Record find(String name) {
    Record findRecord = new Record();
    for (Record record : records) {
      if (name.equals(record.getName())) {
        findRecord = record;
        break;
      } else {
        findRecord = null;
      }
    }
    return findRecord;
  }

  public List<Record> findAll(String name) {
    List<Record> findAll = new ArrayList<>();
    if (find(name) ==null){
      return null;
    }
    for (Record record : records) {
      if (name.equals(record.getName())) {
        findAll.add(record);
      }
    } return findAll;
  }

  @Override
  public String toString() {
    return "" + records + "";
  }
}
