package demoClass.src;

public class Bo {
  public static void main(String[] args) {
    System.out.println(titleToNumber("A"));  // 输出: 1
    System.out.println(titleToNumber("B"));  // 输出: 2
    System.out.println(titleToNumber("Z"));  // 输出: 26
    System.out.println(titleToNumber("AA")); // 输出: 27
    System.out.println(titleToNumber("AB")); // 输出: 28
    System.out.println(titleToNumber("ZY")); // 输出: 701
  }

  public static int titleToNumber(String columnTitle) {
    int result = 0;
    for (int i = 0; i < columnTitle.length(); i++) {
        char c = columnTitle.charAt(i);
        result = result * 26 + (c - 'A' + 1);
    }
    return result;
  }
}
