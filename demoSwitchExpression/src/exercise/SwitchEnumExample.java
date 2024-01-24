package demoSwitchExpression.src.exercise;

enum Day {
  MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAYM,SUNDAY
}

public class SwitchEnumExample {
  public static void main(String[] args) {
    Day day = Day.SATURDAYM;

    String dayType = switch(day){
      case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> "Weekday";
      case SATURDAYM,SUNDAY -> "Weekend";
    };

    System.out.println(dayType);
  }
}