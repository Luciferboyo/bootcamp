package demoOptional.src.exercise;

import java.util.Arrays;
public enum OrderStatus{
  CONFIRMED(1,"Ordered"),
  PAID(2,"Paid"),
  READY_TO_SHIP(3,"Ready To Ship"),
  DELIVERED(4,"Delivered"),
  UNKNOWN(99,"Unknown"),
  ;

  private final int code;
  private final String value;

  private OrderStatus(int code,String value){
    this.code = code;
    this.value = value;
  }

  public int getCode(){
    return this.code;
  }

  public String getValue(){
    return this.value;
  }
  
  public OrderStatus fromCode(int code){
    return Arrays.stream(OrderStatus.values()).filter(e->e.getCode() == code)
                  .findFirst().orElseThrow(() -> new IllegalArgumentException());
  }
}