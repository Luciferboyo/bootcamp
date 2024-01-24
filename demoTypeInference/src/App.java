package demoTypeInference.src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "hello";

        var s2 = "hello";//after compile:var - > String

        List<Dog> dogs = new ArrayList<>(List.of(new Dog("ABC"),new Dog("DEF")));

        //s = 123;error
        //s2 = 123 ; same,error,s2 is declared before, and pointing to a String object
        //cannot be reassigned to int value object
        

        for(Dog dog:dogs){
            System.out.println(dog.getName());
        }

        for(var dog:dogs){
            System.out.println(dog.getName());
        }
    }
}
