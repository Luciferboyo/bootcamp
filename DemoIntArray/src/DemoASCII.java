package DemoIntArray.src;

public class DemoASCII {
  public static void main(String[] args) {
    char value = 'C';
    int ascii = value;//67
    System.out.println(ascii);
    System.out.println(value == 67);//true
    System.out.println(value > 64);//true
    System.out.println(value < 69);//false

    int ascii2 = '!';
    System.out.println(ascii2);

    //remember 0,a,A

    char c2 = '开';
    int ascii3 = c2;
    System.out.println(ascii3);//22909

    String s1 = "abcdef";
    String s2 = "banana";
    String s3 = "ABCDEF";
    String s4 = "accdeff";
    String s5 = "abcd";
    String s6 = "abcA";

    System.out.println(s2.compareTo(s1));//1('b' - 'a')
    System.out.println(s1.compareTo(s2));//1('a' - 'b')

    System.out.println(s3.compareTo(s1));//('A' - 'a')65 - 97
    System.out.println(s1.compareTo(s3));//('a' - 'A')97 - 65
    
    System.out.println(s4.compareTo(s1));//because same 'a', then compare second charater('b' - 'a')1
    
    System.out.println(s5.compareTo(s1));//-2 s5.length - s1.length

    System.out.println(s6.compareTo(s1));//-35 'A' - d 65 - 100
  }
}
