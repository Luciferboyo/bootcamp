package demoInheritance.src;

/**
 * Cat
 */
public class Cat extends Animal{

  //age
  //Cat Class inherit all public attributes,methods
  //Cat did NOT inherit constructor
  public Cat(){
    //super();//implicitly call Animal() constructor
  }

  public static void main(String[] args) {
    Cat cat = new Cat();//Creat a Cat Object
    cat.setAge(2);
    System.out.println(cat.getAge());
  }
}