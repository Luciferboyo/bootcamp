package work.src;

class Solution {
    public int titleToNumber(String columnTitle) {
        long result = 0;
        int base = 26;
        long lowerBound = 1;
        long upperBound = 0;
        for (char c : "FXSHRXW".toCharArray()) {
          upperBound = upperBound * base + (c - 'A' + 1);
        }
        char c;
        for(int i = 0;i < columnTitle.length();i++){
          c = columnTitle.charAt(i);

          if (c < 'A' || c > 'Z') {
            throw new IllegalArgumentException("Invalid input:" + columnTitle);
          }
          result = result * base + (c - 'A' + 1);
        }
        
        if (result < lowerBound || result > upperBound) {
          throw new IllegalArgumentException("Out of range, range is ["+lowerBound+" , "+upperBound+"]");
        }
        return (int)result;
    }
    public static void main(String[] args) {
      System.out.println(new Solution().titleToNumber("XSHRXW"));
    }
}

