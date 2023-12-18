package demoObject.src;

import java.math.BigInteger;
import java.util.Objects;

public class DemoNumber {

  private int x;
  private int y;

  public DemoNumber(){

  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }
  public static void main(String[] args) {
    Float float1 = Float.valueOf(60000.0f);
    Number n1 = float1;//upcast
    System.out.println(n1.shortValue());//-5536(overflow)
    System.out.println(add2(1,2));

    Number number1 = 1;

    //getClass()
    DemoObject do3 = new DemoObject();
    if (do3.getClass() == DemoObject.class) {
      System.out.println("it is DemoObject class");
    }
    System.out.println(do3.getClass());

    String s1 = "hello";
    String s3 = new String("abc");
    String s2 = "abc";
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s2));

    //Cat equals()
    
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof DemoNumber)) {
      return false;
    }
    DemoNumber demoNumber = (DemoNumber)obj;
    return Objects.equals(this.x, demoNumber.x) && Objects.equals(this.y, demoNumber.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x,this.y);
  }

  public static Number add1(Number x,Number y){
    if (x instanceof Long && y instanceof Long) {
      long x1 = (Long)x;
      long y1 = (Long)y;
      return x1 + y1;
    }else if (x instanceof Short && y instanceof Short) {
      short x1 = (Short)x;
      short y1 = (Short)y;
      return x1 + y1;
    }else if (x instanceof Byte && y instanceof Byte) {
      byte x1 = (Byte)x;
      byte y1 = (Byte)y;
      return x1 + y1;
    }else if (x instanceof Integer && y instanceof Integer) {
      int x1 = (Integer)x;
      int y1 = (Integer)y;
      return x1 + y1;
    }else{
      throw new IllegalArgumentException("Unsupported Number type");
    }
    
  }

  /*
  public static Number add(Integer x,Integer y){
    return 2;
  }
  */
  public static Number add2(Number x,Number y){
    String strX = x.toString();
    String strY = y.toString();
    long longX = 0L;
    long longY = 0L;
    try {
        longX = Long.parseLong(strX);
        longY = Long.parseLong(strY);
    } catch (NumberFormatException e) {
        System.out.println("Error: Unable to parse the string as a long");
    }
    return Long.valueOf(longX + longY);
  }
}
