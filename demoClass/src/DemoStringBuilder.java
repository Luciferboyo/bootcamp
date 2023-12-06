package demoClass.src;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String x = "abc";
    x += "def";
    x = x.concat(x);
    System.out.println(x);

    //StringBuilder
    StringBuilder y = new StringBuilder("abc");
    y.append("def").append("def");

    System.out.println(y);//adcdefdef
    
    System.out.println("------------");
    //while loop -> counter
    //123 456 789 101112
    int counter = 4;//123 456 789 101112
    //counter = 3 //123 456 789
    int number = 1;
    StringBuilder stringBuilder = new StringBuilder();
    while (counter-- > 0) {
      int count2 = 3;
      while (count2-- > 0) {
        if(number % 3 != 0){
          stringBuilder.append(number++);
        }else{
          stringBuilder.append(number + " ");
          number++;
        }

      }
      System.out.println(stringBuilder.toString().trim());
    }
    System.out.println("-----------------------");
    //aaa bbb ccc ddd;
    StringBuilder stringBuilder2 = new StringBuilder();
    byte numberShort = 96; 
    counter = 4;
    while (counter-- > 0) {
      int count2 = 3;
      numberShort++;
      while (count2-- > 0) {
          stringBuilder2.append((char)numberShort);
          if(count2 == 0 ){
            stringBuilder2.append(" ");
          }
      }
      System.out.println(stringBuilder2.toString().trim());
    }
    System.out.println("----------");

    StringBuilder stringBuilder3 = new StringBuilder();

    short shortValue = 65; 
    stringBuilder3.append(shortValue);

    String result = stringBuilder3.toString();
    System.out.println(result);  

    // ddd bootcampccc bbb aaa
    System.out.println(stringBuilder3.insert(0,"bootcamp"));

    System.out.println(stringBuilder3.toString());

    System.out.println(stringBuilder3.charAt(2));

    System.out.println(stringBuilder3.replace(0, 3, "my"));
    System.out.println("============");
    StringBuilder sb11 = new StringBuilder("Hello");
    StringBuilder sb12 = new StringBuilder("Hello"); 
    System.out.println(sb11.equals(sb12));
    Object object = new Object();
    Object object2 = new Object();
    System.out.println(object.equals(object2));
    System.out.println(sb11.compareTo(sb12));

    //
    StringBuilder sBuilder = new StringBuilder();
    sBuilder.append((byte)1);

    System.out.println(stringConcat());
    System.out.println(stringBuilderConcat());
  }
  public static long stringConcat(){
    long start = System.nanoTime();
    String s = "a";
    for(int i = 0;i < 10000;i++){
      s = s.concat("a");
    }
    long end = System.nanoTime();
    return end - start;
  }

  public static long stringBuilderConcat(){
    long start = System.nanoTime();
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i < 10000;i++){
      sb = sb.append("a");
    }
    long end = System.nanoTime();
    return end - start;
  }
}
