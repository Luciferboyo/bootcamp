package demoLambda.src.exercise;
import java.lang.FunctionalInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface MathOperation{
  int compute(int a,int b);

  default  String method(){
    return "abc";
  }
}

@FunctionalInterface
interface ChatBox{
  void speak(String message);
}


public class MathOperationTester {
  private static int calculate(int a,int b,MathOperation op){
    return op.compute(a, b);
  }


  public static void main(String[] args) {
    MathOperation math = new MathOperation() {
      @Override
      public int compute(int a, int b) {
        return a - b;
      }
    };
    MathOperation subtration = (int a,int b) -> a-b;

    MathOperation addtion = (a,b)->a+b;

    MathOperation multiplication = (int a,int b) -> { return a*b; };

    System.out.println("subtration:"+calculate(12,4,subtration));

    System.out.println("addtion:"+calculate(12,4,addtion));

    System.out.println("multiplication:"+calculate(12,4,multiplication));
    
    ChatBox chatBox1 = message -> System.out.println("Hello " + message);
    
    ChatBox chatBox2 = message -> System.out.println("Goodbye " + message);

    chatBox1.speak("Peter");

    chatBox2.speak("Mary");

    Map<String,Integer> nameLengthMap = new HashMap<>();

    Function<String,Integer> computeLength = t -> t.length();

    Integer computedValue = nameLengthMap.computeIfAbsent("Peter",computeLength);

    System.out.println("----------");

    System.out.println(computedValue);

    Map<String,Integer> nameFrequencyMap = new HashMap<>();

    nameFrequencyMap.put("Peter", 2);

    BiFunction<Integer,Integer,Integer> megeFunctionByName = (x,y)->x*y;

    Integer mergedValue = nameFrequencyMap.merge("Peter", 3, megeFunctionByName);

    System.out.println(mergedValue);

    System.out.println(nameFrequencyMap);
    
    System.out.println(nameLengthMap);

    
  }
}
