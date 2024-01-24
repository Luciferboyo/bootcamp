package demoPrimitiveConv.demoStack.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoStack {

  public static void main(String[] args) {
    //LIFO-Stack
    List<String> stack = new Stack<>();

    Stack<String> stack2 = new Stack<>();
    //1.If we use as reference type,the obj ref has no push() and pop() scope
    stack2.push("ABC");
    stack2.push("DEF");
    

    System.out.println(stack2.pop());//DEF
    System.out.println(stack2.pop());//ABC

    //2.You can access the middle element
    
    //3.Slow  
    
    //Stack
    //add
    long statr = System.nanoTime();
    for(int i = 0;i < 5000;i++){
      stack2.add("A");
    }
    long end = System.nanoTime();
    System.out.println("Stack's time is "+(end - statr));

    List<String> arrayList = new ArrayList<>();
    long statrArr = System.nanoTime();
    for(int i = 0;i < 5000;i++){
      arrayList.add("A");
    }
    long endArr = System.nanoTime();

    System.out.println("ArrayList's time is "+(endArr - statrArr));

    LinkedList<String> linkList = new LinkedList<>();
    long statrLinked = System.nanoTime();
    for(int i = 0;i < 5000;i++){
      linkList.add("A");
    }
    long endLinked = System.nanoTime();
    System.out.println("LinkedList's time is "+(endLinked - statrLinked));
    //remove
    System.out.println("remove-----------------------");
    statr = System.nanoTime();
    for(int i = 0;i < 5000;i++){
      stack2.remove(i);
    }
    end = System.nanoTime();
    System.out.println("Stack's remove time is "+(end - statr));

    
    statrArr = System.nanoTime();
    for(int i = 0;i < 5000;i++){
      arrayList.remove(i);
    }
    endArr = System.nanoTime();
    System.out.println("ArrayList's remove time is "+(endArr - statrArr));

   
    statrLinked = System.nanoTime();
    for(int i = 0;i < 5000;i++){
      linkList.remove(i);
    }
    endLinked = System.nanoTime();
    System.out.println("LinkedList's remove time is "+(endLinked - statrLinked));


  }
}
