package demoLambda.src;

public class Demo {
  public static void main(String[] args) {
    //Inner Class
    Walkable person = new Walkable() {
      @Override
      public void walk() {
        System.out.println("walking..");
      }
    };
    person.walk();//walking..
    
    //Lambda Expression
    //1.We don't need to write down method signature for the walk() method.why?
    //because the interface has only one method,so compiler knows the code block must refer to the 
    //2."()" is the input parameters of the walk method
    //3.As walk method is void return type, you don't have to return anything inside the code block
    //4.Limitation:It can only be used when there is ONLY ONE method in interface(FunctionalInterface)//this is somthing like "@Override"
    //5.if there is only one statement inside the code block,don't need to add{} and return;
    //6.Don't need to specify the parameter types
    Walkable person2 = () -> {
      System.out.println("hello");
    };
    person2.walk();
    //Approach 2 to handle one code statement
    Calculable calculable = (a,b) -> a+b;

    System.out.println(calculable.compute(10, 2));
    //Approach 2 to handle one code statement
    Calculable multiply = (price,quantity) ->price*quantity;

    System.out.println(multiply.compute(300, 100));
  }

}
