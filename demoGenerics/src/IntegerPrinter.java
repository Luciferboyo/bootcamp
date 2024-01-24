package demoGenerics.src;

public class IntegerPrinter {
  private Integer x;

  public IntegerPrinter(Integer x){
    this.x = x;
  }

  public Integer getX(){
    return this.x;
  }

  public void setX(Integer x){
    this.x = x;
  }

  public Object getX2(){
    return this.x;
  }

  public static void main(String[] args) {

    System.out.println();
  }
}
