package demoGenerics.src.exercise.box;

import leeCode.src.A;

public class Box<T> {
  
  private T t;

  public void set(T t){
    this.t = t;
  }

  public T get(){
    return this.t;
  }

 
}

class Animal{

  private String name;

  public Animal(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void  makeSound(){
    System.out.println("I am "+ name);
  }
}

class Dog extends Animal{
  
  private boolean hasBone;

  public Dog(String name,boolean hasBone){
    super(name);
    this.hasBone = hasBone;
  }

  public boolean isHasBone(){
    return hasBone;
  }

  @Override
  public void makeSound() {
    // TODO Auto-generated method stub
    System.out.println("Woof woof my name is "+getName());
  }

  public static void main(String[] args) {
    Box<Animal> box = new Box<>();
    Box<Dog> boxDog = new Box<>();
    
    Animal[] animals = new Animal[10];
    Dog[] dogs = new Dog[10];
    animals = dogs;
  } 
  public static<T> Box<T> createBox(T value){
    Box<T> box  = new Box<>();
    box.set(value);
    return box;
  }
}
