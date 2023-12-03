package demoClass.src;

public class Demo {
  
  public static void main(String[] args) {
    //Call People is constructor
    People people1 = new People();//p1 is name -> nulll,p1
    System.out.println("people1 = " + people1);
    people1.setName("John");

    People people2 = new People();
    People people3 = people1;
    people3.setName("boyo");
    System.out.println("people2 = " + people2);
    System.out.println("people3 = " + people3);
    System.out.println(people3 == people1);
    System.out.println(people1 == people2);
    System.out.println("----------------");
    people2 = people1;
    System.out.println("people2 = " + people2);
    
    People people4 = new People("boyo");
    System.out.println("people4 = " + people4);
    System.out.println("----------------");
    System.out.println(people1.getName());
    System.out.println(people2.getName());
    System.out.println(people3.getName());
    System.out.println(people4.getName());
  }
}
