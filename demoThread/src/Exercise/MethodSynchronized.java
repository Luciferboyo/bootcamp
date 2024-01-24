package demoThread.src.Exercise;

public class MethodSynchronized {
  private int count = 0;

  public synchronized void increment(){
    count++;
  }

  public static void main(String[] args) {
    MethodSynchronized object = new MethodSynchronized();

    Runnable increament = ()->{
      for(int i = 0;i < 100000;i++){
        object.increment();
      }
    };

    Thread thread1 = new Thread(increament);
    Thread thread2 = new Thread(increament);

      thread1.start();
      thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException exception) {
      exception.printStackTrace();
    }

    System.out.println(object.count);
  }
}
