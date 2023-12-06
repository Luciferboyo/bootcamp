package work.src;
/**
 * Need:
 *    Given an array of integers, write a program that finds 
 *    the length of the longest consecutive increasing sequence in the array.
 * 
 * Expected Output:
 *  input:
 *  {1, 3, 5, 4, 7} 
 *  
 *  output:
 *  3
 * 
 */
public class ForLoopAndMethod2 {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int current = 1;  // The length of the current increasing sequence
        int maxCurrent = 1;      // The length of the longest increasing sequence

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                current++;  // Update the length of the current increasing sequence
                if (maxCurrent < current) {
                  maxCurrent = current;// Update the length of the longest increasing sequence
                }
            } else {
                current = 1;  // Restart calculating the length of the current increasing sequence
            }
        }

        return maxCurrent;
    }

    //Test
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        int result = findLengthOfLCIS(nums);
        System.out.println(result);  // Output: 3
    }
}


