package demoGenerics.src.exercise.box;

import java.util.ArrayList;
import java.util.List;


public class ShapeUtils {
  
  /**
   * public double area(){
    return -1.0;
  }

  */
  //Static Method:Sum Up all area from the class objects(circle/Square)
  public static <T extends Shape> double areaT(List<T> shapes){ //anything wrong?
    //loop
    double sum = 0.0;
    for(T t:shapes){
      sum += t.area();
    }
    return sum;
  }


  public static  double areaSpuer(List<? extends Shape> shapes){ //anything wrong?
    //loop
    double sum = 0.0;
    for(Shape t:shapes){
      sum += t.area();
    }
    return sum;
  }

  public static double area2(List<Shape> shapes){//anything wrong?
    double sum = 0.0;
    for(Shape shape:shapes){
      sum += shape.area();
    }
    return sum;
  }

  public static void main(String[] args) {
    
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3.0));
    shapes.add(new Square(4.0));
        
    double sum = ShapeUtils.areaT(shapes);
    System.out.println("area2:"+ShapeUtils.area2(shapes));
    System.out.println("Sum of areas: " + sum);
  }
}

abstract class Shape {
  
  abstract double area();

}

class Circle extends Shape{
  private double radius;
  
  public Circle(double radius){
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}

class Square extends Shape{
  private double side;
  
  public Square(double side){
    this.side = side;
  }

  @Override
  double area() {
    return this.side * this.side;
  }

}


