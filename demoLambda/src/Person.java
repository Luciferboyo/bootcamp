package demoLambda.src;

interface Walk{
  public void walk();
}

public class Person implements Walk{
  @Override
  public void walk() {
    System.out.println("I am person and walking....");
  }

  public static void main(String[] args) {
    Walk person2 = ()->{
      System.out.println("I am person2 and walking...");
    };
    person2.walk();

    Person person = new Person();
    person.walk();
  }
}
