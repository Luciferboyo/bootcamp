package demoQueue.src;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {

    SortByDesc desc = new SortByDesc();
    Queue<String> qs = new PriorityQueue<>(desc);
    
    qs.add("hello");
    qs.add("a");
    qs.add("x");
    
    while (!qs.isEmpty()) {
      System.out.println(qs.poll());
    }
  }
}
