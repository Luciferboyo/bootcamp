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

    }
}
