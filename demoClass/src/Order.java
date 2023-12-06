package demoClass.src;

import java.sql.Date;
import java.time.LocalDate;

public class Order {
  private int id;

  private LocalDate buDate;

  private double totalAmount;

  public Order(){

  }

  public Order(int id,LocalDate buDate, double totalAmount){
    this.id = id;
    this.buDate = buDate;
    this.totalAmount = totalAmount;
  }

  public void setTotalAmout(double amount){
    this.totalAmount = amount;
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

  public double getTotalAmout(){
    return this.totalAmount;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Order (id = " + this.id + ",buDate = " + buDate + ",totalAmount = " + totalAmount + ")";
  } 
}
