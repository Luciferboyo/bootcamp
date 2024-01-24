package demoThread.src.Exercise;

class ShareResource{
  private boolean hasData = false;//No data by default

  public synchronized void produce() throws InterruptedException{
    while (hasData) {
      wait();//wait for the consumer to consume
    }

    System.out.println("Producing data...");
    Thread.sleep(1000);
    hasData = true;

    notify();
  }

  public synchronized void consume() throws InterruptedException{
    while (!hasData) {
      wait();//Wait for the produce to produce
    }

    System.out.println("Consuming data...");
    Thread.sleep(1000);//Simulate some processing
    hasData = false;

    notify();//Notify the waiting producer
  }
}



public class WaitNotifyExample {
  public static void main(String[] args) {
    ShareResource shareResource = new ShareResource();
    
  }
}
