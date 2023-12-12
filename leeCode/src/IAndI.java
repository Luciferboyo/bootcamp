package leeCode.src;


public class IAndI {
  public static void main(String[] args) {
    //i++
    int i = 0;

    int j = i++;//j = i = 0 -> i + 1 = 1 ;so j = 0, i = 0

    System.out.println("j = " + j);
    System.out.println("i = " + i);

    int a = 0;
    
    int b = 0;

    a = a++;

    b = a++;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
