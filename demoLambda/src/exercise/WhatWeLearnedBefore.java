package demoLambda.src.exercise;

/**
 * before
 */
interface Age{
  int x = 21;
  void getAge(); 
  //default or/and static method .. which include implementation
}

public class WhatWeLearnedBefore implements Age{
  @Override
  public void getAge() {
    System.out.println("Age is "+x);//implementation
  }
  public static void main(String[] args) {
    WhatWeLearnedBefore obj = new WhatWeLearnedBefore();
    obj.getAge();

    FunctionalInterface1 fobj = (int x)  ->{
      System.out.println(2*x);
    };

    fobj.getAge(x);//10
    fobj.sayHello();
  }
}

interface FunctionalInterface1{
  void getAge(int a);

  default void sayHello(){
    System.out.println("Hello");
  }
}


 class Dog implements FunctionalInterface1{

  String name;

  @Override
  public void getAge(int x) {
    System.out.println(2*x);
  }

}