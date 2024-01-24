package quiz.src.quiz5;

interface Animal{
  void eat();
}

abstract class Animal2{
  void eat2(){};
}

class Cow extends Animal2 implements Animal{
  @Override
  public void eat() {
    System.out.println("[Cow]eating...");
  }

  public void eat(Animal a){
    a.eat();
  }

  @Override
  void eat2() {
    System.out.println("[Cow]eating...22222");
  }
}
public class Question1 {
  public static void main(String[] args) {
    Animal cow = new Cow();
    cow.eat();
    //extend section
    Animal2 cow2 = new Cow();
    cow2.eat2();

    Animal smallCow = ()->System.out.println("[Animal eating...]");
    smallCow.eat();

    Cow bigCow = new Cow();
    bigCow.eat(smallCow);
    /*
     * bigCow.eat(smallCow) == 
     * 
     * cow.eat(Animal a)->Pass in parameters of smallCow, smallCow is Object of Animal
     * so -> public void eat(Animal a){
                a.eat();
            }
     * Animal smallCow = ()->System.out.println("[Animal eating...]"); ->Override Animal
     * so-> Animal.eat(){
     *          System.out.println("[Animal eating...]");
     *      }
     */
  }
}
