package demoIntArray.src;

public class DemoStringLiteral {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    System.out.println("s1 address is " + String.class.getName() + "@" + Integer.toHexString(System.identityHashCode(s1)));
    System.out.println("s2 address is " + String.class.getName() + "@" + Integer.toHexString(System.identityHashCode(s2)));
    System.out.println(s1.equals(s2));

    System.out.println(s1 == s2);

    String s3 = new String("hello");
    System.out.println("new String() address is " + String.class.getName() + "@" + Integer.toHexString(System.identityHashCode(s3)));
    System.out.println(s1.equals(s3));
    System.out.println(s1 == s3);

    String s4 = String.valueOf("hello");
    System.out.println("String.valueOf address is " + String.class.getName() + "@" + Integer.toHexString(System.identityHashCode(s4)));
      
    s1 = "hello2";
    System.out.println("-------------------------");
    System.out.println("s1 address is " + String.class.getName() + "@" + Integer.toHexString(System.identityHashCode(s1)));
    s2 = s2 + "2";
    System.out.println("new s2 is "+ String.class.getName() + "@" + Integer.toHexString(System.identityHashCode(s2)));  
    
  }
}
