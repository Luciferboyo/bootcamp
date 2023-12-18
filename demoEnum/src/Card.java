package demoEnum.src;

public class Card {
  
  private String color;

  public Card(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Card card1 = new Card("RED");
    Card card2 = new Card("BLACK");
    Card card3 = new Card("RED");
    if (card1.getColor() == card3.getColor()) {
      System.out.println("card");
    }
  }
}
