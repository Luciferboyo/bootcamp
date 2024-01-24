package demoException.src.exercise;

public class ClassNotFoundExceptionDemo {
  public static void main(String[] args) {
    try {
      Class.forName("Class1");
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
      System.out.println("Class Not Found...");
    }
  }
}
