package demoLambda.src.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class ConsumerAndBiConsumer {
  public static void main(String[] args) {
    //Consumer
    List<String> names = Arrays.asList("Peter","Paul","Mary");

    Consumer<String> printName = (name)->System.out.println("name = "+name);

    printName.accept("hello");

    names.forEach(printName);

    //BiConsumer
    Map<String,Integer> ages = new HashMap<>();

    ages.put("Peter", 23);
    ages.put("Mary", 24);
    ages.put("James", 25);

    BiConsumer<String,Integer> printNameAndAge = 
        (name,age)->System.out.println("name="+name+",age="+age);

    ages.forEach(printNameAndAge);

    List<String> nameList = Arrays.asList("Alex","Amy","Ben","Charlotte","Dicky");

    Predicate<String> startWith = name -> name.startsWith("A");
    Predicate<String> lengthLongerThan10 = name -> name.length()>5;
    Predicate<String> elementIsAlex = name -> "Alex".equals(name);

    if (elementIsAlex.test(nameList.get(0))) {
      System.out.println("This is"+ nameList.get(0));
    }

    for (String string : nameList) {
      if (!(lengthLongerThan10.test(string)) && startWith.test(string)) {
        System.out.println(string+" start with A and name's length is < 5");
      }
    }

  }
}
