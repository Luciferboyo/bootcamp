package demoNestedClass.src.exercise;

interface Action{
  void read();
  void run();
}

public class AnonymousInnerClassExample {
  //Skip creating a new Class implements Interface Reading
  public static void main(String[] args) {
    Action person = new Action() {
      int count;

      @Override
      public void run() {
        this.count++;
        System.out.println("x="+this.count);
      }

      @Override
      public void read() {
        // TODO Auto-generated method stub
        System.out.println("Anonymous Inner Class for Interface Reading");
      }
    };

    person.read();
    person.run();
  }
}
