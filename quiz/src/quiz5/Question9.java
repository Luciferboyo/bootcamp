package quiz.src.quiz5;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
  public static void main(String[] args) {
    
    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    //Not called, so not executed
    integers.stream().map(i->{
      System.out.println(i);
      return i+1;
    });//map -> map is an intermediate operation, not the end operation, and is not called

    System.out.println(integers);
  }
}
