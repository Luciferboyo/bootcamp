package demoLambda.src.lamdba;

@FunctionalInterface
public interface SuperConsumer<T,U,V> {
  void accpet(T t,U u,V v);
}

class test{
  public static void main(String[] args) {
    SuperConsumer<String,String,String> sp = (t,u,v)-> {System.out.println(t+" "+u+" "+v);};
    sp.accpet("I", "fuck", "you");
  }
}
