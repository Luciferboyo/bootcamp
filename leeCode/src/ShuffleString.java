package leeCode.src;

public class ShuffleString {
  public String restoreString(String s, int[] indices) {
      char[] charArr = s.toCharArray();
      int index = 0;
      char c = ' ';
      char[] newArr = new char[s.length()];

      for(int i = 0;i < indices.length; i++){
        index = indices[i];
        c = charArr[i];
        newArr[index] = c;
      }
      return String.valueOf(newArr);
  }

  public static void main(String[] args) {
    
  }
}
