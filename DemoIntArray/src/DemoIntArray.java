package DemoIntArray.src;

public class DemoIntArray {
    public static void main(String[] args) {
      int age1 = 20;
      int age2 = 25;
      int age3 = 30;
      int age4 = 35;

      //Deffine an array(container) to store a list of int number
      //This array (container) can only store int number
      int[] array = new int[3];//[length of array], by index 0-8
      //assignment
      array[0] = age1;
      array[1] = age2;
      array[2] = age3;
      System.out.println("array[0] = " + array[0]);

      int[] arr2 = new int[]{array[0],array[1]};

      double[] arr4 = new double[]{2.3,3.3,1.1};


      //array supports for loop

      arr2 = new int[10];

      String[] strArr = new String[]{"11","22"};
      System.out.println(strArr[0]);

      //default value of int[]
      int [] arr5 = new int[3];
      for(int i = 0 ;i < arr5.length;i++){
        //arr5 is storing address of the array object
        //we use arr5[5] find out the 3 value stored in the array object
        System.out.println("arr5[i] = " + arr5[i]);
        //[0] -> 1
        //[1] -> 2
        //[2] -> 3
        arr5[i] = i + 1;
        System.out.println(arr5[i]);
      }
      
      String str = "hello";//str is storing the address of String object hello
      String str2 = new String("hello");//str2 if storing the address of String
      String str3 = String.valueOf("hello");
      System.out.println("-------------------");
      for(int i = arr5.length - 1 ;i >= 0 ;i--){
          System.out.print(arr5[i]);
          if (i > 0) {
            System.out.println(" ");
          }
      }
    }
}
