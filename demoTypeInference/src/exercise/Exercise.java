package demoTypeInference.src.exercise;


import java.util.List;

public class Exercise {
  public static void main(String[] args) {
    var age = 25;
    var name = "John";
    printVariableType(age);
    printVariableType(name);

    //var -> List
    List<String> names = List.of("Alice","Bob","Charlie");
    for(var n: names){
      printVariableType(n);
      System.out.println(n);
    }
    System.out.println("--------------------");
    Runnable runnable = ()->System.out.println("Hello,World!");
    var runnable2 = (Runnable)()->System.out.println("Hello,World!");

    var sum = sum(1, 2);

    var point = new Point(sum);

    
  }


  public static void printVariableType(Object value){
    System.out.println("Variable type: " + value.getClass().getName());
  }

  public static int sum(int x,int y){
    return x+y;
  }
}
