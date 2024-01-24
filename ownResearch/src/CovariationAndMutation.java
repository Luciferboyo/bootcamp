package ownResearch.src;

import java.util.ArrayList;
import java.util.List;

public class CovariationAndMutation {
  public static Number method(Number number){
      return 1;
  }

  public void sound(List<? super Cat> list){
    list.add(new BlueCat());
  }

  public static void main(String[] args) {
    Object Object = CovariationAndMutation.method(new Integer(2));
    //Number number = CovariationAndMutation.method(new Object());协变(covariation)
    //Integer integer = CovariationAndMutation.method(new Integer(2));逆变(mutation)
    
    CovariationAndMutation a = new CovariationAndMutation();

    
    //Animal animal = new Animal();
    //BlueCat blueCat = new BlueCat();

    List<Cat> lsit = new ArrayList<>();
    a.sound(lsit);

    
  }
}

class Animal{
  public Animal(){
     System.out.println("Animal sount..........");
  }
}

class Cat extends Animal{
  public Cat(){
     System.out.println("cat sount..........");
  }
}

class BlueCat extends Cat{
   public BlueCat(){
     System.out.println("blueCat sount..........");
  }
}