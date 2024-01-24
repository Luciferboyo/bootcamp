package demoGenerics.src.calculator;

public class Book implements Adjustment{
  
  private int y;

  @Override
  public double adjust(double x) {
    
    return x * y;
  }
}
