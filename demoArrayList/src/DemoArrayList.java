package demoArrayList.src;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import demoClass.src.Cat;
import java.util.Iterator;

public class DemoArrayList {

  public static void main(String[] args) {
      
    //Before Java 1.5(No Generic)
  
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("ABC");
    arrayList.add("DFG");
    arrayList.add("HIJ");
    System.out.println(arrayList.size());

    //for-each
    for(String s : arrayList){
      System.out.println(s);
    }

    arrayList.remove(2);
    System.out.println(arrayList);

    arrayList.remove("ABC");
    arrayList.remove(new String("DFG"));
    System.out.println(arrayList);

    ArrayList<String> otherList = new ArrayList<>(List.of("123","456","789"));
    arrayList.addAll(otherList);
    System.out.println(arrayList);

    arrayList.removeAll(otherList);
    System.out.println(arrayList);

    ArrayList<Object> list = new ArrayList<>();
    Cat cat = new Cat();
    list.add("123");
    list.add(123);
    list.add(cat);

    System.out.println(list);

    list.add(0, "132");
    System.out.println(list);

    System.out.println(list.get(2));

    list.set(1,"157");
    System.out.println(list);

    list.subList(1, 2);
    System.out.println(list.subList(1, 3));

    System.out.println(list.indexOf("123"));

    //List<> is an Interface implemented by ArrayList.class
    List<String> strings2 = new ArrayList<>();

    
    ArrayList<Integer> array = new ArrayList<>();

    System.out.println(array.toArray(new Integer[array.size()]));

    System.out.println("-----------");
    
    System.out.println(list.contains("123"));
    if (list.contains("123")) {
      System.out.println(list);
    }

    if (!list.isEmpty()) {
      System.out.println("list = " + list);
    }
    
    List<Integer> arrayList2 = new ArrayList<>(List.of(1,2,3,4,5));
    List<Integer> arrayList3 = List.of(3,1,2,4);

    arrayList2.add(5);//have Object
    //arrayList3.set(2, 5);//UnsupportedOperationException
    //arrayList3.add(3);//runtime error,UnsupportedOperationException.
    
    //
    ArrayList<String>  names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");

    Iterator<String> namesIterator = names.iterator();

    while (namesIterator.hasNext()) {
      System.out.println(namesIterator.next());
    }

    while (namesIterator.hasNext()) {
      String str = namesIterator.next();
      if (str == "Bob") {
        System.out.println("===" + namesIterator);
        namesIterator.remove();
      }
    }

    System.out.println("============");
    while (namesIterator.hasNext()) {
      System.out.println(namesIterator.next());
    }
  }
}
