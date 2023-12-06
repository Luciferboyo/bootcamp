package demoClass.src;

import java.math.BigDecimal;

public class Circle {
  
  private double radius;

  public Circle(){

  }
  
  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double area(double radius){
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public double perimeter(double radius){
    return 2 * radius * Math.PI;
  }

  public double diameter(double radius){
    return 2 * radius;
  }

  //Static Method
  public static double areaStatic(double radius){
    BigDecimal r = BigDecimal.valueOf(radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    return r.multiply(r).multiply(pi).doubleValue();//how to fix by BigDecimal?
  }

  public static void main(String[] args) {
    Circle circle1 = new Circle();
    System.out.println("new Circle() = " + circle1.getRadius());
    System.out.println("-----------------");

    circle1.setRadius(10);
    System.out.println("setRadius = " + circle1.getRadius());

    Circle c = new Circle(99);
    System.out.println("c.getRadius() = " + c.getRadius());

    System.out.println("c area = " + c.area(10));

    Circle circle2;

    //pass by reference
    circle2 = circle1;

    areaStatic(0);
  }
}
