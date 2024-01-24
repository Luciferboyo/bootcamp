package demoEnum.src;

import java.util.Objects;

public class Animal {

  private String name;

  private int age;
  
  public String eat(){
    return "[Animal] i am eating ";
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public String toString() {
    return "Animal[name="+this.name+",age="+this.age+"]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name,this.age);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    
    if (!(obj instanceof Animal)) {
      return false;
    }
    Animal animal = (Animal)obj;
    return Objects.equals(this.age, animal.getAge())
                  && Objects.equals(this.name, animal.getName());
  }
}
