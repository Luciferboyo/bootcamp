package demoIntArray.src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoIntArray3 {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -100, 34};

    // for loop
    // {-100,100,34}
    int temp = 0;
    for (int i = 0; i < 2; i++) {
      if (i == 0) {
        // swapping
        /*
         * temp = arr[i]; }else{ arr[i - 1] = arr[i]; arr[i] = temp; }
         */
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
    // move target index value to the tail of the array
    int[] arr2 = new int[] {100, -20, 4, 100, 500};// 100,4,100,500,-20
    int targetIndex = 1;
    // for loop
    // first method
    int temp1 = arr2[targetIndex];
    for (int i = targetIndex; i < arr2.length; i++) {
      if (i < arr2.length - 1) {
        arr2[i] = arr2[i + 1];
      } else if (i == arr2.length - 1) {
        arr2[arr2.length - 1] = temp1;
      }
    }
    // second method
    /*
     * for(int i = 0;i < arr2.length - 1;i++){ if(i >= targetIndex){ temp = arr2[i]; arr2[i] = arr2[i + 1]; arr2[i + 1] = temp; } }
     */
    System.out.println(Arrays.toString(arr2));
    System.out.println("------------------");
    // Find Max value,and move to the tail
    //first menthod
    int[] arr3 = new int[] {100, 4, 1050, 500, -20};
    int max = Integer.MIN_VALUE;// -21*******
    int index = 0;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
        index = i;
      }
    }
    System.out.println(Arrays.toString(arr3));
    System.out.println("max = " + max);
    System.out.println(index);
    int temp3 = arr3[index];
    for (int i = index; i < arr3.length; i++) {
      if (i < arr3.length - 1) {
        arr3[i] = arr3[i + 1];
      } else if (i == arr3.length - 1) {
        arr3[arr3.length - 1] = temp3;
      }
    }
    System.out.println(Arrays.toString(arr3));

    int[] arr4 = new int[]{100, 4, 1050, 500, -20};
    //seconde method
    int max2 = arr4[0];
    int index2 = 0;
    for(int i = 0;i < arr4.length - 1; i++){
      //找出最大值
      if (arr4[i] < arr4[i + 1]) {
        max2 = arr4[i + 1];
        index2 = i;
      }else if (i > index2) {
        arr4[i] = arr4[i + 1];
      } 
    }
    arr4[arr4.length - 1] = max2;
    System.out.println("------------------");
    System.out.println(Arrays.toString(arr4));
    System.out.println("--------------------");
    //100, 4, 1050, 500, -20
    //4, 100, 1050, 500, -20
    //4, 100, 1050, 500, -20
    //4, 100, 500, -20, 1050
    int[] arr5 = new int[]{100, 4, 1050, 500, -20};
    int temp4 = 0;
    boolean flag = true;
    for(int j = 0; j < arr5.length;j++){
        for(int i = 0;i < arr5.length - j;i++){
          if (arr5[i] > arr5[i + 1]) {
            temp4 = arr5[i];
            arr5[i] = arr5[i + 1];
            arr5[i + 1] = temp4;
            flag = false;
          }
        } 
      if (flag) {
        break;
      }
    }
    
    System.out.println(Arrays.toString(arr5));
      
  }
}
