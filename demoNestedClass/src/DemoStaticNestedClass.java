package demoNestedClass.src;

public class DemoStaticNestedClass {
  public static class Calculator {
    
    private int x;

    public int add(int y){
      return this.x + y;
    }

    public Calculator(int x){
      this.x = x;
    } 
  }

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator(5);
    
    System.out.println(c.add(5));
    
  }
}
