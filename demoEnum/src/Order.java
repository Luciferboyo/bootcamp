package demoEnum.src;

import java.util.Objects;

public class Order {
  
  private int id;

  private Status status;

  public Order(){

  }

  public Order(int id,Status status){
    this.id = id;
    this.status = status;
  }

  public int getId(){
    return this.id;
  }

  public Status getStatus(){
    return this.status;
  }

  public static void main(String[] args) {
    Order order1 = new Order(1,Status.ORDERD);
    Order order2 = new Order(1,Status.ORDERD);

    if (order1.getStatus() != order2.getStatus()) {
        System.out.println("differ status");
    }

    if (order1.getStatus().getVal() == order2.getStatus().getVal()) {
      System.out.println("_________________");
    }
    System.out.println(order1.getStatus().getVal());
  }

  @Override
  public int hashCode() {
    
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Order)) {
      return false;
    }
    Order order = (Order)obj;
    return Objects.equals(this.id, order.getId())
          && Objects.equals(this.status, order.getStatus());
  }
}
