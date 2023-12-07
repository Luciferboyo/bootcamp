package demoClass.src.order;

import java.math.BigDecimal;

public class Item {
  
  private double price;

  private int quantity;

  private String desc;

  private double totalAmount;

  //All-args,constructor

  public Item(){

  }

  public Item(double price,int quantity,String desc){
    this.price = price;

    this.quantity = quantity;

    this.desc = desc;
  }

  //price getter,setter

  public double priceGet(){
    return this.price;
  }

  public void priceSet(double price){
    this.price = price;
  }

 //quantity getter,setter

  public int quantityGet(){
    return this.quantity;
  }

   public void quantitySet(int quantity){
    this.quantity = quantity;
  }

  //desc getter,setter

  public String descGet(){
    return this.desc;
  }

   public void descSet(String desc){
    this.desc = desc;
  }
  
  public double totalAmount(){

    return BigDecimal.valueOf(quantity).multiply(BigDecimal.valueOf(price)).doubleValue();
  
  }

}
