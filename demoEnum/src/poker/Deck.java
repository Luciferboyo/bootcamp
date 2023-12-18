package demoEnum.src.poker;

import java.util.Random;
import demoLoop2.src.De;

public class Deck {
  
  private Card[] cards;

  public Deck(int numberOfCards){
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for(Suit s : Suit.values()){
      for(Rank r : Rank.values()){
        this.cards[idx++] = new Card(s, r);
      }
    }
  }

  public static Deck ofPocker(){
    return new Deck(52);
  }

  public void shuffle(){
    Random random = new Random();
    Random random2 = new Random();
    for(int i = 0;i < random2.nextInt(4) + 3;i++){
      int randomNumber = random.nextInt(52) + 1; 
      int start = 0;
      while (start < randomNumber) {
        Card temp = cards[start];
        cards[start] = cards[randomNumber];
        cards[randomNumber] = temp;
        start++;
        randomNumber--;
      }
    }
  }

  public static void main(String[] args) {
    Deck deck = Deck.ofPocker();
    
  }
}
