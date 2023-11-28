package demoLoop2.src;

import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args){
       int sum = 0;
       for(int i = 0;i < 5;i++){
            sum += i;
       }
       System.out.println("sum = " + sum);
       
       int j = 0;
       int sum1 = 0; 
       while (j < 5) {
            sum1 += j++;
       }
       System.out.println("sum1 = " + sum1 + " ,j = " + j);

       //continue,break
       //1,3,5,7,9
       //first method
       int odd = 1;
       while (odd < 10) {
          if (odd % 2 != 0) {
               System.out.println(odd);
          }
          odd += 2;
       }
       
       System.out.println("-------------");
       //second method
       int a = 0;
       while (++a <= 10) {
          if (a % 2 == 0) continue;
          System.out.println(a);
       }
       //0 1 1 2 3 5 8 13 .... < 1000
       //for
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

       
    }
}
