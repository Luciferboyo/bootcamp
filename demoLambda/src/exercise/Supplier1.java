package demoLambda.src.exercise;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class Supplier1 {
  public static void main(String[] args) {
    Supplier<Integer> randomInteger = ()->new Random().nextInt(10)+1;//1-10
    System.out.println(randomInteger.get());

    Supplier<LocalDate> dateOfToday = ()->LocalDate.now();
    System.out.println(dateOfToday.get());
  }
}
