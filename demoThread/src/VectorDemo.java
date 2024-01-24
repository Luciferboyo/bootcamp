package demoThread.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
  
  public static void main(String[] args) throws InterruptedException {
    List<String> strings = new Vector<>();

    List<String> arrayList = new ArrayList<>();
    
    Runnable vectorAdd = () -> {
      for(int i = 0;i < 10000;i++){
        strings.add("X");
      }
    };

    Runnable arrayListAdd = () -> {
      for(int i = 0;i < 10000;i++){
        arrayList.add("X");
      }
    };

    Thread thread1 = new Thread(vectorAdd);

    Thread thread2 = new Thread(vectorAdd);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println(strings.size());
    
    Thread thread3 = new Thread(arrayListAdd);

    Thread thread4 = new Thread(arrayListAdd);

    thread3.start();
    thread4.start();

    thread3.join();
    thread4.join();

    System.out.println(arrayList.size());
  }
}
