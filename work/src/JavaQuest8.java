package work.src;
/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    // code here
    System.out.println(secondMaxArray(nums));
    System.out.println(secondMaxArray(nums2));
    System.out.println(secondMaxArray(nums3));
    System.out.println(secondMaxArray(nums4));
  }
  public static int secondMaxArray(int[] array){
      int secondMax = Integer.MIN_VALUE;
      int max = Integer.MIN_VALUE + 1;
      for(int i = 0;i < array.length; i++){
        if (array[i] > max) {
          secondMax = max;
          max = array[i];
        }else if(array[i] > secondMax){
          secondMax = array[i];
        }
      }
    return secondMax;
  }
}