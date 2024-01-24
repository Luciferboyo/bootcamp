package demoException.src;

public class DemoUncheckedException {

  private double balance;
  public static void main(String[] args) {
    double result;
    //Example 2 :double/double -> 10.0/0.0 ->Infinity or -Infinity
    try {
      System.out.println("before");
      result = divide(10.0d, 0.0d);
      if (Double.isNaN(result)) {
        System.out.println("after");//Infinity
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("ArithmeticException");
      result = 0.0d;
    }
    System.out.println("result = "+result);
    System.out.println("-------------------");
    System.out.println(Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY);
    System.out.println(0.0 / 0.0);
    System.out.println(Math.sqrt(-1.0));//平方根（square root）
    System.out.println(Math.log(-1.0));//对数（logarithm）
  }

  public static double divide(double x,double y){
    return x/y;//Potentially run-time exception - ArighmeticException
  }
  
  public static double divide(int x,int y)throws ArithmeticException{
    return x/y;//Potentially run-time exception - ArighmeticException
  }

  public boolean deposit(double amout){
    if(amout <= 0.0d){
      throw new IllegalArgumentException();
    }
    this.balance += amout;
    return true;
  }
}
