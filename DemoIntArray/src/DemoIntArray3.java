package DemoIntArray.src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoIntArray3 {
  public static void main(String[] args) {
    int[] arr = new int [] {100,-100,34};

    //for loop
    //{-100,100,34}
    int temp = 0;
    for(int i = 0;i < 2;i++){
        if (i == 0) {
          //swapping
          /*temp = arr[i];
        }else{
          arr[i - 1] = arr[i];
          arr[i] = temp;
        }*/
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        }  
    }
    System.out.println(Arrays.toString(arr));
    //move target index value to the tail of the array
    int[] arr2 = new int[]{100,-20,4,100,500};//100,4,100,500,-20
    int targetIndex = 1;
    //for loop
    int temp1 = arr2[targetIndex];
    for(int i = 1;i < arr2.length;i++){
        if( i <arr2.length - 1 ){
          arr2[i] = arr2[i+1];
        }else if(i == arr2.length - 1){
          arr2[arr2.length - 1] = temp1;
        }
    }
    System.out.println(Arrays.toString(arr2));
  }
}