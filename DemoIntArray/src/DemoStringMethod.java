package demoIntArray.src;

public class DemoStringMethod {
  public static void main(String[] args) {
    String str = "   hello world!";
    //empty
    if (str.isEmpty()) {
      System.out.println("String = " + str);
    }

    System.out.println("str length = " + str.length());

    //chatAt()
    //even number index of the character in string
    for(int i = 0; i < str.length();i++){
      if (i % 2 == 0) {
        System.out.println(str.charAt(i));
      }
    }
    System.out.println("--------------------------");
    //substring()
    //substring(startIndex,endIndex - 1)
    //substring(startIndex)
    String s = "hello";
    String newStr = s.substring(2, 5);//index start from 0
    System.out.println(newStr);

    //trim(),remove all spaces in the head and tail of the string
    //str = "hello world!"
    System.out.println(str.trim());
    System.out.println(newStr.trim());//"ll"
    System.out.println(s.substring(2));//"llo"

    String s2 = "Hello,World!";
    System.out.println(s2.toUpperCase());
    System.out.println(s2.toLowerCase());

    //equals()
    //equalsIgnoreCase()
    System.out.println("hello,world!".equals(s2));
    System.out.println("hello,world!".equalsIgnoreCase(s2));

    //startsWith("")
    //endsWith("")
    System.out.println(s2.startsWith("H"));//true
    System.out.println(s2.startsWith(""));//true
    System.out.println(s2.startsWith(" "));//false

    System.out.println(s2.endsWith("!"));//true
    System.out.println(s2.endsWith("world!"));//true
    System.out.println(s2.endsWith("World!"));//false

    String s3 = "123456780";
    //You try 2 String methods, and use && operator to check true/false

    System.out.println("-=-----------------------");
    System.out.println("23456780".equals(s3.substring(1)));
    System.out.println("123456".equalsIgnoreCase(s3.toLowerCase()));

    //indexOf
    System.out.println(s3.indexOf('7'));

    //searching '7' starting from index 8
    System.out.println(s3.indexOf('7',6));//-1

    //lastIndexOf()
    String s4 = "123451235";
    System.out.println(s4.lastIndexOf("5"));//8
    System.out.println(s4.indexOf("5"));//4

    System.out.println(s4.indexOf("12"));//0
    System.out.println(s4.indexOf("1  2"));//-1

    System.out.println(s4.lastIndexOf("12"));//5
    System.out.println(s4.lastIndexOf("1 2"));//-1
    System.out.println(s4.lastIndexOf('1',1));

    String s5 = "ABabc1abcdef";
    System.out.println(s5.lastIndexOf("abc") == 6
    && s5.endsWith("def")
    && s5.indexOf("abc") == 2 
    && s5.startsWith("ABa")
    && s5.length() > 10);

    String s6 = "abc";
    String s7 = "def";
    System.out.println(s6 + s7);//"abcdf"
    System.out.println(s6.concat(s7));

    System.out.println(s7.contains("abcdef"));
    System.out.println(s5.indexOf("abcdef") != -1);//true
    
    System.out.println(s7.contains("def"));//false

    String result = s5.toUpperCase();
    System.out.println(result);
    String result2 = result.substring(3,5);//BC
    System.out.println(result2);

    String result3 = s5.toUpperCase().substring(3,5);
    System.out.println(result3);

    String love = "i am ".concat("love you");
    System.out.println(love);
  }
}
