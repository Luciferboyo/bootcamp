package demoIntArray.src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoMethod3 {
  public static void main(String[] args) {
    int[] arr = new int[]{3, 5, 10};
    System.out.println(sum(arr));//18
    System.out.println("array2 = " + addOne(arr));
    System.out.println("array2 = " + Arrays.toString(addOne(arr)));
    System.out.println("arr = " + arr);
    System.out.println("arr = " + Arrays.toString(arr));
    System.out.println("---------------------");
    addOne2(arr);
    System.out.println("--------------------");;
    String str1 = "abc";
    System.out.println(str1);
    System.out.println(concatHello2(str1));
    System.out.println(str1);
    System.out.println("-----------------");
    int[] arr2 = new int[]{1,2,3};
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(addOne3(arr2)));
    System.out.println(Arrays.toString(arr2));
    System.out.println("-------------");
    System.out.println(String.class.getName()+"@"+Integer.toHexString(System.identityHashCode(str1)));
    System.out.println(String.class.getName()+"@"+Integer.toHexString(System.identityHashCode(concatHello2(str1))));
  }
  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0;i < arr.length;i++){
      sum += arr[i];
    }
    return sum;
  }

  public static int[] addOne(int[] array){
    int[] array2 = new int[array.length];
   for(int i = 0;i < array.length;i++){
      array2[i] = array[i] + 1; 
   }
    return array2; 
  }
   public static void addOne2(int[] array){
   for(int i = 0;i < array.length;i++){
      array[i] ++; 
   } 
   System.out.println("array in addOne2 " + array);
   System.out.println(Arrays.toString(array));
  }
  public static int[] addOne3(int[] array){
   for(int i = 0;i < array.length;i++){//Pass by Reference
      array[i] = array[i] + 1; 
   }
    return array; 
  }
  //Wrong approach
  public static void concatHello(String s){//String is "Pass by value"
    s = s.concat("hello");
    System.out.println();
  }
  //Correct approsch
  public static String concatHello2(String s){
    s = s.concat("hello");
    return s;
  }

  //Primitives + Wrapper Classes + String(17 types) -> Pass by value
  //array and classes -> Pass by reference
}
