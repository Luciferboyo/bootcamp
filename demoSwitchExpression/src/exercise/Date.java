package demoSwitchExpression.src.exercise;

public class Date {
  
  public static String getDay(int day){

    String dayName = "";

    switch (day) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
      case 3:
        dayName = "Wednesday";
      case 4:
        dayName = "Thursday";
      case 5:
        dayName = "Friday";
      case 6:
        dayName = "Sixday";
      case 7:
        dayName = "Sunday";
      default:
        dayName = "Invalid day";
    }

    return dayName;
  }
}
