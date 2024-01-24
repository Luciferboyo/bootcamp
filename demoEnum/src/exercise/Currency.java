package demoEnum.src.exercise;

public enum Currency {
  USD("US Dollar", "Federal Reserve"),
  GBP("Pound Sterling","Bank of England"),
  EUR("Euro","European Central bank"),
  JPY("Japanese Yen", "Bank of Japan"),
  ;

  private final String curringName;
  private final String centralBankName;

  private Currency(String curringName,String centralBankName){
    this.curringName = curringName;
    this.centralBankName = centralBankName;
  }

  public String getCurringName(){
    return this.curringName;
  }

  public String getCentralBankName(){
    return this.centralBankName;
  }

  @Override
  public String toString() {
    return String.format("Currency [currName=%s,centralBankName=%s", this.curringName,this.centralBankName);
  }

  public static Currency printCurrencyConditionally(Currency currency){
    for(Currency cur:Currency.values()){
      if (cur.curringName.equals(currency.getCurringName())) {
        return cur;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    Currency currency = Currency.GBP;
    System.out.println(Currency.printCurrencyConditionally(currency));
  }
}
