package demoThread.src.Exercise;

public class ThreadJoining {
  public static void main(String[] args) {
    Thread thread1 = new Thread(()->{
      for(int i = 0;i<1000;i++){
        if (i==500) {
          System.out.println("i==500");
        }
      }
      System.out.println("thread i end...");
    });

    Thread thread2 = new Thread(()->{
      for(int i = 0;i<1000;i++){
        if (i==500) {
          System.out.println("j==500");
        }
      }
      System.out.println("thread j end...");
    });
    thread1.start();
    
    try {
      thread1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread2.start();
  }
}
