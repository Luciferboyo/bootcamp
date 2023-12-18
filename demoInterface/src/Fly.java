package demoInterface.src;

public interface Fly {
  
  boolean takeOff(int startingSpeed,int ascentHeight);

  boolean accelerate(int acceleration);

  boolean landing();
  
  boolean slowDown(int speed);

}
