package demoInheritance.src;

public class Square extends Shape{
  
  private int length;

  public Square(int length){
    this.length = length;
  }

  @Override
  double area() {
    // TODO Auto-generated method stub
    return Math.pow(this.length, 2);
  }
}
