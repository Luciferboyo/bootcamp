package demoThread.src.Exercise;

public class ThreadInfoPrinter {
  public synchronized void threadInfo(){
    Thread currentThread = Thread.currentThread();
    long threadId = currentThread.getId();
    String threadName = currentThread.getName();
    int ThreadInfoPrinter = currentThread.getPriority();

    System.out.println("Thread ID:"+threadId);
    System.out.println("Thread Name:"+threadId);
    System.out.println("Thread Priority:"+ThreadInfoPrinter);
    for(int i = 1;i <= 5;i++){
      System.out.println(threadName+":"+i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    ThreadInfoPrinter printer = new ThreadInfoPrinter();

    Thread thread1 = new Thread(()->{
      printer.threadInfo();
    });

    Thread thread2 = new Thread(()->{
      printer.threadInfo();
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
