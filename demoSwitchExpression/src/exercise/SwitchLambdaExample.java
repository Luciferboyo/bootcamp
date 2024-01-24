package demoSwitchExpression.src.exercise;

public class SwitchLambdaExample {
  public static void main(String[] args) {
    String day = "Monday";
    String result = switch(day){
      case "Monday","Tuesday"->"Weekday";
      case "Wednesday"->"Midweek";
      case "Thursday","Friday"->"Almost Weekend";
      default -> "Weekend";
    };

    System.out.println(result);

  }
}
