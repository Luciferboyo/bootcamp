package work.src;
/**
 * Expected Output:
 * 
 */
public class ForLoopAndMethod {
      public static void main(String[] args) {
          int n = 2; // 你可以修改n的值来生成不同行数的杨辉三角形
          printPascalTriangle(n);
      }
  
      // 使用for循环生成杨辉三角形的前n行并打印出来
      public static void printPascalTriangle(int n) {
          for (int i = 0; i < n; i++) {
              int number = 1;
  
              // 打印每一行的空格
              for (int j = 0; j < n - i - 1; j++) {
                  System.out.print("   ");
              }
  
              // 打印每一行的数字
              for (int j = 0; j <= i; j++) {
                  System.out.print("   ");
                  System.out.print(number);
                  System.out.print("   ");
  
                  // 计算下一个数字
                  number = number * (i - j) / (j + 1);
              }
  
              // 换行
              System.out.println();
          }
      }
  }
  

