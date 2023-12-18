package demoObject.src;

public class Parent {//extends Object implicitly


  
  public static void main(String[] args) {

    //Example 1: new DemoObject
    Object o1 = new Object();
    System.out.println(o1.toString());

    DemoObject do1 = (DemoObject)o1;//downcast -> runtime error
    //compile time ->do1 is a objcet ref with the type of DemoObject,Able to call run().
    do1.run();
    //runtime -> once do1 found the object (new Object()),there if No run() method.
    //-> error.

    DemoObject do2 = new DemoObject();
    Object o2 = do2;//upcast

    //compile time -> o2 is a object ref with the type of Object.Able to itself method
    //runtime must be Okay if we just use upcast


    //Example 2: new Object()
  }
  
}
