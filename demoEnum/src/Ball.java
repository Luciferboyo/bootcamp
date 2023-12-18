package demoEnum.src;

public class Ball {
  //private String color;//
  private Color color;//relatively finite numbers

  public Ball(Color color){
    this.color = color;
  }
  
  public Color getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    //Before the main() starts,class load,class load -> new Color("Red")
    //Color.RED(something static final)
    //You cannot "new" the Color object by yourself

    Ball ball1 = new Ball(Color.RED);
    Ball ball2 = new Ball(Color.BLACK);
    Ball ball3 = new Ball(Color.RED);

    if (ball1.getColor() == ball3.getColor()) {
      System.out.println("--------------------");
    }
  }
}
