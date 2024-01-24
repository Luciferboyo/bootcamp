package demoRecursion.src;

public class DemoRecursion {
  public static void main(String[] args) {

    //1+2+3+4+5->15
    int sum = 0;
    for(int i = 1;i < 6;i++){
      sum += i;
    }
    System.out.println(sum);//15
  }

  public static int sum(int n){
    if(n == 1){
      return 1;
    }
    return n+sum(n-1);
  }

  //
  public static int Multiplication(int n){
    if(n <= 2){
      return n == 2?2:1;
    }
    return n*Multiplication(n-2);
  }
}
