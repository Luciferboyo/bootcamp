package demoInterface.src;

public class Two {

    public boolean canBeEqual(String s1, String s2) {
      if (s1.equals(s2)) {
        return true;
      }
      char[] charArr1 = s1.toCharArray();
      char[] charArr2 = s2.toCharArray();
      int count = 0;
      for(int i = 0;i < 4;i++){
        if (i < 2) {
          if (charArr1[i] == charArr2[i + 2] ) {
            count++;
          }
        }else{
          if (charArr1[i] == charArr2[i - 2] && i < 4) {
              count++;
          }
        } 
      }
      return count == 4;
  }
}