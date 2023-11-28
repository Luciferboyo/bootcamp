package demoIntArray.src;

import java.util.Arrays;

public class DemoCounting {
  public static void main(String[] args) {
    int[] numbers = new int[]{10,2,200,2000,2000,2,2};
    //int[] counts = new int[]
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = 0;i < numbers.length;i++){
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    int[] counts = new int[max - min + 1];
    int maxCount = 0;
    for(int i = 0; i < numbers.length;i++){
      for(int j = 1;j < numbers.length;j++){
        if (i != j && numbers[i] == numbers[j]) {
          
        }
      }
    }
    System.out.println("Max.count:" + maxCount);//3

    //
    String str = "abcabcdpoolxyzaa";
    char maxChar = ' ';
    maxCount = Integer.MIN_VALUE;
    int[] counts2 = new int[26];
    //counts2['b' - 'a']++;
    for(int i = 0;i < str.length();i++){
       counts2[str.charAt(i) - 'a']++;
    }
    for(int i = 0;i < counts2.length;i++){
      if (maxCount < counts2[i]) {
          maxCount = counts2[i];
          maxChar = (char)(i + 97);//
      }
    }
    System.out.println(Arrays.toString(counts2));
    System.out.println("Max count = " + maxCount + " , char = "+ maxChar);
  }
}
