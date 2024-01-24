package demoEnum.src;

public class Cow extends Animal{
  
  public String eat(String food){
    return "[Cow] i am eating " + food;
  }

  public static void main(String[] args) {
    Animal cow = new Cow();//Compile - time/Run - time
    //Compile time: cow object can access which methods
    if (cow instanceof Cow) {
      Cow cow2 = (Cow)cow;
      System.out.println(cow2.eat("cao"));
    }

    System.out.println(cow.eat());

    Animal cow3 = new Animal();
    //cow2.eat("sushi")//Compile error: Animal.class has no eat(String) method.

  }
}
