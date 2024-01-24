package demoThread.src.Exercise;

public class StringThreadTest {
  String str = "";

  public static void main(String[] args) {
    StringThreadTest obj = new StringThreadTest();

    Runnable concat = ()->{
      for(int i = 0;i < 100000;i++){
        obj.str = obj.str.concat("s");
      }
    };

    Thread thread1 = new Thread(concat);
    Thread thread2 = new Thread(concat);
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(obj.str.length());
  }
}
