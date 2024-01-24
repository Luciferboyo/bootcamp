package demoSet.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();//Set is an interface,HashSet is a class
    List<String> list = new ArrayList<>();

    list.add("ABC");
    list.add("ABC");
    list.add("ABC");

    for (String str : list) {
      set.add(str);
    }
    System.out.println(set.size());
  }
}
