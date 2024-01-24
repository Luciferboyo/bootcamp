package demoLambda.src.lamdba;

import java.util.Comparator;

public class SortByPrice implements Comparator<Ball> {
  @Override
  public int compare(Ball b1, Ball b2) {
    // TODO Auto-generated method stub
    return Double.compare(b1.getPrice(), b2.getPrice());
  }
}
