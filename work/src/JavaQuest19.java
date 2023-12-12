package work.src;


/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  private int carYear;
  private String carModel;
  // Constructor with variables carYear and carModel
  public JavaQuest19(int carYear,String carModel){
    this.carModel = carModel;
    this.carYear = carYear;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Car Year = " + this.carYear + ", Car Model = " + this.carModel;
  }

  public static void main(String[] args) {
    // Create an instance of class Exercise12, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");

    System.out.println(myCar.carModel);
  }
}