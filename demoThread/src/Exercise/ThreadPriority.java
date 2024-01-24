package demoThread.src.Exercise;

public class ThreadPriority {
  public static void main(String[] args) {
    Thread thread1 = new Thread(()->{
      //Thread logic
      System.out.println("Thread.MIn_PRIORITY");
    });

    Thread thread2 = new Thread(()->{
      System.out.println("Thread.MAX_PRIORITY");
    });

    thread1.setPriority(1);
    thread2.setPriority(5);

    thread1.start();
    thread2.start();

  }
}
