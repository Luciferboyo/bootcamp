package demoStream.src.exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import demoClass.src.animal.Dog;

public class ExerciseStream {
  public static void main(String[] args) {

    Stream<String> empty = Stream.empty();
    
    empty = Stream.of("hello");

    empty = Stream.of("hello","world");

    List<String> list = Arrays.asList("a","b","c");

    empty = list.stream();

    Stream<Double> radoms = Stream.generate(Math::random);

    List<Double> randomNumbers = radoms.limit(3).collect(Collectors.toList());

    System.out.println("randomNumbers="+randomNumbers);

    Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2);

    List<Integer> firstTenOddNumbers = oddNumbers.limit(10).collect(Collectors.toList());

    System.out.println(firstTenOddNumbers);

    firstTenOddNumbers.forEach(System.out::println);

    List<String> names = Arrays.asList("Peter","Paul","Mary","Peter");

    long count = names.stream().distinct().count();
    
    System.out.println(count);


    //the second part
    List<String> nameList = Arrays.asList("Peter","Carl","Benny","Alex");

    //filtering
    //toList()->No changes can be made
    List<String> filteredNames1 = nameList.stream().filter(name->name.contains("A")).toList();    
    //collect(Collectors.toList())->
    List<String> filteredNames2 = nameList.stream().filter(name->name.contains("A")).collect(Collectors.toList());

    System.out.println(filteredNames1);

    System.out.println(filteredNames2);

    List<String> mapNames = nameList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
    
    System.out.println( mapNames);

    List<String> sortedName = nameList.stream().sorted().collect(Collectors.toList());

    System.out.println(sortedName);

    boolean hasAlex = nameList.stream().anyMatch(name->name.contains("Alex"));

    System.out.println(hasAlex);

    List<Integer>numbers = Stream.iterate(1, n->n + 2).limit(5).collect(Collectors.toList());

    numbers.forEach(System.out::println);
    System.out.println("----------------");

    Integer reduced1 = numbers.stream().reduce(10, (a,b)->a+b);

    List<Integer> numList = Arrays.asList(1,2,3,4);

    Optional<Integer> reduce1 = numList.stream().reduce((a,b)->a+b);

    System.out.println(reduce1);

    System.out.println(reduced1);

    List<Integer> num = Arrays.asList(992,132156,1111,1567);

    Optional<Integer> optional = num.stream().max((o1,o2)->o1.compareTo(o2));

    optional.ifPresent(System.out::println);
  }
}
