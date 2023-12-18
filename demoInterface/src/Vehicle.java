package demoInterface.src;

public interface Vehicle {//"Vehicle" is an abstract word
  
  //interface is a contract with 100% abstract behaviors(abstract methods)

  //if a class implements an interface, it has to implement all its abstract methods

  //methods(all or nothing)
  
  int x = 10;//implicitly static final

  boolean start();//implicitly publice abstract method

  boolean stop();

  boolean accelerate();

  boolean brake();

  //After Java 8
  //default instance method - backward compatibility
  default boolean test(){
    return false;
  };
}
