package demoPrimitiveConv.src;
public class DemoConversion {
    public static void main(String[] args) {
        //byte -> short -> int -> long
        byte b1 = 2;
        short s1 = b1;//OK,upcast,no precision loss
        int i1 = s1;//OK
        long l1 = i1;//OK
        //long -> int -> short -> byte
        long l2 = 4L;
        //short s2 = (short)l2;//NOT OK, potentially precision loss;
        short s2 = (short)l2;//Fixed,Risky
        l2 = 40000;//40000 -> int value
        s2 = (short)l2;//overflow
        System.out.println(s2);//-25536

        short s3 = 140;
        byte b2 = (byte) s3;
        System.out.println("b2 = " + b2);//-126




        int i2 = 130;
        short s4 = (short)i2;
        System.out.println(s4);

        byte b3 = 127;//int value

        float f1 = (float)1.3d;
        double d1 = f1;

        //float vs long 
        float f2 = 3.5f;
        long l3 = (long) f2;//downcast
        float f3 = l3;//upcast

        //char vs int
        int i3 = 'a';//upcast
        char c3 = (char)i3;//downcast
        System.out.println("c3(int) = "+(int)c3);//74
        System.out.println("c3(char) = " + c3);//j

        int i4 = 65610;
        char c4 = (char)i4;
        System.out.println("c4(int) = "+(int)c4);//74
        System.out.println("c4(char) = " + c4);//j

        //doub vs long
        double b4 = 3.3;
        long l4 = (long)b4;
        double b5 = l4;
        System.out.println("b5 = " + b5);
        

    }
}
