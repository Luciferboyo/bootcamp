package quiz.src.quiz5;

import java.util.ArrayList;

public class Question {
  public static void main(String[] args) {
    
    ArrayList<Byte> bytes = new ArrayList<>();

    bytes.add((byte)20);
    bytes.add((byte)14);
    bytes.add((byte)30);
    bytes.remove(1);//remove index 1->14

    int total = 0;

    for(Byte price:bytes){
      total = price;
    }

    System.out.println("total="+total);
    System.out.println("bytes="+bytes);
  }
}
