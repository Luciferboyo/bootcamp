package demoComparator.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoftBtyName implements Comparator<Student>{
  
  @Override
  public int compare(Student o1, Student o2) {
    // TODO Auto-generated method stub
    return o1.getName().compareTo(o2.getName()) > 0 ? 1:-1;
  }

  public static void main(String[] args) {
    Student student1 = new Student(10, "Am");
    Student student2 = new Student(20, "Cm");
    Student student3 = new Student(30, "Bm");

    List<Student> studentList = new ArrayList<>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    SoftBtyName softBtyName = new SoftBtyName();
    Collections.sort(studentList,softBtyName);

    System.out.println(studentList);

    
  }
}
