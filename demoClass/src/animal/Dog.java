package demoClass.src.animal;

public class Dog {
  public static int sum(int... integers){
    int sum = 0;
    for(Integer i: integers){
      sum += i;
    }
    return sum;
  }

  public static int sum2(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return sum;
  }


  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4,5));

    //call sum2
    System.out.println(sum2(new int[]{1,1,1,1,}));
  }
}
