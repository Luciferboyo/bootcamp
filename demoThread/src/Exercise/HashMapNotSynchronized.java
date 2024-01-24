package demoThread.src.Exercise;

import java.util.HashMap;

public class HashMapNotSynchronized {
  HashMap<String,Integer> map = new HashMap<>();
  public static void main(String[] args) {
    HashMapNotSynchronized object = new HashMapNotSynchronized();

    object.map.put("dummy", 0);

    Runnable dummyEntry = ()->{
      for(int i = 0;i < 1000; i++)
        object.map.put("dummy", object.map.get("dummy")+1);
    };

    Thread thread1 = new Thread(dummyEntry);
    Thread thread2 = new Thread(dummyEntry);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(object.map.get("dummy"));
  }
}
