package demoClass.src.staticvariable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Database {
  
  private static String[] strings = new String[0];

  //final vs static final
  //1."final" is still instance variable, the object can call it by "this"
  //2."static final" is constant

  //No static and No final(instance variable)
  //static
  //final(instance variable)
  //static final
  private final  int hours_per_day = 24;//Constant instance variable

  private static final int MINUTES_PER_HOUR = 60;//Constant (MINUTES_PER_HOUR is Class)

  public static void add(String str){

    //String[] newArr = Arrays.copyOf(strings, strings.length + 1);
    //newArr[newArr.length - 1] = str;

    String[] strArr = new String[strings.length + 1];
    
    for(int i = 0;i < strings.length; i++){
      strArr[i] = strings[i];
    }

    strArr[strArr.length - 1] = str;
    strings = strArr;
  }

  public static boolean isIndexValid(int index){
    return index >= 0 && index < strings.length;
  }

  public static boolean remove(int index){
    
    if (!isIndexValid(index)) 
      return false;

    String[] newStrings = new String[strings.length - 1];
    boolean flag = false;
    for(int i = 0; i < newStrings.length; i++){
      if (index == i) {
        newStrings[i] = strings[i + 1];
        flag = true;
      }else{
        newStrings[i] = strings[i];
      }
    }
    
    if (index == newStrings.length) {
      flag = true;
    }
    strings = newStrings;
    return flag;
  }

  public static String get(int index){
    if (!isIndexValid(index)) {
      return null;
    }
    return strings[index];
  }

  public String read(int index){
    return strings[index];
  }

  public static void main(String[] args) {

    Database.add("111");

    int a = 0;

    int b = 0;

    a = a++;
    
    b = a++;

    System.out.println(a);

    System.out.println(b);

    //We do not need to create to 
    System.out.println("---------------");

    Database.add("hello");

    System.out.println(Database.get(0));

    Database d1 = new Database();

    System.out.println(d1.read(1));

    System.out.println(Database.remove(0));

    System.out.println(Database.get(0));
  }
}
