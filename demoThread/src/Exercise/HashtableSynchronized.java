package demoThread.src.Exercise;

import java.util.Hashtable;

public class HashtableSynchronized {
  Hashtable<String,Integer> table = new Hashtable<>();

  public static void main(String[] args){

    HashtableSynchronized object = new HashtableSynchronized();

    Runnable dummyEntry = ()->{
      for(int i = 0;i < 10000; i++){
        object.table.compute("dummy", (key,old)->(old == null)?1:old+1);
      }

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
    
    System.out.println(object.table.get("dummy"));
  }
}
