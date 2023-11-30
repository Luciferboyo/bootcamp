package demoIntArray.src;

public class DemoMenthod2 {
  public static void main(String[] args) {
    System.out.println(strAdd("I ", "am ", "bo!"));
    System.out.println(remove("1111122211111111", "222"));
    System.out.println(getLastChar("") + "111");
    System.out.println(isStarteWith2("111222", "111"));
    sound("dog");
    System.out.println("--------");
    sound2("");
  }
  public static void vehicle(int vehicleLength){
    if (vehicleLength < 3) {
      System.out.println("small vehicle");
    }else{
      System.out.println("large vehicle");
    }
  }
  public static void sound(String animal){
    //if("ABC".equals(animal)){ return; }
    if ("ABC".equals(animal)) {
      return;
    }
    if ("dog".equals(animal)) {
        System.out.println("wo wo");      
    }else if("Cat".equals(animal)){
      System.out.println("mao~");
      return;
    }
      System.out.println("Default sound....");
      return;
  }

  public static String sound3(String animalSounds){
    String animal = "";
    if (" ".equals(animalSounds)) {
      animal = "Please describe the animal sounds";
    }else if("wo wo".equals(animalSounds)){
      animal = "dog";
    }else if("mao~".equals(animalSounds)){
      animal = "cat";
    }
    return animal;
  }

  public static String sound2(String animal){
     if ("ABC".equals(animal)) {
      return "";
    }
    if ("dog".equals(animal)) {
      return "wo wo";  
    }else if("Cat".equals(animal)){
      return "mao~";
    }
    return "Default sound..";
  }
  
  public static String strAdd(String str1,String str2){
    return str1.concat(str2);
  }
  public static String strAdd(String str1,String str2,String str3){
    return str1.concat(str2).concat(str3);
  }
  public static String strAdd(String str1,String str2,String str3,String str4){
    return str1 + str2 + str3 + str4;
  }
  public static char getLastChar(String str1){
    if (str1.length() < 1) {
      return ' ';
    }
      return str1.charAt(str1.length() - 1);
  }
  public static boolean isStarteWith(String s,String prefix){
    return s.startsWith(prefix);
  }
  public static boolean isStarteWith2(String s,String prefix){
    boolean result = s.indexOf(prefix) == 0;
    return result;
  }
  public static String remove(String str1,String toBeRemoved){
    return str1.replace(toBeRemoved,"");
  }

  public static void notifyCustomer(){
    if (sendEmail()) {
      return;
    }
    sendSMS();
  }
  public static boolean sendEmail(){
    return false;
  }
  public static boolean sendSMS(){
    return false;
  }
  public static boolean notifyCustomer2(){
    return sendEmail()|| sendSMS();
  }
   public static boolean notifyCustomer3(){
    if (sendEmail()) {
      return true;
    }else if(sendSMS()){
      return true;
    }
    return false;
  }
}
