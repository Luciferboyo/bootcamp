package demoInterface.src;

import java.util.Arrays;

public class One {
  public int[] findIntersectionValues(int[] nums1, int[] nums2) {
    int[] newArr = new int[2];
    String s1 = String.valueOf(nums1);
    String s2 = String.valueOf(nums2);

    char[] newArr1 = s1.toCharArray();
    char[] newArr2 = s2.toCharArray();

    System.out.println(String.valueOf(newArr1));
    System.out.println(String.valueOf(newArr2));
    
    for(int i = 0;i < Math.max(newArr1.length, newArr2.length);i++){

         if (s1.indexOf(newArr1[i]) != -1 && i < newArr1.length) {
            newArr[0] = s1.indexOf(newArr1[i]);
          }

          if (s2.indexOf(newArr2[newArr2.length - i - 1]) != -1 && i < newArr2.length) {
            newArr[1] = s2.indexOf(nums2.length - i - 1);
          }
      
     
    }
    return newArr;
  }

  public static void main(String[] args) {
    One a = new One();

    a.findIntersectionValues(new int[]{1,2,3,4}, new int[]{4,3,2,1});

    int[] i = new int[]{1,1,1};
    System.out.println(Arrays.toString(i));
  }
}
