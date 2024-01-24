package demoComparator.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
  
  public static void main(String[] args) {
    
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student(10,"Peter"));
    studentList.add(new Student(30,"Aohn"));
    studentList.add(new Student(20,"James"));
    studentList.add(new Student(80,"Yo"));

    Collections.sort(studentList);
    System.out.println(studentList);
  }
}
