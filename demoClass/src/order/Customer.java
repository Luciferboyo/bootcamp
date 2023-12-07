package demoClass.src.order;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Customer {
  //17 type(String,Wraper Classes,Primitives)
  private Order[] orders;

  private int age;

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

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
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

  public boolean deleterOder(int orderId){
    
    boolean find = false;

    int idx = 0;

    for(int i = 0; i < this.orders.length; i++){
      
      Order[] newOrders = new Order[this.orders.length - 1];

      if (this.orders[i].getId() == orderId) {
        idx = i;
        find = true;
      }
      if(find || i < this.orders.length - 1){
        ++idx;
        newOrders[i] = this.orders[idx];
      }
    }
    return find;
  }

  public Order getOrder(int orderId){

    Order order = new Order();

    for(int i = 0;i < orders.length; i++){
      if (orders[i].getId() == orderId) {
        order = orders[i];
        return order;
      }
    }
    return null;
  
  }

  public boolean isAdult(){

    return this.age >= 18;

  }

  public boolean isVIP(){
    return this.orders.length >= 100;
  }

  public char membership(){//'G','S','N'

      if (this.orders.length >= 150) {
        return 'G';
      }else if (this.orders.length <= 200) {
        return 'S';
      }
      
      return 'N';
    
  }

  public static void main(String[] args) {


    
    Customer customer = new Customer();

    Order[] orders = new Order[3];

    Random random = new Random();
    
    int randomId = random.nextInt();

    LocalDate localDate1 = LocalDate.now();

    Order order1 = new Order(randomId,localDate1);


    orders[1] = order1;

    customer.setter(orders);

    order1.setTotalAmout(1111);

    System.out.println(customer.toString());

    customer.setAge(18);
  }
}
