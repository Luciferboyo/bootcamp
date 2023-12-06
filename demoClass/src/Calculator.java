package demoClass.src;

import java.math.BigDecimal;

public class Calculator {
  
  private BigDecimal x;

  private BigDecimal y;

  public Calculator(BigDecimal x,BigDecimal y){
      this.x = x;
      this.y = y;
  }
  
  public double add(){//0.2+0.1=0.3
    return x.add(y).doubleValue();
  }

  public double subtract(){//0.2-0.1=0.1
    return x.subtract(y).doubleValue();
  }
  
  public static Calculator of(double x,double y){
    return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
  }



  @Override
  public String toString() {
    return "BigDecimal x = " + x.doubleValue() + " ,BigDecimal y = " + y.toString();
  }
  public static void main(String[] args) {
    Calculator calculator = new Calculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));
    
    Calculator calculator2 = Calculator.of(0.2, 0.1);


    System.out.println(calculator);

    System.out.println(calculator2.subtract());//0.1

    

  }
}
