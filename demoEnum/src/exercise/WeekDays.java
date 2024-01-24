package demoEnum.src.exercise;

public enum WeekDays {
  MONDAY(1),
  TUESDAY(2),
  WEDNESDAY(3),
  THURSDAY(4),
  FRIDAY(5),
  SATURDAY(6),
  SUNDAY(7),
  ;
  private int dayNumber;

  private WeekDays(int dayNumber){
    this.dayNumber = dayNumber;
  }

  public int getDayNumber(){
    return this.dayNumber;
  }

  public static WeekDays Today(WeekDays weekDays){
    return weekDays;
  }

  public static void main(String[] args) {
    
  }
}
