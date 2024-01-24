package demoException.src.exercise;

public class PizzaOrderingException extends Exception{
  public PizzaOrderingException(String msg){
    super(msg);
  }

  public PizzaOrderingException(String msg,Throwable e){
    super(msg,e);
  }
}
