package com.javapro.lesson13.phonebook;

public class Record {

  private String name;
  private String number;

  public Record() {

  }
  public Record(String name, String number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

   @Override
  public String toString() {
    return "{" +
        "name='" + name + '\'' +
        ", number='" + number + '\'' +
        '}';
  }
}

