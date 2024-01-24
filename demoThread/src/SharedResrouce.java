package demoThread.src;

public class SharedResrouce {
  
  //1.both 2 thread starts at the same time
  //2.consume() while loop (fulfull -> wait())
  //3.produce() while loop (not fulfill -> produce data -> notify)
  //4.after producer calling the notify(),consumer thread will resume(Producer thread -> producing the data -> notify(叫醒other threads))
  //5.Producer thread -> wait()-> release the lock
  //6.Consumer thread -> get the lock -> get into "synchronized consume()";

  //1.waiting thread has to be notified by someon
  //2.synchronized instance method can only be accessed when the thread has the key(lock)
  private boolean hasData =  false;//Shared Resource

  public synchronized void produce() throws InterruptedException{
    while (hasData) {
      wait();
    }
    System.out.println("Thread ID:"+Thread.currentThread().getId()+",Producing data...");
    Thread.sleep(2000);//simulate produce process
    hasData = true;
    System.out.println("Produced Data.");
    notify();
  }

  public synchronized void consume() throws InterruptedException{
    while (!hasData) {
      wait();//Object.wait() notify()
    }
    System.out.println("Thread ID:"+Thread.currentThread().getId()+",Consuming data...");
    Thread.sleep(2000);//simulate produce process
    hasData = false;
    System.out.println("Consume Data.");
    notify();
  }

  public static void main(String[] args) {
    
    SharedResrouce sharedResrouce = new SharedResrouce();

    Runnable producerData = ()->{
      try {
        while (true) {
          sharedResrouce.produce();
        }
      } catch (InterruptedException e) {
        
      }
    };

    Runnable consumeData = ()->{
      try {
        while (true) {
          sharedResrouce.consume();
        }
      } catch (InterruptedException e) {
        
      }
    };

    Thread producer = new Thread(producerData);
    Thread consumer = new Thread(consumeData);

    producer.start();
    consumer.start();



  }
}
