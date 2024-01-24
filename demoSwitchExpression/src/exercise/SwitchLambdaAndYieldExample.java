package demoSwitchExpression.src.exercise;

public class SwitchLambdaAndYieldExample {
  public static void main(String[] args) {
    Integer day = 3;

    String dayName = switch(day){
      case 1 ->{ yield "Monday";}
      case 2 ->{ yield "Tuesday";}
      case 3 ->{ yield "Wednesday";}
      case 4 ->{ yield "Thursday";}
      case 5 ->{ yield "Friday";}
      case 6 ->{ yield "Saturdday";}
      case 7 ->{ yield "Sunday";}
      default ->{ yield "Error,invalid day";}
    };
    System.out.println("dayName = "+dayName);
  }
}
