public class DemoOperator {
    public static void main(String[] args) {
        int x = 2;
        x++;
        ++x;
        x += 1;
        x = x + 1;
        System.out.println(x);//6
        // difference between a++ and ++a;
        int a = 5;
        int preIncrement = ++a;
        System.out.println("preIncrement="+preIncrement);
        System.out.println("a=" + a);
        System.out.println("---------------------");
        int b = 5;
        int postIncrement = b++;// assign the value of variable a to postIncrement
        System.out.println("postIncrement="+postIncrement);
        System.out.println("b=" + b);
        //dirrerence between c--and--c 
        System.out.println("--------------");
        int c = 5 ;
        int perReduce = c--;//preReduce = 5 
        System.out.println("perReduce="+perReduce);
        System.out.println("c = " + c);//c = 4
        int postReduce = --c;// postReduce = 3
        System.out.println("c = " + c);//c = 3
        System.out.println("postReduce="+postReduce);
        //Conditional Opeators
        //&& || !

        //Example 1
        if (c == 3 && b == 5) {//&& -> Both two conditions need to be fultilled
            //c == 3 true
            //b == 5 false
            //true and false -> false
            System.out.println("&& is pass");
        }else{
            System.out.println("&& is not pass");
        }

        //Example 2
         if (c == 3 || b == 5) {//|| -> Either conditions be fultilled
            //c == 3 true
            //b == 5 false
            //true and false -> true
            System.out.println("|| is not pass");
        }else{
             System.out.println("|| is not pass");
        }

        //Example 3 - AND OR
        String h = "hello";
        if (c == 3 && (b == 5 || "hello".equals(h))) {//&& -> Both two conditions need to be fultilled
            //c == 3 true
            //b == 5 false
            // "hello".equals(h) -> true
            //(b = 5||"hello".equals(h)) - > true

            //true and true -> true
            System.out.println("&& and || is pass");
        }else{
            System.out.println("&& and || is not pass");
        }
        //Example 4
         if (b == 5 && c == 3) {//|| -> Either conditions be fultilled
            //(b == 5) false
            //(c == 3) will NOT be executed
            //false -> false
            System.out.println("|| is not pass");
        }else{
             System.out.println("|| is not pass");
        }
        //Example 5 AND OR
        if(b == 5 || c == 3 && "hello".equals(h)){
            //(b == 5) -> false
            //(c == 3) ->true
            //"hello".equals(h) -> true
            //false || true && false -> true
            System.out.println("Example 5 is pass");
        }else{
            System.out.println("Example 5 is not pass");
        }
        // Example 6 - AND OR
        if (h.charAt(3) == 'e' || c == 3) {
            //（h.charAt(3) == 'e'） -> 'l'
            //（h.charAt(3) == 'e'）-> false
            //c == 3 -> true
            //false || true -> true
            System.out.println("Example 6 is pass");
        }else{
            System.out.println("Example 6 is not pass");
        }
        // boolean -> && ||
        boolean b1 = true && false;
        System.out.println("b1 = "+b1);

        boolean b2 = false;
        boolean b3 = true;

        boolean result1 = b2 || b3;

        System.out.println("Result1 = " + result1);

        boolean result2 = b2 || b3 && b1;

        System.out.println("Result2 = " + result2);

        if (b1 == false) {
            System.out.println("Example 7: (b1 == false) pass");//print
        } 

         if (b1 == true) {
            System.out.println("(b1 == true) is pass");//not print
        }

         if (!b1) {
            System.out.println("(!b1) is pass");//print
        }
        
        if (b1) {
            System.out.println("Example 8: (b1) is pass");//not print
        }

        //1
        int g = 0;
        if (b1 == false) {
            g = 10;
            System.out.println("g = " + g);
        }

        //2
        int k = b1 == false ? 10 : 0;
        System.out.println("k = " + k);//1 and 2 is same
        //if b1 is false, assign 10 to k,otherwise 0
        
        int a1 = 10;
        int a2 = 4;
        //1
        int f = 20;
        int min;
        if (f < 10) {
             min = a1;
        }else{
            min = a2;
        }
        System.out.println("min = " + min);
        //2
        int min1 = f < 10 ? a1:a2;
        System.out.println("min1 = " + min1);

        int number = 13;
        System.out.println("-------------");
        //if
        //judge a number is odd number
        Boolean isOdd = true;
        if (number % 2 == 0) {
             isOdd = false;
        }
        System.out.println("Odd Number:" + isOdd);
         //judge a number is prime number
         Boolean isPrime = true;
        for(int i = 2;i < number;i++){
            if (number % i == 0) {
                isPrime = false;
            }
        }
        System.out.println("Prime Numbers:" + isPrime);

        int itemTotal = 1002;
        double totalAmount = 0.0d;
        double freeRate = 0.03;
        //if itemTotal > 3000, no transportation fee,otherwise +3% transportation
        /*if (itemTotal <= 3000) {
            totalAmount = itemTotal * (1 + freeRate);
        }else{
            totalAmount = itemTotal;
        }*/
        double transportation =0.0d;
        if(itemTotal <= 3000){
            transportation = itemTotal * freeRate;
        }
        totalAmount = itemTotal + transportation;
        System.out.println("Total Amount = " + totalAmount);
    }
}
