package demoLambda.src;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
  
  public static void main(String[] args) {
    Supplier<Integer> radomInteger = ()->new Random().nextInt(100)+1;//1-100

    System.out.println(radomInteger.get());
    
  }
}
