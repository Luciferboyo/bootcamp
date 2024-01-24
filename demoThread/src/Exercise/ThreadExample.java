package demoThread.src.Exercise;

class MyThread extends Thread{
  public void run(){
    for(int i = 0;i < 5;i++){
        System.out.println("Thread:"+i);
    }
  }
}

class Task implements Runnable{
  public void run(){
    for(int i = 0; i < 5;i++){
      System.out.println("Thread:"+i);
    }
  }
}

public class ThreadExample {
  public static void main(String[] args) {
    //number 1 
    MyThread thread = new MyThread();
    thread.start();
    System.out.println("---------");

    //number  two: By Class
    Task task = new Task();
    Thread thread2 = new Thread(task);
    thread2.start();

    //number three:By Lambda;
    Runnable task2 = ()->{
      for(int i = 0;i < 5;i++){
        System.out.println("Thread:"+i);
      }
    };
    Thread thread3 = new Thread(task2);
    thread3.start();
  }
}
