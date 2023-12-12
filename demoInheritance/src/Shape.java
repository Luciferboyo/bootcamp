package demoInheritance.src;

import java.math.BigDecimal;

//Cannot be "new"
//May contain abstract method(s),implicitly public

//Same:
//1.May have instance variables (attributes)
//2.May have intance methods
//3.May have static methods
//4.Still have constructor,but cannot be "new",for super() only;
public abstract class Shape { //abstract class vs class(Difffference)
  
  private String color;

  public Shape(){

  }

  public Shape(double length){

  }
  
  public Shape(String color){
      this.color = color;
  }

  abstract double area();//implicitly public

  

  public String getColor(){
    return this.color;
  }

    public void setColor(String color){
    this.color = color;
  }

  public static double totalArea(Shape[] shapes){
    BigDecimal totalArea = BigDecimal.valueOf(0);
    for (Shape data: shapes) {
      totalArea = totalArea.add(BigDecimal.valueOf(data.area()));
    }
    return totalArea.doubleValue();
  }
  public static void main(String[] args) {
    Shape s1 = new Circle(3.2,"Red");//Polymornhism
    //Java Compile Time:s1 has area(),getColor(),getRadius()??
    System.out.println(s1.area());
    System.out.println(s1.getColor());
    
    Circle circle1 = new Circle(3.0,"blue");
    System.out.println(circle1.area());
    System.out.println(circle1.getColor());
    System.out.println(circle1.getRadius());

    Circle circle2 = (Circle)s1;
    System.out.println(circle2.getRadius());
  }
}
