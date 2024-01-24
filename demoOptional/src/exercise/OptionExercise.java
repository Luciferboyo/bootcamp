package demoOptional.src.exercise;

import java.io.StringReader;
import java.util.Optional;


public class OptionExercise {
  public static void main(String[] args) {
    
    Optional<String> empty = Optional.empty();
    
    System.out.println(empty.isPresent());

    String name = "John Doe";

    Optional<String> opt = Optional.of(name);

    System.out.println(opt.get());

    System.out.println(opt.isPresent());
    
    String name2 = null;

    //Optional.of(name2);->java.lang.NullPointerException

    String name3 = "John Doe";
    
    Optional<String> optional = Optional.ofNullable(name3);

    System.out.println(optional.isPresent());

    String name4 = null;

    Optional<String> optional2 = Optional.ofNullable(name4);

    System.out.println(optional2.isPresent());//print false;

    Optional<String> optional3 = Optional.ofNullable("John");

    String defaultWithOrElse1 = optional3.orElse("default value");

    System.out.println(defaultWithOrElse1);

    Optional<String> optional4 = Optional.ofNullable("John");


    String defaultWithOrElseGet1 = optional4.orElseGet(()->"default value");

    System.out.println(defaultWithOrElseGet1);

    Optional<String> optional5 = Optional.ofNullable("John");

    String defualtWithOrElseThrow1 = optional5.orElseThrow();

    System.out.println(defualtWithOrElseThrow1);

    /*Optional<String> optional6 = Optional.ofNullable(null);

    String defualtWithOrElseThrow2 = optional6.orElseThrow(()->new IllegalStateException());

    System.out.println(defualtWithOrElseThrow1);

    */
    
  }
}
