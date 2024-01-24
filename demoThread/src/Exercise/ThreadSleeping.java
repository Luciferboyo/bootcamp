package demoThread.src.Exercise;

public class ThreadSleeping {
  public static void main(String[] args) {
    Thread thread1 = new Thread(()->{
      for(int i = 0;i<5;i++){
        
      }
      System.out.println("Hello,World!");
    });
    thread1.start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("helo,world");
  }
}
