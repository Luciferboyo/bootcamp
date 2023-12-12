package leeCode.src;

/**
 * LargestOddNumberInString
 */
public class LargestOddNumberInString {

    public class Main {
        public static void main(String[] args) {
            System.out.println(largestOddSubstr("52"));      // Output: "5"
            System.out.println(largestOddSubstr("4206"));    // Output: ""
            System.out.println(largestOddSubstr("35427"));   // Output: "35427"
        }
    
        public static String largestOddSubstr(String num) {
            String largestOdd = "";
            int n = num.length();
    
            for (int i = 0; i < n; i++) {
                char currentChar = num.charAt(i);
    
                // Check if the current character is odd
                if ((currentChar - '0') % 2 == 1) {
                    // Expand the substring to the left and right as long as the substring remains odd
                    int left = i;
                    int right = i;
    
                    while (left >= 0 && (num.charAt(left) - '0') % 2 == 1) {
                        left--;
                    }
    
                    while (right < n && (num.charAt(right) - '0') % 2 == 1) {
                        right++;
                    }
    
                    // Extract the odd substring directly without using substring method
                    String currentOdd = num.substring(left + 1, right);
    
                    // Update the largestOdd if the currentOdd is greater
                    if (currentOdd.length() > largestOdd.length()) {
                        largestOdd = currentOdd;
                    }
                }
            }
    
            return largestOdd.isEmpty() ? "" : largestOdd;
        }
    }
    
}