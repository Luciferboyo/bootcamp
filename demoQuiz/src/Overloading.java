package demoQuiz.src;
public class Overloading {

    public static int add(int x,int y){
        return x + y;
    }

    public static double add(double x, double y){
        return x + y;
    }

    public static double add(Double x, Double y){
        return x + y;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(add((int)1.0,(int)2.0));
        
        System.out.println(add(1.0, 1.0));
    }
}
