package DemoIntArray.src;

import java.lang.reflect.Array;

public class DemoIntArray2 {
  public static void main(String[] args){
    //int array 10,8,6,4,2
    int[] arr = new int[]{10,8,6,4,2};
    //for loop - > sum
    int sum = 0;
    for(int i = 0;i < arr.length; i++){
      sum += arr[i];
    }
    System.out.println("sum = " + sum);

    //Find the max value  0,1,2,3,4
    int max = Integer.MIN_VALUE;//-21*******
    for(int i = 0;i < arr.length; i++){
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("max = " + max);
    //Finde the min value 
    int min = Integer.MAX_VALUE;//
    for(int i = 0; i < arr.length;i++){
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("min = " + min);

    //seconde max value;
    int maxnumber1 = Integer.MIN_VALUE;
    int maxnumber2 = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length;i++){
      
        if (arr[i] > maxnumber1) {
          maxnumber2 = maxnumber1;
          maxnumber1 = arr[i];
        }else if(arr[i] > maxnumber2){
          maxnumber2 = arr[i];
        }
    }
    System.out.println("the second largest number in the array:" + maxnumber2);



    System.out.println("----------------------------");
    int firstNumber = 0;
    int secondNumber = 1;
    for(int i = 0; i < arr.length;i++){
        /*if (arr[secondNumber] >= arr[firstNumber] && arr[firstNumber] > arr[i] ) {
          int temp = secondNumber;
          secondNumber = firstNumber;
          firstNumber = temp;
        }else*/ 
        if (arr[i] > arr[firstNumber]) {
          secondNumber = firstNumber;
          firstNumber = i;
        }else if(arr[i] > arr[secondNumber] && arr[i] < arr[firstNumber]){
          secondNumber = i;
        }
    }
    System.out.println("second___________: " + arr[secondNumber]);
  }
}
