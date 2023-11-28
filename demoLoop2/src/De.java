package demoLoop2.src;

public class De {
  public static void main(String[] args) {
        int odd1 = 0;
       while (odd1++ < 10) {
          if(odd1 % 2 == 0){
               continue;
          }
          System.out.println(odd1);
       }
  }
}
