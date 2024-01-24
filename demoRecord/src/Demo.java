package demoRecord.src;
public class Demo {
  public static void main(String[] args) {
    Student student = new Student("John", 20);
    System.out.println(student.name());//getter
    //no setter in Record

    System.out.println(student.toString());

    Student student2 = new Student("John", 20);
    System.out.println(student.equals(student2));

    System.out.println(student.hashCode());
    System.out.println(student2.hashCode());
    
  }
}
