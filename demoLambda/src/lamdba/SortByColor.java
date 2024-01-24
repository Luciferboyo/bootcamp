package demoLambda.src.lamdba;

import java.util.Comparator;

public class SortByColor implements Comparator<Ball>{
  @Override
  public int compare(Ball o1, Ball o2) {
    
    return o1.getColor().compareTo(o2.getColor());
  }
}
