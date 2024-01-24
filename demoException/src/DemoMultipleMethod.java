package demoException.src;

public class DemoMultipleMethod {
  public static void main(String[] args) {
    //call methodA
    int a = 10;
    int b = 0;
    try {
      DemoMultipleMethod.methodA(a, b);
    } catch (Exception e) {
      System.out.println("yichang");
    }
  }

  public static int methodA(int x,int y) throws Exception{
    // call methodB
    return DemoMultipleMethod.methodB(x, y);
  }

  public static int methodB(int x,int y) throws Exception{
    // call methodC
    return DemoMultipleMethod.methodC(x, y);
  }

  public static int methodC(int x,int y) throws Exception{
    //what is the difference of throwing checked or uncheckded exception in methodC?
    return x/y;
  }
}
