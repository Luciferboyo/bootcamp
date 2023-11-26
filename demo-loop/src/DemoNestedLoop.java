public class DemoNestedLoop {
  public static void main(String[] args){
      for(int i = 0;i < 5; i++){//0,1,2,3,4   outer loop
        //System.out.println("i = " + i);
        //System.out.println("i = " + i);
       //** */
       if (i > 2 ) {
          break;
        }
        for(int j = 0;j < 5; j++){//inner loop
          // when i = 0, j -> 0,1,2,3
          // when i = 1, j -> 0,1,2,3
          // when i = 2, j -> 0,1,2,3
          // when i = 3, j -> 0,1,2,3
          // when i = 4, j -> 0,1,2,3
          if (j > 1) {
            break;
          }
          System.out.println("i = " + i +",j = " + j);
        }
        System.out.println("-----------");
      }

      //i < 5
      //j < 4
      //System.out.println(); -> print out & newLine
      //System.out.print(); -> print out
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 4; j++){
          System.out.print("*");//20 times
        }
        System.out.println("");
      }
      //****
      //***
      //**
      //*
      System.out.println("-----first inverted right triangle-------");
      for(int i = 4; i >= 0; i--){
        for(int j = 0; j < i; j++){
          System.out.print("*");
        }
        System.out.println("");
      }
      System.out.println("-----second inverted right triangle-------");
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 4 - i; j++){
          System.out.print("*");
        }
        System.out.println("");
      }
      System.out.println("-------right triangle--------");
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < i; j++){
          System.out.print("*");
        }
        System.out.println("");
      }
      String str1 = "abcdefghijk";
      //abcdefghijk
      
      //inner
      System.out.println("--------------------");
      for(int i = 0;i < str1.length(); i++){//variable length
          //nested loop, 4 character in a row
          //abcd
          //efgh
          //ijk
          if (i % 4 == 0){
            System.out.println();
          }
          System.out.print(str1.charAt(i));
        }

        System.out.println("");
        /*int count = 0;
        for(int i = 0;i < str1.length(); i++){//variable length
          //nested loop, 4 character in a row
          //abcd
          //efgh
          //ijk
          ++count;
          if (count % 4 == 0 || (i == str1.length()-1)){
            System.out.println();
          }
          System.out.print(str1.charAt(i));
        }*/

        //*** *** *** *** *** ***
        //method 1
        for(int i = 0;i < 6;i++){
          for(int j = 0;j < 3; j++){
            System.out.print("*");
          }
          System.out.print(" ");
        }
        System.out.println("-----------------------------");
        //method 2
        for(int i = 0;i < 6;i++){
          for(int j = 0;j < 3; j++){
            System.out.print("*");
          }
          if (i != 6 - 1) {
            System.out.print(" ");
          }
        }
        
    }
}
