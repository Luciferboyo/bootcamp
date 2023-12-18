package leeCode.src;

public class RichestCustomerWeather {
  public int maximumWealth(int[][] accounts) {
    int wealth = 0;
    int sum = 0;
    for(int i = 0; i < accounts.length;i++ ){
        for(int j = 0;j < accounts[i].length;i++){
            sum += accounts[i][j];
        }
        if(wealth < sum){
            wealth = sum;
        }
    }
    return wealth;
  }

}
