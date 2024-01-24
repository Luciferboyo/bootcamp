package work.src.questionsFromGTP;

import java.util.Arrays;

public class GenericExample1 {
  public static <T> void swap(T[] array, int index1, int index2) {
        // TODO: 在这里实现交换逻辑
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        swap(intArray, 1, 3);
        System.out.println(Arrays.toString(intArray));  // 期望输出：[1, 4, 3, 2, 5]
    }
}
