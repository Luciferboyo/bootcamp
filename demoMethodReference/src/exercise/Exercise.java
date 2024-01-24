package demoMethodReference.src.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;;

public class Exercise {
  
  public static void main(String[] args) {
    
    List<Integer> numbers = Arrays.asList(1,2,3,4);

    Consumer<Integer> sysout = System.out::println;
    
    numbers.forEach(sysout);

    //hello's length
    String name = "hello";

    Supplier<Integer> lengthSupplier = name::length;

    int length = lengthSupplier.get();

    System.out.println(length);

    //Reference to an Instance Method of an Arbitrary Object of a Particular Type
    List<String> words = Arrays.asList("banana","cherry","apple");
    Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
    words.sort(compareToIgnoreCase);
    System.out.println(words);

    //Reference to a Constructor
    Function<String,Integer> stringToInteger = Integer::valueOf;
    Integer number = stringToInteger.apply("123");
    
    System.out.println(number);
  }
}
