package DemoIntArray.src;

import java.util.Arrays;

public class DemoStringArray {
  public static void main(String[] args) {
    //"abc","ijk","xyz"
    String[] stringArr = new String[]{"abc","ijk","xyz"};
    String[] stringArr2 = new String[3];
    stringArr2[0] = "abc";
    stringArr2[1] = "ijk";
    stringArr2[2] = "xyz";
    for(int i = 0; i < stringArr.length;i++){
      System.out.println("stringArr = " + stringArr[i]);
    }
    for(int i = 0; i < stringArr2.length;i++){
      System.out.println("stringArr2 = " + stringArr2[i]);
    }
    System.out.println("-------------------");
    //for loop
    //strings[0] -> "abcijk" 0+1
    //strings[1] -> "ijkxyz" 1+2
    //strings[2] -> "xyz!" 2 
    //1.
     for(int i = 0; i < stringArr.length;i++){
      if(i < stringArr.length - 1){
        System.out.println(stringArr[i].concat(stringArr[i + 1]));
      }else{
        System.out.println(stringArr[i].concat("!"));
      }
    }
    System.out.println("------------------");
    //2.continue;
    for(int i = 0; i < stringArr.length;i++){
      if(i < stringArr.length - 1){
        System.out.println(stringArr[i].concat(stringArr[i + 1]));
        continue;
      }
        System.out.println(stringArr[i].concat("!"));
    }
    //Arrays.toString -> method
    System.out.println(Arrays.toString(stringArr));
    
  }
}
