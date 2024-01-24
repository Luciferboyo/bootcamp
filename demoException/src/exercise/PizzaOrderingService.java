package demoException.src.exercise;



public class PizzaOrderingService {
  //method
  public void order(String orderId) throws CustomException{
    while (!timeOutThresholdExceeded()) {
      return;
    }
    //or use try catch
    try{
      throw new PizzaOrderingException("The ordering took too long!");
    }catch(PizzaOrderingException e){
      //nothing
      throw new CustomException();
    }
  }

  private boolean timeOutThresholdExceeded(){
    return true;
  }
}


class CustomException extends Exception {
  CustomException(){
    super("Custom Exception");
  }
}