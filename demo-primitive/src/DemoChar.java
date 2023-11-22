public class DemoChar {
  public static void main(String[] args) {
    //char means character
    char c1 = 'a';
    char c2 = 'b';
    char c3 = ' ';
    char c4 = '#';
    char c5 = '1';
    char c10 = 97;//char->int
    //char c6 = '11'; syntax error, string -> char
    //char c8 = '';syntax error, char has to be at least one character
    //char c7 = '11'; syntax error, char value should be single character
    String s = "10";

    String isPassed = "P";//or"F
    char isPassed2 = 'P';//or"F
    boolean isPassed3 = true;
    System.out.println("----------------");
    System.out.println(c10);
    System.out.println("---------------------");
    String str1 = "hello";
    System.out.println(str1);
    System.out.println(str1.length());
    str1 = str1 + "world";
    System.out.println(str1.length());
    str1 += "!!!";
    System.out.println(str1.length());
    
  }
}
