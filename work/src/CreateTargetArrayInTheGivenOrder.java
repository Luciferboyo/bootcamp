package work.src;

import java.util.Arrays;

class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[0];
        for(int i = 0;i < nums.length;i++){
            arr = insertArray(nums[i],index[i],arr);
        }
        return arr;
    }

    public static int[] insertArray(int number,int index,int[] array){
        int[] newArr = new int[array.length+1];
        int temp = 0;
        if(index >= array.length){
            newArr = Arrays.copyOf(array, array.length+1);
            newArr[array.length] = number;
            return newArr;
        }
        for(int i = 0;i < array.length;i++){
            if(index == i){
                temp = array[i];
                newArr[i] = number;
                newArr[i+1] = temp;
            }else {
                newArr[i] = array[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
      CreateTargetArray array = new CreateTargetArray();
      System.out.println(Arrays.toString(array.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})));
    }
}