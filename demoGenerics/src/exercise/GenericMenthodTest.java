package demoGenerics.src.exercise;

public class GenericMenthodTest {
  public static<E> void printArray(E[] inputArray){

    for(E element:inputArray){
      System.out.print("Element = "+element+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Integer[] intArray = {1,2,3,4};
    Double[] doubleArray = {1.1,2.2,3.3};
    Character[] charArray = {'a','b','c'};

    System.out.println("int array:");
    printArray(intArray);

    System.out.println("doubleArray array:");
    printArray(doubleArray);

    System.out.println("charArray array:");
    printArray(charArray);

  }
}
