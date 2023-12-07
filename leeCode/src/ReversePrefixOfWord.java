package leeCode.src;

public class ReversePrefixOfWord {
  public String reversePrefix(String word, char ch) {
    char[] charArr = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(ch == charArr[i]){;
                charArr[i] = word.charAt(word.length() - i -1);
                charArr[charArr.length - i -1] = word.charAt(i);
                break;
            }
        }
        return String.valueOf(charArr);
  }
}
