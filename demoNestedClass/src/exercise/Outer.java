package demoNestedClass.src.exercise;

public class Outer {
  //Static Nested Class
  private int x = 10;
  private static int y = 100;

  static class StaticNested {
    //does not have access to the instance me
    void display(){
      System.out.println("I am Static Nested Class,static variable="+y);
    }
  }
  public static void main(String[] args) {
    Outer.StaticNested nestedObject = new Outer.StaticNested();
    nestedObject.display();
    Outer outer = new Outer();
    Inner inner = outer.new Inner();
    inner.display();
  }

  class Inner{
    //has access to the instance member of the outer class
    void display(){
      System.out.println("Instance Inner Class,variable="+x);
    }
  }
}
