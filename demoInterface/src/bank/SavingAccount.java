package demoInterface.src.bank;

public class SavingAccount extends Account{
  
  public SavingAccount(String name,int age){
    super(name,age);
  }

  @Override
  public String toString() {
    return "AccountHolder(name=";
  }
}
