package demoIntArray.src;

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
    
    //Approach 1
    String s = "abcabcabcabcabc";
    char[] chaArr = new char[s.length()];
    for(int i = 0;i < s.length();i++){
      chaArr[i] = s.charAt(i);
    }
    System.out.println(Arrays.toString(chaArr));

    //Approach 2
    char[] arr6 = s.toCharArray();
    System.out.println(Arrays.toString(arr6));

    //repalace a -> c(String)
    //Approach 1
    char[] chaArr2 = new char[s.length()];
    for(int i = 0;i < s.length();i++){
      if(s.charAt(i) == 'a'){
        chaArr2[i] = 'c';
        continue;
      }
        chaArr2[i] = s.charAt(i);
    }
    System.out.println(Arrays.toString(chaArr2));
    //Approach 2
    String s1 = s.replace("a", "c");
    System.out.println(s1);

    //From array to String
    String str = "hello";
    str = new String("hello");
    str = String.valueOf(str);

    System.out.println(String.valueOf(0));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(1.0f));
    System.out.println(String.valueOf(1L));
    System.out.println(String.valueOf(new char[]{'a','b'}));
    byte b = 100;

    //replace(String method)
    String str4 = "abacabcbacaca";
    String result4 = str4.replace('a', 'c');
    System.out.println("str4 = "+str4);
    System.out.println("result4 = " + result4);
  }
}
