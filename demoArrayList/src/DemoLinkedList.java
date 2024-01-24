package demoArrayList.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    List<String> ls = new LinkedList<>();
    ls.add("ABC");
    ls.add("DEF");
    ls.add("IJK");
    System.out.println(ls);


    //exercise
    LinkedList<String> names = new LinkedList<>();

    //add
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    System.out.println(names);
    names.add(1,"bobo");
    System.out.println(names);

    //remove
    names.remove(0);
    System.out.println(names);
    names.remove("bobo");
    System.out.println(names);

    System.out.println(names.get(0));
    
    System.out.println(names.size());

    names.clear();

    System.out.println(names);

    System.out.println(names.contains("bobo"));

    System.out.println(names.isEmpty());

    System.out.println(names.indexOf("bobo"));

    System.out.println(ls.indexOf("ABC"));

    ls.set(0, "James");

    System.out.println(ls.indexOf("James"));

    
  }
}
