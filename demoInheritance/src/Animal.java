package demoInheritance.src;

import leeCode.src.A;

public class Animal {//abstract
    
    public int age;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAge(11);
        animal.age = 10;
        System.out.println(animal.age);
    
    }
}
