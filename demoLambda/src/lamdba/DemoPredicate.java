package demoLambda.src.lamdba;

import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    int age = 17;
    boolean isAdult = age >= 18;
    System.out.println(isAdult);

    Predicate<Integer> isAdult2 = x -> x >=18;
    System.out.println(isAdult2.test(18));
    System.out.println(isAdult2.test(19));
    System.out.println(isAdult2.test(17));
    System.out.println("-------------------");
    Predicate<Integer> isEven = num -> num % 2 == 0;
    System.out.println(isEven.test(12));
  }
}
