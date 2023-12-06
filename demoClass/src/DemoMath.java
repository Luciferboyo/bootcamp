package demoClass.src;

import java.util.Random;
import javax.naming.NameNotFoundException;

public class DemoMath {

  public static void main(String[] args) {
    //pow
    System.out.println(Math.pow(2.0, 10));//2^10
    System.out.println(Math.pow(2, -1));//1/(2^1)
    System.out.println(Math.pow(2, -2));//1/(2^2)
    System.out.println(Math.pow(-2, 3));//-8.0

    //abs(),absolute value
    System.out.println(Math.abs(3.2));//3.2
    System.out.println(Math.abs(-3.2));//3.2

    //ceil(),floor()
    System.out.println(Math.ceil(3.1));//4.0
    System.out.println(Math.ceil(3.9));

    System.out.println(Math.ceil(3.1));//3.0
    System.out.println(Math.ceil(3.9));//3.0

    System.out.println(Math.round(3.4));//3.0
    System.out.println(Math.round(3.5));//3.0
    System.out.println(Math.round(3.44));//3.0\
    System.out.println(Math.round(3.45));//3.0
    System.out.println(Math.round(3.46));//3.0

    int[] arr = new int[]{-2,20,100,-400};
    int max = arr[0];
    for(int i = 0;i < arr.length;i++){
      max = Math.max(arr[i], max);
    }
    System.out.println(max);

    System.out.println(Math.min(7.5, 6.5));//6.5
    System.out.println(Math.sqrt(81));//9.0

    double d1 = Math.sqrt(-81);
    System.out.println(d1);

    if(Double.isNaN(d1) ){
      System.out.println("d1 is NaN");
    }

    int random1 = new Random().nextInt(3);//0,1,2
    System.out.println(random1);
    System.out.println(Math.random());//0.0-1.0

    //1-10
    int random2 = (int)(Math.random() * 10);
    System.out.println(random2);

    //int x = (int)(3.5 + 4); +=
    int y = 7;
    y += 3.5;
    System.out.println(y);//explicitly
    
  }
}