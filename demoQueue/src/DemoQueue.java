package demoQueue.src;

import java.util.List;
import java.util.Queue;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;


public class DemoQueue {
  
  public static void main(String[] args) {
    
    List<String> strings = new LinkedList<>();

    strings.add("ABC");
    strings.add("IJK");
    strings.remove(0);

    //List vs Queue
    //1.We cannot access the middle elements in the queue.Just get the object from queue head
    //2.Queue is FIFO(First in First out)
    Queue<String> qs = new LinkedList<>();
    qs.add("ABC");
    qs.add("IJK");

    String queue = qs.poll();
    System.out.println(qs.poll());
    System.out.println(qs.size());

    Deque<String> deque = new LinkedList<>();
    deque.add("11");
    deque.add("12");
    deque.add("13");

    ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
    arrayDeque1.addFirst(10);//10
    arrayDeque1.add(9);//10,9
    arrayDeque1.add(8);//10,9,8
    arrayDeque1.addFirst(7);//7,10,9,8
    arrayDeque1.addFirst(5);//5,7,10,9,8
    arrayDeque1.addFirst(4);//4,5,7,10,9,8
    System.out.println("--------------------");
    arrayDeque1.remove();//remove 4
    System.out.println("removeFirst = "+arrayDeque1.removeFirst());//5
    arrayDeque1.removeLast();//8
    System.out.println("poll = " + arrayDeque1.poll());//remove first value and return first value
    System.out.println(arrayDeque1.peek());
    System.out.println();
    Iterator<Integer> iterator = arrayDeque1.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    arrayDeque1.offerFirst(null);
  }
}
