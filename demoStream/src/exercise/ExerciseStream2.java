package demoStream.src.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ExerciseStream2 {
  public static void main(String[] args) {
    
    Stream<String> animals = Stream.of("lions","tigers","bearss");

    Map<String,Integer> map = animals.collect(Collectors.toMap(s->s,String::length));

    System.out.println(map);
    //groupingBy
    Stream<String> animals2 = Stream.of("lions","tigers","bearss");

    Map<Integer,List<String>> groupedByLength = animals2.collect(Collectors.groupingBy(String::length));

    System.out.println(groupedByLength);

    System.out.println("---------");
    //partitioningBy
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
    
    Map<Boolean,List<Integer>> partitionedNumbers = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));

    System.out.println(partitionedNumbers);

    Stream.of(1,2,3).map(i->{
      System.out.println(i);
      return i;
    });

    long streamCount = Stream.of(1,2,3).map(i -> {
      System.out.println(i);
      return i;
    }).count();

    System.out.println(streamCount);

    String s = "ss";
    s.replace("i", "");
    s.lastIndexOf('i');
    char[] c = s.toCharArray();

    String.valueOf(c);

    
  }
}
