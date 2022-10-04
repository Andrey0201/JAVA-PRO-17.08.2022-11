package com.javapro.lesson13.phonebook.model;

public class Record {

  private final String name;
  private final String number;

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
        "name=" + name +
        ", number=" + number +
        '}';
  }
}

