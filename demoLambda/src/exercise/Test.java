package demoLambda.src.exercise;

import java.util.Arrays;
import java.util.List;

interface FunctionalInterface{
  int sum(int a,int b);
}

interface interfaceName{
  String print(int x);
}

public class Test{
  public static void main(String[] args) {
    FunctionalInterface fobj = (a,b) ->{
      int c = a + b;
      return c/2;
    };

    FunctionalInterface fobj2 = (a,b) -> (a+b)/2;

    List<String> names = Arrays.asList("Peter","Paul","Mary");

    for (String n : names) {
      System.out.println("Hello " + n);
    }

    names.forEach(n->{
      System.out.println("hello "+n);
    });
    interfaceName name = n -> {
      StringBuilder sb = new StringBuilder();
      for(int i = 0;i < n;i++){
        sb.append(i);
        if (i < n - 1) {
          sb.append(",");
        }
      }
      return sb.toString();
    };
  }
}