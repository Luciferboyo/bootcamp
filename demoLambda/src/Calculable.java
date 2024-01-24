package demoLambda.src;

@FunctionalInterface
public interface Calculable {//Only one method in the interface,with validation
  int compute(int a,int b);
  //void run();
}
