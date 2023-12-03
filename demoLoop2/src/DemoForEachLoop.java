package demoLoop2.src;

import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[]{100,-30,20};
    for(Integer data: integers){
      System.out.println(data);
    }
    System.out.println("------------------------");
    for(int i = 0;i < integers.length; i++){
      System.out.println(integers[i]);
    }
    String str = "abc,def,ijk,xyz";
    String[] parts = str.split(",");
    for (String data : parts) {
      System.out.println("part = " + data);
    }

    String str2 = "adcdefghijk";
    //char array
    //finalString -> "acegik"
    
    String newString = "";
    //first
    for (int i = 0; i < str2.length(); i++) {
      if (i % 2 == 0) {
        newString += str2.charAt(i);
      }
    }
    char[] charArr = newString.toCharArray();
    System.out.println(newString);
    System.out.println(Arrays.toString(charArr));

    //second
    char[] charArr2 = new char[str2.length() % 2 == 0 ? str2.length()/2:str2.length()/2 + 1];
    int j = 0;
    for (int i = 0; i < str2.length(); i++) {
      if (i % 2 == 0) {
        charArr2[j++] = str2.charAt(i);
      }
    }
    System.out.println(Arrays.toString(charArr2));

    //three
    char[] characters = str2.toCharArray();
    char[] result = new char[str2.length() % 2 == 0 ? str2.length()/2:str2.length()/2 + 1];
    int a = 0;
    for (int i = 0; i < characters.length; i++) {
      if (i % 2 == 0) {
        result[a++] = characters[i];
      }
    }
    System.out.println(Arrays.toString(result));

    System.out.println("----------------------");
    //Example 1:
    String string = evenIdx(str2);
    System.out.println(string); 

    //Example 2:
    //Given String "abcdefg"
    //finalString "gfedcba"
    //char array
    System.out.println("--------------");
    String str3 = "abcdefg";
    System.out.println(reverse(str3));
  }
  //first method
  public static String evenIdx(String s){
    String newString = "";
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        newString += s.charAt(i);
      }
    }
    return newString;  
  }
  //second method
  public static String evenIdex2(String s){
      char[] characters = s.toCharArray();
      char[] result = new char[s.length() % 2 == 0 ? s.length()/2:s.length()/2 + 1];
      int a = 0;
      for (int i = 0; i < characters.length; i++) {
      if (i % 2 == 0) {
        result[a++] = characters[i];
      }
    }
      return String.valueOf(result);
    }

    //-----------------------
    //adc -> cda
    public static String reverse(String s){
      char [] result = s.toCharArray();
      int l1 = result.length / 2 ;
      char c1 = ' ';
      for(int i = 0;i < l1;i++){
        c1 = result[i];
        result[i] = result[result.length - (i + 1)];
        result[result.length - (i + 1)] = c1;
      }
      return String.valueOf(result);
    }
    //String
    public static String reverse2(String s){
      String reversedStr = new StringBuilder(s).reverse().toString();
      return reversedStr;
    }
}
