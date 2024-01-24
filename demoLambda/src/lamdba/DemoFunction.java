package demoLambda.src.lamdba;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  public static void main(String[] args) {
    //f(x) = x + 3;
    //y = x+3;

    //R apply(T t),R - >Integer, T -> String
    Function<String,Integer> stringLength = (str) ->{
      return str.length();//return Intrger object
    };
    System.out.println(stringLength.apply("hello"));//5
    System.out.println(stringLength.apply("abc"));//3

    Function<String,String> str = s -> s.indent(5);
    
    System.out.println(str.apply("hello"));

    BiFunction<Integer,Integer,Integer> sum = (a,b)->a+b;
    System.out.println(sum.apply(5, 4));

    BiFunction<List<String>,Integer,String> getByIndex = (strings,index) -> {
      return strings.get(index);
    };

    //Example for Function
   Map<String,String> map = new HashMap<>();
   map.put("011", "John");
   map.put("012", "Marray");
    BiFunction<String,String,String> reMap = (key,oldValue) ->{
      return oldValue == null ? "hello":oldValue.concat("end");
    };

    map.compute("011", reMap);
    System.out.println(map.get("011"));
  }
}
