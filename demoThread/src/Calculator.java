package demoThread.src;

public class Calculator {
  
  private int x;



  public synchronized void increment(){
    this.x++;
  }

  public void increment2(){
    this.x++;
  }
  public synchronized void decrease(){
    this.x--;
  }

  public void decrease2(){
    this.x--;
  }
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    
    //expection 1:
    Thread vincent = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.increment();
      }
    });

    Thread oscar = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.increment();
      }
    });

    vincent.start();
    oscar.start();

    try{
      vincent.join();
      oscar.join();
    }catch(InterruptedException exception){
      exception.printStackTrace();
    }

    System.out.println("calculator.x="+calculator.x);//20000
    
    //expection 2:
    calculator.x = 0;

    vincent = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.increment2();
      }
    });

    oscar = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.increment2();
      }
    });
    
    vincent.start();
    oscar.start();

    try{
      vincent.join();
      oscar.join();
    }catch(InterruptedException exception){
      exception.printStackTrace();
    }
    System.out.println("calculator.x="+calculator.x);

    //expection 3:
     calculator.x = 0;

    vincent = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.increment();
      }
    });

    oscar = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.decrease();
      }
    });
    
    vincent.start();
    oscar.start();

    try{
      vincent.join();
      oscar.join();
    }catch(InterruptedException exception){
      exception.printStackTrace();
    }
    System.out.println("calculator.x="+calculator.x);

    //expection 4:
     calculator.x = 0;

    vincent = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.increment2();
      }
    });

    oscar = new Thread(()->{
      for(int i = 0;i < 10000;i++){
        calculator.decrease();
      }
    });
    
    vincent.start();
    oscar.start();

    try{
      vincent.join();
      oscar.join();
    }catch(InterruptedException exception){
      exception.printStackTrace();
    }
    System.out.println("calculator.x="+calculator.x);
  }
}
