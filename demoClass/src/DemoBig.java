package demoClass.src;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBig {
  public static void main(String[] args) {
    //Problem statement
    double d1 = 0.2 + 0.1;
    System.out.println("d = " + d1);//30000000000000004

    if (d1 > 0.3) 
      System.out.println("d > 3");
    
    //Solution
    BigDecimal bd1 = new BigDecimal("0.2");//
    BigDecimal bd2 = new BigDecimal("0.1");

    BigDecimal bd4 = BigDecimal.valueOf(0.2);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal result = bd4.add(bd5);
    System.out.println("result = " + result.doubleValue());

    BigDecimal bd3 = bd1.add(bd2);
    System.out.println("bd3 = " + bd3.doubleValue());

    //Problem statement:Subraction(0.3-0.1)
    double s2 = 0.3 - 0.1;
    System.out.println(s2);

    BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
    System.out.println("b1 = " +b1);
    
    //multiply 0.1*0.2
    //divide 0.3/0.1

    double multiply = 0.1 * 0.2;
    System.out.println(multiply);

    System.out.println(0.3/0.1);

    BigDecimal bMultiply = BigDecimal.valueOf(0.2).multiply(BigDecimal.valueOf(0.1));
    System.out.println("bMultiply = " + bMultiply);

    BigDecimal bDivide = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));

    System.out.println("bDivide = " + bDivide.doubleValue());

    System.out.println( sum(0.2, 0.1));//0.3

    //Comparison
    BigDecimal aDecimal = BigDecimal.valueOf(0.3);
    BigDecimal aDecima2 = BigDecimal.valueOf(0.2);
    if(aDecimal.compareTo(aDecima2) > 0){
      System.out.println("aDecimal > aDecima2");
    }else if (aDecimal.compareTo(aDecima2) < 0) {
      System.out.println("aDecimal < aDecima2");
    }else{
      System.out.println("aDecima2 == aDecimal");
    }

    BigDecimal bDecimal = aDecimal.divide(BigDecimal.valueOf(3));
    System.out.println(bDecimal);

    BigDecimal roundinBigDecimal = BigDecimal.valueOf(10).
                              divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_DOWN).
                              add(BigDecimal.valueOf(5.0)).
                              subtract(BigDecimal.valueOf(0.1)).
                              setScale(2,RoundingMode.DOWN);//8.23
    System.out.println(roundinBigDecimal);
    System.out.println("----------------------");
    BigDecimal bb = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_UP);
    System.out.println("3.333up = " + bb);
    System.out.println("3.333down =  " + BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_DOWN));
    System.out.println("2.666up = " + BigDecimal.valueOf(8).divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_UP));
    System.out.println("2.666down = " + BigDecimal.valueOf(8).divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_DOWN));
    System.out.println("---------------------");
    System.out.println("2.555up = " + BigDecimal.valueOf(2.55).setScale(1, RoundingMode.HALF_UP));
    System.out.println("2.555down = " + BigDecimal.valueOf(2.55).setScale(1, RoundingMode.HALF_DOWN));
  }
  
  public static double sum(double d1,double d2){
    return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
  }
}
