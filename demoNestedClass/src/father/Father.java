package demoNestedClass.src.father;



public class Father implements Driver{
  @Override
  public void driver() {
    
    System.out.println("Father is driving...");
  }

  public static void main(String[] args) {
    Driver driver = new Father();
    driver.driver();

    Driver driver2 = new Driver() {
      @Override
      public void driver() {
        System.out.println("Driving.....");
      }
    };

    driver2.driver();
  }
}
