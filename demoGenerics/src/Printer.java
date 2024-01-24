package demoGenerics.src;

import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> {
  
  private List<T> value;

  public Printer(T[] value){
    this.value = new ArrayList<>();
  }
  
  

  public static void main(String[] args) {
    Integer[] integer = new  Integer[]{1,2,3,4};
    Printer<Integer>integerPrinter1 = new Printer<Integer>(integer);

    Double[] doubles = new Double[]{1.1,2.2,3.3};
    Printer<Double>integerPrinter2 = new Printer<Double>(doubles);
  }

  

  //public staic Double calculate(Number u1,Number u2){}//Same signature as the below method

  public static<U extends Number>U calculate(U u1,U u2){
    if (u1 instanceof Integer && u2 instanceof Integer) {
      return (U) Integer.valueOf(u1.intValue() + u2.intValue());
    }else if (u1 instanceof Double && u2 instanceof Double) {
      return (U) Double.valueOf(u1.doubleValue() + u2.doubleValue());
    }else if (u1 instanceof Float && u2 instanceof Float) {
      return (U) Float.valueOf(u1.floatValue() + u2.floatValue());
    }else {
      throw new IllegalArgumentException("Unsupported Number type");
    }
  }
}
