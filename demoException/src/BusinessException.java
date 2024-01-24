package demoException.src;

public class BusinessException extends Exception{
  
  //Checked exception - compiler requires the exception to be handled during the compile time
  //1.if you throw an unchecked exception,you have to handle it by two ways.
  //1a)Sign the unchecked exception in the method signature
  public BusinessException(String stirng){//Server is unavailable
      super(stirng);
  }

  //isEmailValid();method caller -> compile error
  //The method caller still need to handle the unchecked exception even the method throws alreay.

  //1b)try-catch to handle
  public static boolean isEmailValid(String emailaddr) throws BusinessException{
    if (emailaddr == null || emailaddr.length()>10) {
      //return false;
      throw new BusinessException("emailaddr is too long.the length should be <= 100");
    }
    return true;
  }

  public static boolean isEmailValid2(String emailaddr) throws BusinessException{
    if (emailaddr != null || emailaddr.length()==8) 
      return true;

      return false;
      
  }

  public static void main(String[] args) {
    try{
      isEmailValid("xxxxxxxxxx@gmail.com");
    }catch(BusinessException e){
      //You can do anything affter you catched it.Or do nothing.
    }
  }
}
