package demoThread.src;

import java.util.Hashtable;

public class HashTableDemo {

  public static void main(String[] args) {
    Hashtable<String,Integer> ageTable = new Hashtable<>();
    
    ageTable.put("Alice", 25);
    ageTable.put("Bob", 30);
    ageTable.put("Charlie",28);

    int aliceAge = ageTable.get("Alice");
    int bobAge = ageTable.get("Bob");
    int charlieAge = ageTable.get("Charlie");

    System.out.println("Alice's age:"+aliceAge);
    System.out.println("Bob's age:"+bobAge);
    System.out.println("charlieAge's age:"+charlieAge);
  }
}
