package com.javapro.lesson13.collectoins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    Collections.addAll(list, "By", "Hello", "By", "Hello", "By", "Good morning", "Car",
        "Good morning",
        "Good morning", "Good morning", "Good By", "Apple", "By");
    List<Integer> list2 = new ArrayList<>();
    Collections.addAll(list2, 5, 1, 32, 3, 21, 4, 5, 6, 7, 8, 9, 10, 3, 2, 4, 1, 5, 6, 7,
        9, 11, 10, 8, 12);

    countOccurrence(list, "By");

    System.out.println(toList(new Integer[]{1, 2, 3}));

    System.out.println(findUnique(list2));

    calcOccurrence(list);

    System.out.println(findOccurrence(list));
    System.out.println(findOccurrence1(list));
  }

  public static void countOccurrence(List<String> list, String string) {
    if (string == null && list == null) {
      System.out.println("input string is null");
    } else {
      System.out.println(Collections.frequency(list, string));
    }
  }

  public static Collection<Integer> toList(Integer[] array) {
    Collection<Integer> list = new ArrayList<>();
    Collections.addAll(list, array);
    return list;
  }

  public static Collection<Integer> findUnique(List<Integer> list) {
    return new HashSet<>(list);
  }

  public static void calcOccurrence(List<String> list) {
    Set<String> set = new HashSet<>();
    for (String s : list) {
      if (set.add(s)) {
        System.out.println(s
            + ":" + Collections.frequency(list, s));
      }
    }
  }

  /**
   * 1 вариант
   */
  public static Set<String> findOccurrence(List<String> list) {
    Set<String> set = new HashSet<>();
    for (String s : list) {
      String string = String.format("{name:\"%s\",occurrence:%d}", s,
          Collections.frequency(list, s));
      set.add(string);
    }
    return set;
  }

  /**
   * 2 вариант
   */
  public static Map<String, Integer> findOccurrence1(List<String> list) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : list) {
      map.put(s, Collections.frequency(list, s));
    }
    return map;
  }
}
