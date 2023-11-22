public class DemoString {
  public static void main(String[] args){
    String emailAddress = "vincent@gmail.com";
    System.out.println(emailAddress);
    String str = "hello"+"world";
    System.out.println(str);
    //Look at the code inside the bracket first
    System.out.println("hello"+" "+"world!");
    //No""
    //"length"
    String str1 = "hello";
    System.out.println(str1);
    System.out.println(str1.length());
    str1 = str1 + "world";
    System.out.println(str1.length());
    str1 += "!!!";
    System.out.println(str1.length());

    //equals,if
    int x = 1;
    int x1 = 1;
    if (x == x1) { // means,asking if they are equals
      System.out.println("x is equals to x1");
    }else{
      System.out.println("hello boyo");
    }
    //String is not a primitive, so  you cannot use == to compare their value
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)) {
      System.out.println("s1 is equals to s2");
    }
    if ("hello".equals(s2)) {// comparing string value to a string variable
      //if (s2.equals("hello"))do not code this way
      System.out.println("s1 is hello");
    }
    //charAt()
    //1 is an index of String
    //Example:"hello", index = 0 -> h
    //s1.charAt(4) return 'o'
    char c = s1.charAt(1);//'l'
    s1 = "Vicent";
    //Approach 1
    int lastCharIndex = s1.length()-1;
    char lastChat = s1.charAt(lastCharIndex);
    //Approach 2
    char lastChat1 = s1.charAt(s1.length() - 1);
    System.out.println(lastChat);
    System.out.println(lastChat1);

    
  }
}
