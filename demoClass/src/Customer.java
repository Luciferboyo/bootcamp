package demoClass.src;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Customer {
  //17 type(String,Wraper Classes,Primitives)
  private Order[] orders;

  public Customer(){
    
  }

  public Customer(Order[] orders){
    this.orders = orders;
  }
  public Customer(Order order){
    this.orders = new Order[]{order};
  }

  public Order[] getter(){
    return this.orders;
  }

  public void setter(Order[] orders){
    this.orders = orders;
  }

  public boolean updateOrderAmout(int orderId,double totalAmount){
    for(int i = 0;i < this.orders.length; i++){
      if (this.orders[i].getId() == orderId) {
        this.orders[i].setTotalAmout(totalAmount);
        return true;
      }
    }
    return false;
  }
  //Setter
  public void addOrder(Order order){
    Order[] orders2 = Arrays.copyOf(this.orders, this.orders.length + 1);
    orders2[orders2.length - 1] = order;
    System.out.println("addOrder's OrderId is" + order.getId());
  }

  public static void main(String[] args) {
    
    Customer customer = new Customer();

    Order[] orders = new Order[3];

    Random random = new Random();
    
    int randomId = random.nextInt();

    LocalDate localDate1 = LocalDate.now();

    Order order1 = new Order(randomId,localDate1,1000.0d);


    orders[1] = order1;

    customer.setter(orders);

    order1.setTotalAmout(1111);

    System.out.println(customer.toString());
  }
}
