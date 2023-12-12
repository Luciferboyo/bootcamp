package work.src;

import java.util.Arrays;

public class Company {

  private String companyName;
  private Employee[] employees;

  public Company(){
    this.employees = new Employee[0];
  }

  public Company(String companyName,Employee[] employees){
    this.companyName = companyName;
    this.employees = employees;
  }

  public String getCompanyName(){
    return this.companyName;
  }

  public void setCompanyName(String companyName){
    this.companyName = companyName;
  }

  public String getEmployees(){
    return Arrays.toString(employees);
  }

  public void hireEmployee(Employee employee){
    Employee[] newEmployees = Arrays.copyOf(this.employees, this.employees.length + 1);
    newEmployees[newEmployees.length - 1] = employee;
    this.employees = newEmployees;
  }

  public boolean fireEmployee(int id){
    boolean found = false;
    for(int i = 0;i < this.employees.length; i++){
      if (this.employees[i].getId() == id) {
        found = true;
      }
    }

    if (!found) {
      return found;
    }

    Employee[] newEmployees = new Employee[this.employees.length - 1];
    int number = 0;

    for(int i = 0; i <this.employees.length; i++){
      if (id != this.employees[i].getId()) {
        newEmployees[number++] = this.employees[i];
      }
    }

    this.employees = newEmployees;
    
    return found;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Customer'name is " + this.companyName + ",employees = " + Arrays.toString(employees);
  }
}


class Employee{

  private static int idx = 0;

  private int id;
  private String name;
  private String position;

  public Employee(String name,String position){
      this.id = ++idx;
      this.name = name;
      this.position = position;
  }

  public String getName(){
    return this.name;
  }

  public String getPosition(){
    return this.position;
  }

  public int getId(){
    return this.id;
  }

  public void setPosition(String position){
    this.position = position;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "Employee{" + "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
  }

  public static void main(String[] args) {
    
    Employee employee1 = new Employee("James", "Front-end engineer");
    
    Employee employee2 = new Employee("Lucy", "Backend engineer");    
    
    System.out.println(employee2.toString());

    Employee[] employees = new Employee[]{employee1};

    Company company = new Company("ITDog",employees);

    System.out.println("ITDog's name is " + company.getCompanyName());

    company.hireEmployee(employee2);

    System.out.println(company.toString());

    System.out.println(employee2.getId());

    System.out.println(company.fireEmployee(2));;
    
    System.out.println(company.toString());
  }
}