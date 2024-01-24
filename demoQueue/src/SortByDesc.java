package demoQueue.src;

import java.util.Comparator;

public class SortByDesc implements Comparator<String>{
  
  @Override
  public int compare(String o1, String o2) {
    System.out.println("compare "+o1+" "+o2);
    return o1.compareTo(o2) > 0 ? -1:1;
    
  }
}
