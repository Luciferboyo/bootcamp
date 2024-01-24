package demoMethodReference.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
  public static void main(String[] args) {
    //Instance Method
    List<String> strings = new ArrayList<>(List.of("ijk","def","abc"));

    strings.stream().forEach(e->System.out.println(e));

    //length()
    List<Integer> strLengths = strings.stream().map(String::length).collect(Collectors.toList());
    
    System.out.println(strLengths);
    //method reference:alternative as a lambda expression
    strings.stream().forEach(System.out::println);

    List<String> listStr = strings.stream().sorted(String::compareTo).collect(Collectors.toList());

    System.out.println(listStr);

    List<String> sortedList = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    System.out.println(sortedList);
    
  }
}
