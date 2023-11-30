package demoIntArray.src;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
  public static void main(String[] args) {
    int target = new Random().nextInt(3);
    System.out.println("random number = " + target);
    System.out.println("-----------------------");
    //target = new Random().nextInt(3) + 1;
    //System.out.println(target);

    Scanner scanner = new Scanner(System.in);
    //System.out.println("Please enter a value from zero to 2 to see if it is the number I want.");
    //while loop
    //if user input same as target -> exit
    //otherwise,keep asking
    /*
    first 
    while (true) {
      int input = scanner.nextInt();
      if (input == target) {
        break;
      }
       System.out.println("continue");
    }*/
    //second
     /*int input = scanner.nextInt();
    while (target != input) {
      System.out.println("continue");
      input = scanner.nextInt();
    }*/
    
    //Game
    //1-100(random target:47)
    //Round 1:"Please input an number (1-100)" User input 49(wrong)
    //Round 1:"Please input an number (1-48)" User input 2(wrong)
    //Round 1:"Please input an number (2-48)" User input 49(wrong)
    //if the inputed number is out of the range being asked ,keep asking
    int target2 = new Random().nextInt(100) + 1;
    System.out.println("target2 = " + target2);
    Scanner scanner2 = new Scanner(System.in);
    int input2 = 0;
    int number1 = 1;
    int number100 = 100;
    do {
      if(input2 < number1 || input2 > number100){
        System.out.println("Please output a number("+number1+"-"+number100+")");
      }else if (input2 > target2) {
        
          number100 = input2 - 1;
        
        System.out.println("Error, this number(" + number1 +"-"+number100+ ")");
      }else if (input2 < target2) {
       
          number1 = input2 + 1;
        
        System.out.println("Error, this number(" + number1 + "-"+ + number100 + ")");
      }
      input2 = scanner.nextInt();
    } while (input2 != target2);



    int input = 0;
    do {
      if(input == 0){
        System.out.println("Please enter a value from zero to 2 to see if it is the number I want.");
      }else{
        System.out.println("Fill in another number");
      }
      input = scanner.nextInt();
    } while (input != target);

    scanner.close();


  }
}
