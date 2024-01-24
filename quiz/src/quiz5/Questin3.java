package quiz.src.quiz5;
@FunctionalInterface
interface Codable{
  void code();
}

class Engineer implements Codable{
  
  public void code() {
    System.out.println("I love coding,Python ...");
  }

  public void kill(Codable code){
    code.code();
  }
}
public class Questin3 {
   public static void main(String[] args) {
      Codable vincent = ()->System.out.println("I love JAVA...");

      Codable alan = new Codable() {
        public void code() {
          Engineer tommy = createKiller();
          tommy.kill(vincent);
        };
        public static Engineer createKiller(){
          return new Engineer();
        }
      };

      Engineer tommy = new Engineer();
      /*
          vincent is Codable of Override
       *  Engineer's method ->kill()->code()->Codable of Override
       */
      tommy.kill(vincent);
      /*
       * 1.alan is Codable of Override
       * 2.new Engineer
       * 3.Engineer.kill->input viecent's parameter
       * 4.vincent is Codable of Override
       * 5.vincent.code -> System.out.println("I love JAVA...");
       */
      tommy.kill(alan);
   }
}
