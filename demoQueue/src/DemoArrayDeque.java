package demoQueue.src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import javax.xml.namespace.QName;

public class DemoArrayDeque {
  public static void main(String[] args) {
    Queue<String> qs = new ArrayDeque<>();

    qs.add("JJJ");
    qs.add("KKK");
    System.out.println(qs.peek());

    Deque<String> ds = new ArrayDeque<>();
    ds.addFirst("ABC");
    ds.addFirst("DEF");
    ds.addFirst("HIJ");
    
    ds.removeLast();
    System.out.println(ds.peekLast());

  }
}
