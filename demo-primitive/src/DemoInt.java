public class DemoInt {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("2 abc");
        System.out.println(2);
        System.out.println(2.3);
        
        //monthlySalary and i are both "variable" 变量
        //"int age"-->Declaration, int -> "integer"
        //age = 30 ->Assignment,assign the integer value 30 to the vatiable
        int monthlySalary = 2;
        int salary = 3;
        int a = 3;
        a = 10;
        a = a + 3;//13
        a += 3;//16
        a = a - 3;
        a -= 3;
        a = a * 3;
        a *= 3;
        a = a/3;
        a /= 3;
        //++ difference
        a++;
        ++a;
        //
        --a;
        a--;

        //%
        int remainder = 9 % 2;
        System.out.println(remainder);
        System.out.println(a);
        System.out.println(monthlySalary+salary+a);
        int age = 24;
        System.out.println("boyo的年龄是"+age);
        //byte,short,int,long(primitive)
        byte b = -128;//from -128 to 127
        byte b2 = 127;//128 is out of range of integer value that can be stored 
        short s =  -32768;
        short s1 = 32767;
        int i = -2147483648;
        int i1 = 2147483647;
        long l1 = -9223372036854775808L;
        int i5 = 100;//default it is an int value
        byte b4 = 100;// java implicitly convert the int to byte
        short s4 = 100;//java implicitly convert the int to short
        l1 = l1 + 10;
        System.out.println(l1);
        int reslut = (5 + 3) % 3;
        System.out.println(reslut);
        
    }
}
