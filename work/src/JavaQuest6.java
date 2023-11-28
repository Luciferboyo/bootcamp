package work.src;
import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int[] array = new int[15];
    array[0] = 0;
    array[1] = 1;
    int index = 0;
    for(int i = 2;i < array.length;i++){
       array[i] = array[i - 1] + array[i - 2];
    }
    System.out.println(Arrays.toString(array));
    for(int i = 0;i < array.length;i++){
      System.out.println(array[i]);
    }
  }
}