package demoEnum.src;

public enum Direction {
  North(1), East(2),West(-2),South(-1),;

  private int number;

  private Direction(int number){
    this.number = number;
  }

  public int getNumber(){
    return this.number;
  }
  
  //static method
  public static Direction opposite(Direction direction){
    switch (direction) {
      case North:
          return South;
      case South:
          return North;
      case East:
          return West;
      case West:
          return East;
      default:
          return null;
    }
  }
  public static void main(String[] args) {
    Direction direction1 = Direction.North;
    Direction direction2 = Direction.opposite(direction1);

    System.out.println(direction1);
    System.out.println(direction2);
    System.out.println(direction1.name());

    String result = Direction.West.opposite3().name();
    String result2 = Direction.West.opposite3().toString();

    System.out.println(Direction.opposite(direction1));
    System.out.println(Direction.opposite(direction2));
  }


  //static method
  public static Direction opposite2(Direction direction){
    return Direction.fromValue(direction.getNumber() * -1);
  }

  //instance
  public Direction opposite3(){
    return Direction.fromValue(this.number * -1);
  }

  private static Direction fromValue(int number){
    for(Direction direction : Direction.values()){
      if (direction.getNumber() == number) {
        return direction;
      }
    }
    return null;
  }
}