package demoInterface.src.bank;

import java.util.Arrays;

public class Account implements Transferable{
  
  private int balance;//derived by transactions

  private AccountHolder accountHolder;//name,age,occupation,etc

  private Transaction[] transactions;

  public Account(AccountHolder accountHolder){
    this.balance = 0;
    this.accountHolder = accountHolder;
  }

   public Account(String name, int age){
    this.balance = 0;
    this.accountHolder = new AccountHolder(name,age);
    this.transactions = new Transaction[0];
  }

  //private String type;//Saving,ABC,etc.....

  public boolean credit(int amount){//add
    
    return this.addTransaction(Transaction.now(true, amount));
  }


  public boolean debit(int amount){//deduct
    if (this.balance < amount) 
      return false;

    return  this.addTransaction(Transaction.now(false, amount));
  }

  private boolean addTransaction(Transaction transaction){
    Transaction[] transactions2 = Arrays.copyOf(transactions, this.transactions.length + 1);
    transactions2[transactions2.length - 1] = transaction;
    this.transactions = transactions2;
    return true;
  }

  public int balance(){
    int sum = 0;
    for(int i = 0;i < transactions.length;i++){
      //isCredit true/false
      if (transactions[i].isCredit()) {
        sum += transactions[i].getAmout();
        System.out.println("sum ++ = " + sum);
      }else{
        sum -= transactions[i].getAmout();
        System.out.println("sum -- = " + sum);
      }
    }
    this.balance = sum;
    System.out.println("balance = " + balance);
    return this.balance;
  }



  @Override
  public boolean transfer(Transferable to,int value) {
    if (value <= 0) 
      return false;//throw
    if(this.balance() < value)
      return false;
    Account account = (Account)to;
    if(!account.credit(value))
      return false;
      System.out.println("--------------");
    return this.addTransaction(Transaction.now(false, value));
  }
  public static void main(String[] args) {
    Account account = new Account("John",30);
    /* account.addTransaction(Transaction.now(true, 3000));
    account.addTransaction(Transaction.now(true, 1500));
    account.addTransaction(Transaction.now(false, 4000));
    System.out.println(account.balance());*/

    

    Account account2 = new Account("a",12);
    Account account3 = new Account("b",15);
    account2.addTransaction(Transaction.now(true, 3000));
    //account3.addTransaction(Transaction.now(true, 3000));
    account2.balance();
    account2.transfer(account3, 500);

    System.out.println(account2.balance());
    //System.out.println(account3.balance());

    Object object = new Object();
    Float floatObject1 = Float.valueOf(1.2f);
    Object floatObject2 = Float.valueOf(1.2f);
  
    //floatObject2.compareTo(1.2f) = compile error,bacause type of the reference cannot reach compareTo()
  }
}
