package work.src;
/*
 * Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public boolean sameNumberOfVowels(String s) {
    // code here
    String str = "aeiou";
    int firstCount = 0;
    int lastCount = 0;
    String temp;
    for(int i = 0;i < s.length();i++){
      temp = String.valueOf(s.charAt(i)).toLowerCase();
      if (i < s.length()/2) {
        if (str.contains(temp)) {
            firstCount++;
        }
      }else{
        if (str.contains(temp)) {
          lastCount++;
        }
      }
    }
    return firstCount == lastCount;
  }

  public static void main(String[] args) {
    JavaQuest23 a = new JavaQuest23();
    System.out.println(a.sameNumberOfVowels("abab"));
    System.out.println(a.sameNumberOfVowels("abbb"));
    System.out.println(a.sameNumberOfVowels("aaab"));
    System.out.println(a.sameNumberOfVowels("Abab"));
    System.out.println(a.sameNumberOfVowels("bAab"));
  }
}
