package demoLoop2.src;

public class DemoDoWhileLoop {
  public static void main(String[] args) {
    int j = 0;
    while (j < 0) {//not fulfill
      //
    }
    for(int i = 0;i < 0;i++){

    }

    //Do-while:always execute once,no matter the condition
    do {
      System.out.println("hello");
    } while (j < 0);

    do {
      System.out.println("j = " + ++j);
    } while (j < 4);
    System.out.println("--------------");
    int i = 0;
    while (++i < 5) {
      System.out.println("i = " + i);
    }
  }
}
