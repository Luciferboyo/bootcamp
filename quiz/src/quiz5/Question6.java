package quiz.src.quiz5;

@FunctionalInterface
interface AreaHelper{
  double area();
}

abstract class Shape {

  public String color;

  public static <T extends Shape & AreaHelper> double calcArea(T...ts){
    double totalArea = 0.0d;
    for(T t : ts){
      totalArea += t.area();
    }
    return totalArea;
  }
}

class Rectangular extends Shape implements AreaHelper{
  int length;
  int width;

  Rectangular(int x,int y){
    this.length = x;
    this.width = y;
  }

  @Override
  public double area() {
    return this.length * this.width;
  }
}

class Square implements AreaHelper{
  int length;

  Square(int x){
    this.length = x;
  }

  @Override
  public double area() {
    return this.length*this.length;
  }
}

public class Question6 {
  public static void main(String[] args) {
    //double area = Shape.calcArea(new Rectangular(3, 4),new Square(5));
    //System.out.println(area);
  }    
}
