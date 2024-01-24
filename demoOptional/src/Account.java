package demoOptional.src;

public class Account {
  
  private double balance;

  private int accountNo;
  //Important Note:
  //Optional<T> is not suitable for Class attribute
  //Option<T> does not support serialization/deserialization natually
  //private Option<String> currency

  public Account(int accountNo,double balance){
    this.accountNo = accountNo;
    this.balance = balance;
  }

  private Account(){

  }

  public double getBalance(){
    return this.balance;
  }

  public int getAccountNo(){
    return this.accountNo;
  }

  public void credit(double amount){
    this.balance += amount;
  }

  public boolean debit(double amout){
    if (this.balance < amout) {
      return false;
    }
    this.balance -= amout;
    return true;
  }

  public static Account setup(int accountNo,double balance){
    
    return new Account(accountNo,balance);
  }
}
