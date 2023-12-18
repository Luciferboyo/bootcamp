package leeCode.src;


public class MaximumProductOf {
  public int maxProduct(int[] nums) {
   int max = Integer.MIN_VALUE;
   int secondeMax = Integer.MIN_VALUE;

   for(int i = 0; i < nums.length; i++){
      if (max < nums[i]) {
        secondeMax = max;
        max = nums[i];
        System.out.println("max = " + max);
        System.out.println("secondMax = " + secondeMax);
      }else if(nums[i] > secondeMax){
        secondeMax = nums[i];
      }
    }
    return (max - 1)*(secondeMax - 1);
  }
  public static void main(String[] args) {
    MaximumProductOf m = new MaximumProductOf();
    System.out.println(m.maxProduct(new int[]{10,2,3,4}));
  }
}