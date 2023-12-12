package leeCode.src;

public class BB {
  public String largestOddNumber(String num) {
    if (num.length() > 100000 || num.length() < 1) {
      return "The value entered is between 1-10000";
    }
    int number = Integer.parseInt(num);
    int temp = 0;
      for(int i = 0; i < num.length(); i++){
        temp = number % 10;
        if (temp % 2 != 0) {
          return String.valueOf(number);
        }
        number /= 10;
      }
    return "";
  }
  public static void main(String[] args) {
    BB b = new BB();
    System.out.println(b.largestOddNumber("10133890"));
  } 
}
