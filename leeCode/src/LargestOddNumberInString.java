package leeCode.src;

/**
 * LargestOddNumberInString
 */
public class LargestOddNumberInString {

  public String largestOddNumber(String num) {
        
    int number = Integer.parseInt(num);
        int temp = 0;
        int max = 0;
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            temp = number % 10;
            number /= 10;
            if(temp % 2 != 0){
                max = temp;
            }else{
              ++count;
            }
        }
        if(max == 0){
            return num + " is already an odd number";
        }else if(count == num.length()){
            return "There are no odd numbers in " + num;
        }

        return String.valueOf(max);
    }
  
}