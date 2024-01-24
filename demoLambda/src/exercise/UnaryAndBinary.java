package demoLambda.src.exercise;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinary {
  public static void main(String[] args) {
    UnaryOperator<String> strUpperCase = String::toUpperCase;
    System.out.println(strUpperCase.apply("rar"));//RAR

    BinaryOperator<String> strConcat = String::concat;
    System.out.println(strConcat.apply("abc", "bfg"));//abcdfg
  
    
  }
}
