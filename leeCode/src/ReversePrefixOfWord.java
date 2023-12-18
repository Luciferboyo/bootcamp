package leeCode.src;

public class ReversePrefixOfWord {
  public String reversePrefix(String word, char ch) {
    char[] oldArr = word.toCharArray();
    int index = word.indexOf(ch);

    if (index == -1 || index == 0) {
      return word;
    }

    char[] newArr = new char[oldArr.length];

    for(int i = 0;i < oldArr.length;i++){
      if(i <= index / 2){
        newArr[i] = oldArr[index - i];
        newArr[index - i] = oldArr[i];
      }else if (i > index) {
        newArr[i] = oldArr[i];
      }
    }
    return String.valueOf(newArr);
  }

  public static void main(String[] args) {
    ReversePrefixOfWord r = new ReversePrefixOfWord();
    System.out.println(r.reversePrefix("abvcd", 'c'));
  }
}
