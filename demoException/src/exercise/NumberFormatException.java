package demoException.src.exercise;
import java.lang.*;;
public class NumberFormatException{
  public static void main(String[] args) {
    try {
      int num = Integer.parseInt("aa");
      System.out.println(num);
    } catch (java.lang.NumberFormatException e) {
      // TODO: handle exception
      System.out.println("Number format exceptior");
    }
  }
}
