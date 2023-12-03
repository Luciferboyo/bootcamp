package demoWrapperClass.src;

public class DemoWrapper {
    public static void main(String[] args) {
        //int -> Integer
        int i1 = 3;
        Integer integer1 = 3;//3 is int value -> autobox
        int i2 = integer1;//auto-unbox

        Integer integer2 = Integer.valueOf(i2);
        Integer integer3 = new Integer(i2);

        int result = integer1.compareTo(integer2);
        System.out.println(result);
        
        if (integer1 > integer2) {//comparing the 2 int value
            
        }
        if (integer1.compareTo(integer2) == 0) {//comparing the 2 int value
            
        }
        //double -> Double
        double d1 = 0.1d;
        Double double1 = 0.1d;
        Double double2 = Double.valueOf(d1);
        Double double3 = new Double(d1);

        //char -> Character
        char c1 = 'a';
        Character character1 = Character.valueOf(c1);
        Character character2 = 'a';
        Character character3 = new Character(c1);



        //boolean -> Boolean
        boolean isOkay = true;
        Boolean isPassed = true;//autobox
        Boolean isPassed2 = Boolean.valueOf(isOkay);//self-box
        Boolean isPassed3 = new Boolean(isOkay);

        //Long
        Long long1 = 10L;//10L is long value,auto-box
        //Long -> Integer,how to fix
        //Long -> long
        //Integer -> int
        //int <--> long
        Integer integer4 = Integer.parseInt(String.valueOf(long1));
        System.out.println(integer4);
        Integer integer5 = long1.intValue();
        long l1 = 10l;
        Long long2 = (long)i1;

        int i3 = c1;

        Double d = 1.8d;
        Double d2 = 1.9d;
        if(d < d2){//double > double

        }
        if (d2.compareTo(d) == 0) {//double == double
            
        }

    }
}
