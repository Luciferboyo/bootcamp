package demoNestedClass.src.exercise;

class Parent{
  void read(){
    System.out.println("Parent Class");
  }
}

public class AnonymousInnerClassExample2 {
  public static void main(String[] args) {
    Parent parent = new Parent(){
      @Override
      void read() {
        // TODO Auto-generated method stub
        System.out.println("Anonymous Inner Class for Class Person");
      }
    };
    parent.read();
  }
}
