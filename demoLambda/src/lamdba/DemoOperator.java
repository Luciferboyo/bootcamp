package demoLambda.src.lamdba;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoOperator {
  public static void main(String[] args) {
    //first
    BinaryOperator<String> concatStrings = (s1,s2)->s1.concat(s2);
    //second
    BiFunction<String,String,String> concatStrings2 = (s1,s2)->s1.concat(s2);
    
    UnaryOperator<String> unaryOperator = String::toLowerCase;
  }
}
