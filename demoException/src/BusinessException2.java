package demoException.src;

public class BusinessException2 extends Exception{

  private int code;

  public BusinessException2(SysCode sysCode){
    this(sysCode.getCode(),sysCode.getMessage());
  }

  private BusinessException2(int code,String message){//Server is unavailable
    super(message);
    this.code = code;
  }

  public static void main(String[] args) {
    try {
      throw new BusinessException2(SysCode.SERVER_TIMEOUT);
    } catch (BusinessException2 e) {
      
    }
  }
}
