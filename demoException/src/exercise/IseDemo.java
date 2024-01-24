package demoException.src.exercise;

/**
 * IseDemo
 */
public class IseDemo {

  public static void print(int a,int b){
    System.out.println("Addition of Positive Integers:"+(a+b));
  }

  public static void main(String[] args) {
    int n1 = 7;
    int n2 = -3;
    if (n1+n2 > 0) {
      IseDemo.print(n1, n2);
    }else{
      throw new IllegalThreadStateException("Either one or two number are not Positive Integer");
    }
  }
}