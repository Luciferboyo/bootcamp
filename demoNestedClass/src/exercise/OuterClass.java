package demoNestedClass.src.exercise;

public class OuterClass {
  void methodWithLocalInner(){
    int localVar = 5;
    class LocalInner {
      int x;
      public LocalInner(int x){
        this.x = x;
      }

      void display(){
        System.out.println("Local Inner Class:"+localVar+this.x);
      }
    }
    LocalInner localInner = new LocalInner(20);
    localInner.display();
  }

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    outerClass.methodWithLocalInner();
  }
}
