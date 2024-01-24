package quiz.src.quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum Food{
  VEGETABLE('V'),MEAT('M'),FRUIT('F');

  char key;

  Food(char c){
    this.key = c;
  }
}

public class Qustion7 {
  public static void main(String[] args) {
    List<Food> foods = new ArrayList<>();
    foods.add(Food.VEGETABLE);
    foods.add(Food.MEAT);
    foods.add(Food.FRUIT);

    List<Character> mappedList = foods.stream()
                    .map(e->e.key)
                    .filter(e->Character.isLowerCase(e))
                    .sorted()
                    .collect(Collectors.toList());
    System.out.println(mappedList);
  }
}