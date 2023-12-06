package demoClass.src;

import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    LocalDate date2 = LocalDate.of(1999, 12, 01);
    System.out.println(date2);

    LocalDate date3 = LocalDate.of(1999, 10, 02);
    if (date2.isAfter(date3)) {
      System.out.println("date2 > date3");
    }else if (date3.equals(date2)) {
      System.out.println("date3 is same date of date2");
    }else{
      System.out.println("date2 < date3");
    }

    System.out.println(date2.isLeapYear());

    System.out.println(date3.getMonthValue());

    System.out.println(date3.getMonth());


  }
}
