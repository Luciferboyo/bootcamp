package demoIntArray.src;

public class DemoMenthod2 {
  public static void main(String[] args) {
    System.out.println(strAdd("I ", "am ", "bo!"));
    System.out.println(remove("1111122211111111", "222"));
    System.out.println(getLastChar("") + "111");
  }
  
  public static String strAdd(String str1,String str2){
    return str1.concat(str2);
  }
  public static String strAdd(String str1,String str2,String str3){
    return str1.concat(str2).concat(str3);
  }
  public static String strAdd(String str1,String str2,String str3,String str4){
    return str1 + str2 + str3 + str4;
  }
  public static char getLastChar(String str1){
    if (str1.length() < 1) {
      return ' ';
    }
      return str1.charAt(str1.length() - 1);
  }
  public static boolean isStarteWith(String s,String prefix){
    return s.startsWith(prefix);
  }
  public static String remove(String str1,String toBeRemoved){
    return str1.replace(toBeRemoved,"");
  }
}
