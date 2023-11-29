package demoIntArray.src;

public class DemoMenthod {

  //main -> method name
  //public -> or private
  //static method -> tool
  //void ->no return type
  public static void main(String[] args) {
    //javac -> compile command,converting.java->.class
    //java -> run.class file
    int x = 2;
    int y = 10;
    x *= 2;//4
    x += y;
    System.out.println("x = " + x);

    y = 100;
    x = 2;
    x *= 2;
    x += y;
    System.out.println("x = " + x);

    System.out.println("---------------");

    int result10 = sum(3, 10);
    System.out.println("result10 = " + result10);

    int sum1 = sum(10, 10);
    System.out.println("sum1 = " + sum1);

    double d1 = 7.0d;
    double d2 = 2.0d;
    System.out.println(d1/d2);

    System.out.println(division(10, 3));
  }

  //Method name:sum
  //return type:int
  //parameters:No parameter ,one or more than one parameters\
  //f(x) = x + y
  public static int sum(int x,int y){
    int sum = x + y;
    return sum;
  } 
  public static int threeSum(int x,int y,int z){
    int sum = x + y + z;
    return sum;
  }
  public static int threeSum(int x,String y,int z){
    int sum = x + z;
    return sum;
  } 

  public static int substract(int x ,int y){
    return  x - y;
  }

  public static int multiplication(int x ,int y){
    return  x * y;
  }

  public static double division(int divisor ,int dividend){
    return  (double)divisor / dividend;
  }
}
