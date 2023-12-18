package demoInterface.src;

public class Bus implements Vehicle{

  private int speed;

  private int capacity;

  public static final int MAX_SPEED = 100;

  private Bus(int speed, int capacity){
    this.speed = speed;
    this.capacity = capacity;
  }

  public Bus(){

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

  @Override
  public boolean test() {
    return true;
  }
  //....

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
}
