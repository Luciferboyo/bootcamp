package demoInterface.src;

public class Tiger implements Fly{

  private int high;

  private int flightSpeed;

  public Tiger(){
    this.high = 0;
    this.flightSpeed = 0;
  }
  
  @Override
  public boolean takeOff(int startingSpeed,int ascentHeight) {
    if (!isOnTheGround()) return false;
    this.flightSpeed = startingSpeed;
    this.high = ascentHeight;
    return true;
  }

  @Override
  public boolean accelerate(int acceleration) {
    if (isOnTheGround()) return false;
    this.flightSpeed += acceleration;
    return true;
  }

  @Override
  public boolean landing() {
    if (isOnTheGround()) return false;
    while (high > 0) {
      if (high >= flightSpeed) {
        high -= flightSpeed;
      }else{
        high = 0;
      }
    }
    this.flightSpeed = 0;
    return true;
  }
  
  @Override
  public boolean slowDown(int speed) {
    if(isOnTheGround()) return false;
    this.flightSpeed -= speed;
    return true;
  }

  public boolean isOnTheGround(){
    return this.high == 0;
  }

  public int getHigh(){
    return this.high;
  }

  public int getFlightSpeed(){
    return this.flightSpeed;
  }

  public static void main(String[] args) {
    
    Tiger tiger = new Tiger();

    System.out.println(tiger.takeOff(1,10));
    System.out.println(tiger.getHigh());
    System.out.println(tiger.getFlightSpeed());

    System.out.println(tiger.accelerate(2));

    System.out.println(tiger.getFlightSpeed());

    tiger.slowDown(1);

    System.out.println(tiger.getFlightSpeed());

    System.out.println(tiger.landing());

    System.out.println(tiger.getFlightSpeed());
    System.out.println(tiger.high);
  }
}
