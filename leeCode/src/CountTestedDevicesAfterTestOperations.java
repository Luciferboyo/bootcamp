package leeCode.src;

public class CountTestedDevicesAfterTestOperations {
  public int countTestedDevices(int[] batteryPercentages) {
    int result = 0;
    
    for(int i = 0;i < batteryPercentages.length;i++){
      if (batteryPercentages[i] > 0) {
        result++;
        for(int j = i + 1;j < batteryPercentages.length;j++){
          batteryPercentages[j]--;
        }
      }
    }

    return result;
  }
  public static void main(String[] args) {
    CountTestedDevicesAfterTestOperations c = new CountTestedDevicesAfterTestOperations();
    System.out.println(c.countTestedDevices(new int[]{3,1,1,3}));
  }
}
