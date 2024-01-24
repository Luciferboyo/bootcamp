package demoStream.src;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.xml.catalog.Catalog;
public class DemoStream {
  public static void main(String[] args) throws Exception{

    List<String> strings = new ArrayList<>(List.of("hello","world","vincent","oscar"));
    List<String> result = new ArrayList<>();
    //filter out string with length <= 5;
    for(String s:strings){
      if(s.length() > 5)
      result.add(s);
    }

    //stream()
    //list object can invoke stream() method
    List<String>result2=strings.stream().filter(s->s.length()>5 && s.startsWith("v")).collect(Collectors.toList());//similar to for loop
    System.out.println(result);

    Cat cat1 = new Cat("Cafe", 2);
    Cat cat2 = new Cat("Lucy", 3);
    
    List<Cat> cats = Arrays.asList(cat1,cat2);

    List<String> catList = cats.stream().filter(cat->cat.getName().startsWith("D") && cat.getAge() < 2).map(cat->cat.getName()).collect(Collectors.toList());

    System.out.println(catList);

    List<Dog> dogs = cats.stream().map(e->{
      return new Dog(e.getAge());
    }).collect(Collectors.toList());

    List<Dog> dogList = new ArrayList<>();
    
    for(Cat cat:cats){
      dogList.add(new Dog(cat.getAge()));
    }

    List<Staff> staffs = new ArrayList<>(List.of(new Staff("John", 2000.0d),new Staff("John", 1500.0d)));

    double sum = 0.0d;

    for(Staff staff:staffs){
      sum += staff.getSalary();
    }
    System.out.println(sum);

    double max = -1;

    for(Staff staff:staffs){
      if (staff.getSalary() > max) {
        max = staff.getSalary();
      }
    }

    double total = staffs.stream().map(e->e.getSalary()).mapToDouble(d->d).sum();

    System.out.println(total);

    //toSet()
    List<Cat> cats2 = new ArrayList<>(List.of(new Cat("ABC",3),new Cat("DEF",2),new Cat("DF",1)));

    Set<Cat> set = cats2.stream().collect(Collectors.toSet());

    List<Cat> distinct = cats2.stream().distinct().collect(Collectors.toList());


    cats.stream()
          .forEach(e->{
            System.out.println(e.getAge());
          });
    
    //sum up all cats'age
    cats.stream().forEach(cat->{
      int ss = 0;
      ss += cat.getAge();
      System.out.println("cat'age="+ss);
    });

    int su = cats.stream().mapToInt(e->e.getAge()).sum();

    Stream<Cat> sc = Stream.of(new Cat("ABC", 9),new Cat("DEF", 12));

    List<Cat> reluList = sc.filter(cat->cat.getAge()>9).collect(Collectors.toList());

    System.out.println("---------------");
    Stream<Cat> sc2 = Stream.ofNullable(null);//new ArrayList<>()
    sc2.forEach(e->{
      System.out.println(e);
    });

    Cat cat = null;
    Stream<Cat> sc7 = Stream.of(cat);

    sc2.map(c->c.getAge()).collect(Collectors.toList());
  }
}
