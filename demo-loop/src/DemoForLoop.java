public class DemoForLoop {
    public static void main(String[] args) {
        int x = 2;
        //Step 1:int i = 0;
        //Step 2:i < 4
        //Step 3:Yes -> x*=2  x=4
        //Step 4:sysout
        //Step 5:i++
        //Step 6:i < 4 ?? i is 1
        //Step 7:Yes -> x*=2 x=8
        //Step 8:sysout
        //Step 9:i++
        //Step 10:i < 4 ?? i is 2
        //Step 11:Yes -> x*=2 x=16
        //Step 12:sysout
        //Step 13:i++
        //Step 14:i < 4 ?? i is 3
        //Step 15:Yes -> x*=2 x=32
        //Step 16:sysout
        //Step 17:i++
        //Step 18:i < 4?? i is 4
        //Step 19:NO -> out 
        for(int i = 0; i < 4; i++ ){
            x *= 2;
            System.out.println("x = " + x);
        }

        //0+1+2+3+4...+10
        System.out.println("-----------------");
        int total = 0;
        for(int i = 1;i < 11;i++){
            total += i;
            System.out.println("i = "+i);
        }
        System.out.println("total = "+total);
        System.out.println("----------");

        //0+2+4....+10
        int total1 = 0;
        for(int i = 0;i < 10;i++){
            if (i % 2 == 0) {
                total1 += i;
                System.out.println("i = " + i);
            }
        }
        System.out.println("total = " + total1);
        System.out.println("---------------");
        //0 - 100
        //i) 0 - 50, odd -> sum1
        //i1)51 - 100 , even ->another sum2
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i < 101; i++){
            if (i < 50 && (i % 2 != 0) ) {
                sum1 += i;
                System.out.println("sum1 = " + sum1);
            }else if(i > 50 && i % 2 == 0){
                sum2 += i;
                System.out.println("sum2 = " + sum2);
            }
        }
        System.out.println("sum1 + sum2 = "+ sum1 * sum2);
        System.out.println("----------------------------");
        
        //continue
        //sum up all odd number (0-100)
        int sum = 0;
        for(int i = 0; i < 4; i++){
            if (i % 2 == 0) {
                continue;//Go to the next iteration, skip the rest of codes
            }
            //For even number,the following code will be skipped
            sum += i;
            System.out.println("i = " + i);
        }
        System.out.println("sum = " + sum); 

        //break
        //sum up all odd number (0-100)
        //i)sim <= 200
        //The loop should be ended at which number of i?
        System.out.println("------------------");
        int sim = 0;
        for(int i = 0; i < 100;i++){
            if (sim <= 200 && (sim+i)>200) {
                break;
            }
            if (i % 2 != 0) {
                sim += i;
            }
            System.out.println("i = " + i + ",sim = " +sim);
        }
        System.out.println("sim = "+sim);    
    }   
}
