package demoComparator.src;

import java.util.Comparator;

public class SoftByScore implements Comparator<Student>{
  
  @Override
  public int compare(Student o1, Student o2) {
    return o2.getScore() > o1.getScore()? -1:1;
    
  }
}
