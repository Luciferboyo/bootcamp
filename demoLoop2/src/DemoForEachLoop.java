package demoLoop2.src;

public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[]{100,-30,20};
    for(Integer data: integers){
      System.out.println(data);
    }
    System.out.println("------------------------");
    for(int i = 0;i < integers.length; i++){
      System.out.println(integers[i]);
    }
    String str = "abc,def,ijk,xyz";
    String[] parts = str.split(",");
    for (String data : parts) {
      System.out.println("part = " + data);
    }
  }
}
