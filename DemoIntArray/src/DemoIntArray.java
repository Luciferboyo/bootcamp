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

      //

    }
}
