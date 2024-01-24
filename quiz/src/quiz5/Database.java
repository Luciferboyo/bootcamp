package quiz.src.quiz5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question 2;
interface Readable{
  void read();
}

interface Writable<T>{
  void write(T t);
}

class Pig{
  String name;

  public String getName(){
    return this.name;
  }
}

public class Database<T> implements Readable,Writable<T> {
  public List<T> list;

  Database(List<T> list){
    this.list = list;
  }

  @Override
  public void read() {
    this.list.forEach(e->{
      Pig pig = (Pig) e;//instance of ->running time error
      System.out.println(pig.getName());
    });
    /* 由于 Database 类是泛型类，并且实现了 Writable<T> 接口，它可以被用于存储任何类型的对象。如果 Database 实例被创建时，使用了不同于 Pig 类型的元素，这样的强制类型转换就可能导致 ClassCastException 异常。
     * this.list.forEach(e -> {
        if (e instanceof Pig) {
            Pig pig = (Pig) e;
            System.out.println(pig.getName());
        }
    });
     * 
     */

  }

  @Override
  public void write(T t) {
    this.list.add(t);
  }

  public void remove(int index){
    this.list.remove(index);
  }

  public static void main(String[] args) {
    Pig[] pigArray = {new Pig(),new Pig(),new Pig()};
    List<Pig> pigs = new ArrayList<>(Arrays.asList(pigArray));
    Database<Pig> pigDb = new Database<>(pigs);
    pigDb.write(new Pig());
    pigDb.remove(0);
    pigDb.read();

    
  }
}
