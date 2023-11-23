public class DemoSwitch {
    public static void main(String[] args) {
      //if,else-if -> comparison and logical operators

      //switch:single value compartion(==)
      char grage = 'C';
      switch (grage){
        case 'A':
          System.out.println("grade = A");
        case 'B':
          System.out.println("grade = B");
        case 'C':
          System.out.println("grade = C");
        case 'D':
          System.out.println("grade = D");
        case 'E':
          System.out.println("grade = E");
      }
      //switch: sing value compartion
      char vipGrade = 'N';//G /S/ N
      double discount = 0.0d;//Silver(S) -> 10%, Gold(G) -> 20%
      switch (vipGrade) {
        case 'G':
          discount += 0.1d;  
        case 'S':
          discount += 0.1d; 
        case 'N':
      }
      System.out.println(discount);
      //break
       switch (vipGrade) {
        case 'G':
          discount += 0.2d;
          break;  
        case 'S':
          discount += 0.1d; 
          break;
        case 'N':

        default://other characters
      }

      
  }
}
