package demoGenerics.src.exercise.box;

import java.util.List;


/**
 * Person
 */
public class Person {

}

class Childern extends Person{

}

class Kid extends Childern{

}

class Box<T extends Person>{
  private T personT;

  public Box(T personT){
    this.personT = personT;
  }

  public void put(T personT){
    this.personT = personT;
  }
  public static void main(String[] args) {
    Box<Childern> childernBox = new Box<Childern>(new Childern());

    Box<? extends Person> personBox = new Box<Person>(new Person());

    Box<? extends Person> cBox = new Box<Childern>(new Childern());

    personBox = childernBox;
    
    
  }

  public static<U extends Person> void add(List<? super Childern> ls,Animal animal){
    ls.add(new Childern());
  }
} 