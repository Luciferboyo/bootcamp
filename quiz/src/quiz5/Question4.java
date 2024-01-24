package quiz.src.quiz5;

interface Superman{
  void protect(Children child);
}

interface Children{
  void cry();
}

public class Question4 {
  public static void main(String[] args){
    //1.Override  interface Superman 
    //2.create a Object of Superman
    Superman s = x->x.cry();
    //1.s.protect->method
    //2.()->System.out.println("Yes,I am crying") == override and create Children
    s.protect(()->System.out.println("Yes,I am crying"));
  }
}
