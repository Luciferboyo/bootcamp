package demoClass.src.order;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {

  private int id;

  private LocalDate buDate;

  //totalAmout derived by Item[]
  //private double totalAmount;

  private Item[] items;

  private static int orderNo;

  public Order(){

  }

  public Order(int id,LocalDate buDate,Item[] items){
    this.id = ++orderNo;
    this.buDate = buDate;
    this.items = items;
    //this.totalAmount = totalAmount;
  }

  public Order(int id,LocalDate buDate){
    this.buDate = buDate;
    this.id = id;
    this.items = new Item[0];
  }

  public void setTotalAmout(double amount){
    //this.totalAmount = amount;
  }
  
  public int getId(){
    return this.id;
  }

  public LocalDate getbuDate(){
    return this.buDate;
  }

  public void setbuDate(LocalDate date){
    this.buDate = date;
  }

  public double totalAmout(String desc){

    double totalAmount = 0.0d;

    for(int i = 0; i < this.items.length; i++){

      if (this.items[i].descGet().equals(desc)) {
        //totat = total + item.price * item.quantity
        totalAmount = BigDecimal.valueOf(this.items[i].priceGet()).
                      multiply(BigDecimal.valueOf(this.items[i].quantityGet())).doubleValue();
      }

    }
    return totalAmount;
  }

  private void addItem(Item item){
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public static double totalAmount1(Item[] items){
    
    BigDecimal total = BigDecimal.valueOf(0);
    
    for(int i = 0; i < items.length; i++){
      
      total = total.add(BigDecimal.valueOf(items[i].totalAmount()));
    }

    return total.doubleValue();
  }




  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Order (id = " + this.id + ",buDate = " + buDate  + ")";
  } 

  public static void main(String[] args) {
    Item[] items = new Item[]{new Item(1,1,"1"),new Item(2,2,"2")};  

    LocalDate date = LocalDate.now();

    Order order = new Order(11,date,items);

    System.out.println(order.totalAmout("2"));

    order.addItem(new Item(3,3,"3"));

    System.out.println(order.totalAmout("1"));

    int a = 0;
    
    int b = 0;

    a = a++;

    b = a++;
    System.out.println("----------------");
    System.out.println(a);
    System.out.println(b);
  }

}