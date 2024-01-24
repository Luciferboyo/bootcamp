package demoException.src;

public enum SysCode {
  //1-1000(reserved for error)
  SERVER_TIMEOUT(1,"Server Connection Time Out."),
  //1001-2000(reserved for warning)
  DB_TIMEOUT(2,"Data Loading Time Out"),
  EMAIL_TOO_LONG(3,"Email too long"),
  ;



  private int code;
  private String message;
  

  private SysCode (int code,String message){
    this.message = message;
    this.code = code;
  }

  public String getMessage(){
    return this.message;
  }

  public int getCode(){
    return this.code;
  }
}
