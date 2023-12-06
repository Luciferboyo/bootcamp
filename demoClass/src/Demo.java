package demoClass.src;

public class Demo {
  
  public static void main(String[] args) {
    //Call People is constructor
    People people1 = new People();//p1 is name -> nulll,p1
    System.out.println("people1 = " + people1);
    people1.setFirstName("john");

    People people2 = new People();
    People people3 = people1;
    people3.setFirstName("boyo");
    System.out.println("people2 = " + people2);
    System.out.println("people3 = " + people3);
    System.out.println(people3 == people1);
    System.out.println(people1 == people2);
    System.out.println("----------------");
    people2 = people1;
    System.out.println("people2 = " + people2);
    
    People people4 = new People("boyo");
    people1.setLastName("null");
    people2.setLastName("null");
    people3.setLastName("null");
    people4.setLastName("null");
    System.out.println("people4 = " + people4);
    System.out.println("----------------");
    System.out.println(people1.getFullName());
    System.out.println(people2.getFullName());
    System.out.println(people3.getFullName());
    System.out.println(people4.getFullName());

    People people5 = new People("Ken","Wong");
    people5.setLastName("bobo");
    System.out.println("p5 full name = " + people5.getFullName());
    

    System.out.println("--------------------");
    System.out.println(people5.getUpperAndLower(true));
    System.out.println(people5.getUpperAndLower(false));
    System.out.println(people5.getUpperAndLower(true));

    //People p5 = new people("chris","chan");
    //"Chris Chan"

    
  }
}
