package demoInheritance.src;

import java.math.BigDecimal;

public final class SuperBigDecimal extends BigDecimal{

  public SuperBigDecimal(double value){
    super(String.valueOf(value));
  }

  public SuperBigDecimal(BigDecimal bigDecimal){
    super(bigDecimal.toString());
  }
  
  public static SuperBigDecimal valueOf(double x){
    return new SuperBigDecimal(x);
  }

  @Override
  public SuperBigDecimal multiply(BigDecimal value) {
    return new SuperBigDecimal(super.multiply(value));
  }

  public static void main(String[] args) {

    SuperBigDecimal sd = new SuperBigDecimal(3.0);

    SuperBigDecimal sd2 = new SuperBigDecimal(3.0);
    SuperBigDecimal sd3 = SuperBigDecimal.valueOf(4.0);

    //3.0*4.0
    SuperBigDecimal sd4 = sd2.multiply(sd3);
    System.out.println(sd4.toString());
 
  }
}
