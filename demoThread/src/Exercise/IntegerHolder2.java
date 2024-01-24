package demoThread.src.Exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerHolder2 {
  AtomicInteger integer = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException{
    IntegerHolder2 holder = new IntegerHolder2();
    Runnable task = ()->{
      for(int i = 0;i < 10000; i++){
        holder.integer.incrementAndGet();
      }
    };

    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println(holder.integer);
  }
}
