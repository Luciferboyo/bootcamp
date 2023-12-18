package leeCode.src;

import java.util.Arrays;

public class A {

  public int[] intArr(int[] array,int n){
    
    int[] newArr = new int[2 * n];
    
    for(int i = 0;i < newArr.length;i++){
      if (i < newArr.length / 2) {
        newArr[i] = array[i];
        System.out.println("i = "+i);
      }else if (i >= array.length) {
        newArr[i] = array[i - array.length];
      }
    }

    return newArr;
  }
  public static void main(String[] args) {
    A a = new A();
    System.out.println(Arrays.toString(a.intArr(new int[]{1,2,1,3}, 4)));
  }
}
