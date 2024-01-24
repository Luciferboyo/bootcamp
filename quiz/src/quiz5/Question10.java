package quiz.src.quiz5;

class TryBest{
  public static long fibonacci(long number){
    if (number == 0 || number == 1) {
        return number;
    }
    return fibonacci(number-1)+fibonacci(number-2);
  }
}
public class Question10 {
  public static void main(String[] args) {
    System.out.println(TryBest.fibonacci(4));
  }

  /*
   * 4  
   * 3 -> 1, 2->1,0   == 1
   * 2 ->1,0 == 1
   * 
   * 
   * 4-2 -> 2 ->1,0 == 1
   * 
   * so return (1+1)+1
   */
}
