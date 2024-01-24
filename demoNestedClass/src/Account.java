package demoNestedClass.src;

public class Account {

  private AccountHolder accountHolder;

  public Account(AccountHolder accountHolder){

    this.accountHolder = accountHolder;

  }
  
  public class AccountHolder {

    
    private String name;

    public AccountHolder(String name){
      this.name = name;
    }

    public Account getAccount(){
      return Account.this;
    }
  }

  public static void main(String[] args) {
    Account account = new Account(null);
    AccountHolder accountHolder = account.new AccountHolder("bobo");
    Account account2 = accountHolder.getAccount();

    Account.AccountHolder accountHolder2 = account.new AccountHolder("bo");
    System.out.println("account = "+account);
    System.out.println("accountHolder = " + accountHolder);
    System.out.println("account2 = "+account2);
   
  }
}
