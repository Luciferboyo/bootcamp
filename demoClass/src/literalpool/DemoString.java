package demoClass.src.literalpool;

public class DemoString {
  
  public static void main(String[] args) {
    
    String str = "hello";

    String str2 = "hello";//check if "hello" exists in String Literal Pool
    //so that JVM can reuse "hello" object by various object reference

    System.out.println(str.equals(str2));

    System.out.println(str == str2);

    String str3 = "hello!";

    System.out.println(str.equals(str3));

    System.out.println(str == str3);

    String str4 = new String("hello");

    System.out.println(str.equals(str4));//true

    System.out.println(str == str4);//false,"new" force creating an objecat

    String str5 = String.valueOf("hello");

    System.out.println(str == str5);//true,look up literal

    //Concatentation
    String str7 = "abc";
    String str8 = str7 +"def";//best practice to check the value of String

    if ("hello".equals(str5)) {//best practice to check the value of String
      System.out.println("str5 is equal to hello");
    }
    
    String str6 = null;//Java Compiler would Not look at the value assigned to object reference during 
    if (str6.equals("hello")) {//error:java.lang.NullPointerException
      System.out.println("str6 is bad practice to check string value");
    }

    String str12 = "aaaa";
    String str13 = new String("aaabbb").intern();
    String str14 = "aaabbb";

    System.out.println(str13 == str14);//true

    
  }
}
