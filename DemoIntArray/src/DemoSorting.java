package demoIntArray.src;

import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    int[] arr = new int[]{100, 4, 1050, 500, -20};
    //1.Bubble Sort
    int temp;
    for(int i = 1;i < arr.length - 1;i++){
      for(int j = 0;j < arr.length - 1 - i;j++){
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));

    int x = 10;
    int y = 5;
    while (x > 0 && y > 0) {
      System.out.println("x = " + x+" ,y = " + y);
      y--;
      x--;
    }
    //1 1 2 3  5 8 13 ... < 1000
    int[] array = new int[20+1];
    array[0] = 0;
    array[1] = 1;
    int index = 0;
    for(int i = 2;i <= array.length - 1;i++){
       array[i] = array[i - 1] + array[i - 2];
       if (array[i] > 1000) {
            index = i;
            break;
       }
    }
    int[] array1 = new int[index];
    for(int i = 0;i < array1.length;i++){
       array1[i] = array[i];
    }
    System.out.println(Arrays.toString(array1));

    //2.Insertion Sort
    int[] array2 = new int[]{4,3,2,10,12,1,5,6};
    int temp3 = 0;
    for(int i = 1;i < array2.length;i++){
      temp3 = array2[i];
      int j = i;
      while (j > 0 && temp3 < array2[j - 1] ) {
        array2[j] = array2[j - 1];
        j--;
      }

      if (j != i) {
        array2[j] = temp3;
      }
    }
    System.out.println("____________________" + Arrays.toString(array2));
  }
}
