package leeCode.src;

public class SplitAStringInBalancedStrings {
  public int balancedStringSplit(String s) {
    int count = 0;
    int balance = 0;

    for (char ch : s.toCharArray()) {
        if (ch == 'L') {
            balance++;
        } else if (ch == 'R') {
            balance--;
        }
        if (balance == 0) {
            count++;
        }
    }

    return count;
  }
  public static void main(String[] args) {
    SplitAStringInBalancedStrings sp = new SplitAStringInBalancedStrings();
    System.out.println(sp.balancedStringSplit("RRRLLLRL"));
  }
}
