package demoLambda.src.exercise;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface EmployeeEmpty{
  Employee get();
}

@FunctionalInterface
interface EmployeeWithName{
  Employee get(String name);
}

public class Employee {
  
  private String name;

  Employee(){
    System.out.println("Empty Construtor");
  }

  Employee(String name){
    System.out.println("Creat constructor");

    this.name = name;
  }

  @Override
  public String toString() {
    return "name:"+this.name;
  }

  public static void main(String[] args) {
    
    EmployeeEmpty employeeEmpty = Employee::new;//it actually doesn't call constructor

    System.out.println("Constructor isn't called yet");

    System.out.println(employeeEmpty.get());//Construtor called

    EmployeeWithName employeeWithName = Employee::new;

    System.out.println("Constructor isn't called yet");
    
    System.out.println(employeeWithName.get("hello"));
  }
}
