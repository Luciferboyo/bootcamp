package demoLambda.src.lamdba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball {

  private Color color;

  private double price;

  public Ball(Color color,double price){
    this.color = color;
    this.price = price;
  }

  public Color getColor(){
    return this.color;
  }
  
  public double getPrice(){
    return this.price;
  }

  @Override
  public String toString() {
    return "Ball{color"+this.color+",price"+this.price+"}";
  }

  private static void printSortedResults(List<Ball> list){
    for(Ball ball:list){
      System.out.println(ball);
    }
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>(
      List.of(
        new Ball(Color.Black, 10.3),
        new Ball(Color.Blue, 10.1),
        new Ball(Color.Red, 10.1),
        new Ball(Color.Yellow, 13.3)));
    //Approach:1
    Collections.sort(balls,new SortByColor());
    System.out.println("first color-------------------");
    printSortedResults(balls);
    Collections.sort(balls, new SortByPrice());
    System.out.println("first price--------------");
    printSortedResults(balls);
    System.out.println("---------------------");

    //Approach:2
    //Lambda Expression:
    //1.implementing the logic of the required method
    //2.new the object with that implementation
    //sortByPrice
    Comparator<Ball> priceComparator = Comparator.comparing(Ball::getPrice);
    //sortByColor
    Comparator<Ball> colorComparator = Comparator.comparing(Ball::getColor);

    //first:price,second:color
    Comparator<Ball> comparator = Comparator.comparing(Ball::getPrice).thenComparing(Ball::getColor);

    Collections.sort(balls,priceComparator);

    printSortedResults(balls);
    
    System.out.println("------------");

    Collections.sort(balls,colorComparator);

    printSortedResults(balls);

    System.out.println("-------------");

    Collections.sort(balls,comparator);

    printSortedResults(balls);

  }
}
