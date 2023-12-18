package demoEnum.src.poker;

public class Card {
  
  private Suit suit;

  private Rank rank;

  public Card(){

  }
  public Card(Suit suit,Rank rank){
    this.suit = suit;
    this.rank = rank;
  }
}
