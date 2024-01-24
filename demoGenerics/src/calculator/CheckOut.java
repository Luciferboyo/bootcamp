package demoGenerics.src.calculator;
import java.util.*;

public class CheckOut {
  //call ()
  //Force the method caller to pass an object implementing Adjustment interface
  double total = 0.0d;

  public static <T>double calculate(List<T> items,double adjustment){
    double d = 0.0d;
    for(T item: items){
      d += items.size();
    }
    return d;
  }
  
}
