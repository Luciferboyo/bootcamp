package demoInterface.src.bank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
  //enum

  //String description
  //String from

  private LocalDateTime dateTime;

  private boolean isCredit;//enum

  private int amount;

  private Transaction(LocalDateTime dateTime,boolean isCredit,int amount){
    this.dateTime = dateTime;
    this.isCredit = isCredit;
    this.amount = amount;
  }

  public Transaction(boolean isCredit,int amount){
    this(LocalDateTime.now(), isCredit, amount);
  }

  public static Transaction now(boolean isCredit,int amount){
    return new Transaction(isCredit, amount);
  }

  public int getAmout(){
    return this.amount;
  }

  public boolean isCredit(){
    return this.isCredit;
  }

  @Override
  public String toString() {
    return "Transaction(dateTime="
    +this.dateTime+",isCredit="
    +this.isCredit+",amount="+this.amount+")";
  }
}
