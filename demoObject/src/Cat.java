package demoObject.src;

import java.util.Objects;

public class Cat {
  
  private String name;

  private int  age;

  private final Eye[] eyes = new Eye[2];

  public Cat(){

  }

  public Cat(String name,int age){
    this.name = name;
    this.age = age;

  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

   public Eye[] getEyes(){
    return this.eyes;
  }

  @Override
  public boolean equals(Object obj) {
    
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Cat)) {
      return false;
    }

    Cat cat = (Cat)obj;

    //return cat.getAge() == this.age && cat.getName().equals(this.name);
    return Objects.equals(cat.getAge(),this.age)
          && Objects.equals(cat.getName(),this.name);
          //&& Objects.equals(cat.getEyes(),this.eyes);
  }

  @Override
  public int hashCode() {//hashcode->represent object address
    return Objects.hash(this.name,this.age,this.eyes);
  }

  public static void main(String[] args) {
    Cat cat1 = new Cat("nero",27);
    Cat cat2 = new Cat("nero",27);
    System.out.println(cat1.equals(cat2));

    Cat cat3 = new Cat("nero",28);
    Cat cat4 = new Cat("nelo",28);

    Cat cat5 = new Cat("11",12);
    try {
       cat5 = (Cat)cat1.clone();
    } catch (Exception e) {
      e.printStackTrace();
    }
      
    System.out.println(cat1.equals(cat5));

    System.out.println(cat3.equals(cat2));
    System.out.println(cat4.equals(cat3));
    
    Eye[] eyes = new Eye[2];
    Eye[] eyes2 = new Eye[2];
    System.out.println(eyes.equals(eyes2));
  }
   
}
