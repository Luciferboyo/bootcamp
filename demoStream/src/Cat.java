package demoStream.src;

import java.util.Objects;

public class Cat {
  
  private String name;

  private int age;

  public Cat(){

  }

  public Cat(String name,int age){
    this.age = age;
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Cat)) 
      return false;
    Cat cat = (Cat)obj;
    return Objects.equals(this.age, cat.getAge()) && Objects.equals(this.name, cat.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name,this.age);
  }

  @Override
  public String toString() {
    return "Cat[cat.name="+this.name+"cat.age="+this.age+"]";
  }

  
}
