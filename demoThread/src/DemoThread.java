package demoThread.src;
public class DemoThread {
  //Process?Thread?
  public static void main(String[] args) {//main thread
    
    System.out.println("main Start..");
    
    //Runnable
    Runnable task1 = ()->System.out.println("task 1 running...");

    //Thread
    Thread thread1 = new Thread(task1);
    thread1.start();//main thread spilt itself,another thread is created

    Thread thread2 = new Thread(task1);
    thread2.start();

    for(int i = 0;i < 1000000000;i++){

    }

    CustomThread customThread = new CustomThread();//Your task is already defined in the class
    
    customThread.start();

    System.out.println("main End..");

    try {
      thread1.join();
      thread2.join();
    } catch (Exception e) {//checked exception
      
    }
    
    Thread current = Thread.currentThread();
    System.out.println("Thread ID:"+current.getId()+",Thread Name:"+current.getName());
    System.out.println( "main end...");

  }
}