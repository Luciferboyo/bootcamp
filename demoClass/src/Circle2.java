package demoClass.src;

public class Circle2 {
  private double radius;

  public Circle2(){

  }
  
  public Circle2(double radius){
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
}
