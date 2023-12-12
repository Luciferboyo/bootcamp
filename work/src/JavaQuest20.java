package work.src;
/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }
  
  public static boolean rotateString(String s, String goal) {

    if (s.length() != goal.length()) {
      return false;
    } 

    char[] charA = s.toCharArray();

    char[] charGoal = goal.toCharArray();

    for(int i = 0; i < charA.length; i++){
      if (charA[i] < 'a' && charA[i] > 'z' || (charGoal[i] < 'a' && charGoal[i] > 'z')) {
        return false;
      }
    }

    String twoS = s + s;

    return twoS.contains(goal);
  }
}
