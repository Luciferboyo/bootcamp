package demoClass.src.internalcache;

public class DemoInteger {
  public static void main(String[] args) {
    Integer integer1 = 10;//10 is an int value,auto-box ->Integer
    System.out.println("integer1 = " + integer1);

    Integer integer2 = new Integer(10);
    System.out.println("integer2 = " + integer2);

    System.out.println(integer1 == integer2);//false "new" -> 
    System.out.println(integer1.compareTo(integer2));
    System.out.println(integer1.equals(integer2));

    Integer integer3 = 10;
    System.out.println(integer3 == integer1);//true,Integer Cache

    Integer integer4 = 127;
    Integer integer5 = 127;

    System.out.println(integer4 == integer5);
    
    Integer integer6 = 128;
    Integer integer7 = 128;
    System.out.println(integer7 == integer6);


    Byte byte1 = -128;
    Byte byte2 = -128;
    System.out.println(byte1 == byte2);//true
    Byte byte3 = new Byte("-128");
    System.out.println(byte3 == byte1);//false
    Byte byte4 = Byte.valueOf((byte)-128);
    System.out.println(byte4 == byte1);

    Boolean boolean1 = true;
    Boolean boolean2 = true;
    System.out.println(boolean1 == boolean2);//true

    Boolean boolean3 = new Boolean(true);
    System.out.println(boolean3 == boolean1);//false

    Double double1 = -18.0d;
    Double double2 = -18.0d;
    System.out.println("double = " + (double1 == double2));
    
    Float float1 = 28.0f;
    Float float2 = 28.0f;
    System.out.println(float1 == float2);

    Character character1 = 'a';
    Character character2 = 'a';
    System.out.println(character1 == character2);

    Long long1 = 18L;
    Long long2 = 18L;
    System.out.println("Long = "+(long1 == long2));
    System.out.println("----------------");

    int a = 0;
    int b = 0;
    a = a++;
    b = a++;
    System.out.println(a);
    System.out.println(b);
  }
}
