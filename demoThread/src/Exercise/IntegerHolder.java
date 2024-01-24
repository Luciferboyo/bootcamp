package demoThread.src.Exercise;

public class IntegerHolder {
  int integer = 0;
  public static void main(String[] args)throws InterruptedException{
    IntegerHolder holder = new IntegerHolder();

    Runnable increment = () ->{
      for(int i = 0;i < 10000;i++){
        holder.integer++;
      }
    };

    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
    System.out.println(holder.integer);
  }
}
