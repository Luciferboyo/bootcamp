package demoInterface.src;

public class Taxi implements Vehicle {//Class Signature
  
  private int speed;

  private int capacity;

  public static final int MAX_SPEED = 100;

  public static Taxi small(){
    return new Taxi(0, 4);
  }

  public static Taxi big(){
    return new Taxi(0, 5);
  }

  private Taxi(int speed, int capacity){
    this.speed = speed;
    this.capacity = capacity;
  }

  public Taxi(){

  }

  //get or set

  public int getSpeed(){
    return this.speed;
  }

  public int getCapacity(){
    return this.capacity;
  }

   public void setSpeed(int speed){
    this.speed = speed;
  }

  public void setCapacity(int capacity){
    this.capacity = capacity;
  }

  public boolean isOn(){
    return this.speed > 0;
  }

  public boolean isStopped(){
    return this.speed == 0;
  }

  public boolean isOverMaxSpeed(){
    return this.speed > MAX_SPEED;
  }

  @Override //Let the compiler to validate the relationship of inheritance
  public boolean start() {
    if(isOn())
    return false;
    
    this.speed = 10;
    return true;
  }

  @Override
  public boolean stop() {
    if (isStopped()) {
      return false;
    }
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate() {
    if (isStopped()) {
      return false;
    }
    this.speed += 10;
    if (isOverMaxSpeed()) {
      this.speed = MAX_SPEED;
    }
    return true;
  }

  @Override
  public boolean brake() {
    if (isStopped()) {
      return false;
    }
    if (this.speed < 10) {
      this.speed = 0;
    }
     this.speed -= 10;
     return true;
  }

  public static void main(String[] args) {
    
    Taxi taxi = Taxi.big();

    System.out.println(taxi.getSpeed());

    System.out.println(taxi.getCapacity());

    taxi.accelerate();

    System.out.println(taxi.getSpeed());

    taxi.brake();

    System.out.println(taxi.getSpeed());

    taxi.stop();

    System.out.println("taxi is stop, it's speed is " + taxi.getSpeed());

    System.out.println("--------------");

    System.out.println(Vehicle.x);
  }
}
