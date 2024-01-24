package demoBuilderPattern.src;

import java.util.ArrayList;
import java.util.List;

public class Student{
  //Builder Pattern Advantages:
  //1.If you want to control the access to setter after the object created,builder pattern is good
  //2.You don't have to create too much contructors,according to the attributes
  private String name;
  private int age;
  private List<String> subjects;

  private Student(Builder builder){
    this.name = builder.name;
    this.age = builder.age;
    this.subjects = builder.subjects;
  }

  public static Builder builder(){
    return new Builder();
  }
  
  //10 fields...all arguments constructor -> 1constructor
  //9 fields constructor? N constructors.
  public static class Builder{
    private String name;
    private int age;
    private List<String> subjects;

    public Builder name(String name){
      this.name = name;
      return this;
    }

    public Builder age(int age){
      this.age = age;
      return this;
    }

    public Builder subjects(List<String> subjects){
      this.subjects = subjects;
      return this;
    }
    public Student build(){
      return new Student(this);
    }
  }

  public static void main(String[] args) {
    
    //Student student = new Student("John", 13, new ArrayList<>(List.of("Maths","English")));

    Student student2 = Student.builder().name("Peter").age(18).build();
  }
}