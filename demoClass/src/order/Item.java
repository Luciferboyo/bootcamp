package demoClass.src.order;

import java.math.BigDecimal;
import java.util.Objects;

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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Item)) {
      return false;
    }

    Item item = (Item)obj;
    return Objects.equals(this.price, item.priceGet())
        && Objects.equals(this.desc, item.descGet())
        && Objects.equals(this.quantity, item.quantityGet());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.desc,this.price,this.quantity);
  }

  /**
   *   private double price;

  private int quantity;

  private String desc;

  private double totalAmount;
   */
}
