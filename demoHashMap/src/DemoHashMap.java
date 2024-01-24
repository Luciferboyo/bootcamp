package demoHashMap.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import demoArrayList.src.Author;

public class DemoHashMap {
  public static void main(String[] args) {
    
    List<String> strings = new ArrayList<>();

    //Map
    //1.key value pair -> <key,value>
    //2.key must be unique

    Map<String,Integer> ageBook = new HashMap<>();

    ageBook.put("John", 20);
    ageBook.put("John", 13);
    ageBook.put("Mary", 20);
    System.out.println(ageBook.size());
    
    for(Map.Entry<String,Integer>entry:ageBook.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }

    //get()
    System.out.println(ageBook.get("John"));

    //Map<Integer,String>

    Map<Integer,String> peopleBox = new HashMap<>();
    peopleBox.put(24, "bobo");
    peopleBox.put(24, "boby");
    peopleBox.put(25, "bb");

    for(Map.Entry<Integer,String>entry:peopleBox.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
    peopleBox.remove(24);

    System.out.println(peopleBox.containsKey(25));
    System.out.println(peopleBox.containsValue("BB"));

    System.out.println("peopleBox.isEmpty() = " + peopleBox.isEmpty());

    System.out.println("size = "+peopleBox.size());

    peopleBox.clear();
    System.out.println(peopleBox.isEmpty());
    
    System.out.println("---------------");
    peopleBox.put(24,"11");
    peopleBox.put(25,"11");
    peopleBox.put(26,"11");
    Collection<String> value = peopleBox.values();
    System.out.println(value);

    Map<Author,Book> books = new HashMap<>();
    Book book1 = new Book("Alexandre Dumas","The Three Musketeers");
    Book book2 = new Book("Hawking","Brief History of Time");
    Book book3 = new Book("Lao She","Camel Xiangzi");
    Author author1 = new Author("Alexandre Dumas");
    books.put(author1, book1);
    books.put(new Author("Hawking"), book2);
    books.put(new Author("Lao She"), book3);

    for (Map.Entry<Author,Book> book : books.entrySet()) {
      System.out.println("Author = "+book.getKey()+","+"BookName = "+book.getValue());
    }

    System.out.println(books.putIfAbsent(author1, book3));
    System.out.println(books.size());

    books.remove(author1);
    System.out.println(books.size());

    books.put(author1,book2);

    System.out.println(books.get(author1));

    String[] s = new String[]{"a","b"};

    StringBuilder sb = new StringBuilder();
    
    
  }
}
