package demoInheritance.src;

import java.math.BigDecimal;

public class Circle extends Shape{
  
  private double radius;

  public Circle(){

  }

  public Circle(double radius,String color){
    super(color);
    this.radius = radius;
  }

  public Circle(double radius){
    this.radius = radius;
  }

  //Circle extends Shape,so it has to implement all abstract methods in Parent abstract class
  @Override
  public double area(){
    return BigDecimal.valueOf(radius).
    multiply(BigDecimal.valueOf(radius)).
    multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    //divide() ->
  }

  public double getRadius(){
    return this.radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.4,"Red");
    System.out.println(circle.area());
  }


}
