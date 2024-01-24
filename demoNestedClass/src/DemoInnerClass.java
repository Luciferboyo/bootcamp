package demoNestedClass.src;

public class DemoInnerClass {

  private Calculator calculator;

  public void setCalculator(Calculator calculator){
    this.calculator = calculator;
  }

  public class Calculator{//Inner Class
    
    public Calculator(){
      
    }
    
  }

  public static void main(String[] args) {
    DemoInnerClass d = new DemoInnerClass();
    DemoInnerClass.Calculator c1 = d.new Calculator();
    DemoInnerClass.Calculator c2 = new DemoInnerClass().new Calculator();

    c1 = c2;
  }
}
