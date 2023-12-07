package leeCode.src;

class Solution {
    public int maximum69Number(int num) {
      char[] c = Integer.toString(num).toCharArray();

      for(int i = 0;i < c.length; i++){
        if (c[i] == '6') {
          c[i] = '9';
          break;
        }
      }
      return Integer.parseInt(String.valueOf(c));
    }


    public static void main(String[] args) {

      Solution solution = new Solution();

      System.out.println(solution.maximum69Number(9699));
    }
}

