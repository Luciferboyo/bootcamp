package demoGenerics.src.exercise.box;

import java.util.ArrayList;
import java.util.List;


class An{}
class Animal extends An{}
class Cat extends Animal{}
class Dog extends Animal{}
class RedCat extends Cat{}
public class LowerBoundWildCard {
  public static void addCat(List<? super Cat> catList){
    catList.add(new RedCat());
    System.out.println("Cat Added");
  }

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    List<Cat> cat = new ArrayList<>();
    List<Dog> dogs = new ArrayList<>();
    List<RedCat> redCats = new ArrayList<>();
    List<An> an = new ArrayList<>();

    addCat(cat);

    addCat(animals);
    addCat(an);
    //addCat(dogs);
    //addCat(redCats);
    int[][] array = new int[0][0];
    System.out.println(array.length);
    
  }
}
