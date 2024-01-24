package quiz.src.quiz5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Tesla implements Comparator<Tesla>{
  String name;

  String getName(){
    return this.name;
  }

  Tesla(){

  }

  Tesla(String name){
    this.name = name;
  }

  public int compareTo(Tesla tesla){
    return tesla.getName().compareTo(this.name);
  }

  public int compareTo(Tesla a1,Tesla a2){
    return compare(a1, a2);
  }

  @Override
  public int compare(Tesla o1, Tesla o2) {
    return o1.getName().compareTo(o2.getName());
  }
}


public class Question5 {
  public static void main(String[] args) {
    List<Tesla> box = new ArrayList<>();
    box.add(new Tesla("Leo"));
    box.add(new Tesla("Kitty"));
    box.add(new Tesla("Sue"));
    box.add(new Tesla("Cherry"));

    //new Tesla("Vincent")->Used as a comparator,Use the rewriting method in it(compare);
    Collections.sort(box,new Tesla("Vincent"));
    
    box.forEach(e->System.out.println(e.getName()));
  }
}
