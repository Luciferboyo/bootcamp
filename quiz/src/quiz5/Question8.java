package quiz.src.quiz5;

import java.util.Optional;

class Person{
  private String firstName;

  private Person(){

  }

  public Optional<String> getFirstName(){
    return Optional.ofNullable(firstName);
  }

  public static Optional<Person> getInstance(){
    return 4 % 2 == 0 ? Optional.of(new Person()):Optional.empty();//4%2 must be established
  }
}
public class Question8 {
   public static void main(String[] args) {
    Person.getInstance().ifPresent(p->{//have a optional(Person)
      //so must be implemented
      System.out.println("Yes ");
      p.getFirstName().ifPresent(n->System.out.println(n));//nothing print out
    });
   }
}
