package demoComparator.src.lark;

import java.nio.Buffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Customer {
  
  private int id;
  private String name;
  private LocalDate joinDate;

  public Customer(int id,String name,LocalDate localDate){
    this.id = id;
    this.name = name;
    this.joinDate = localDate;
  }


  public static void main(String[] args) {
    Customer customer1 = new Customer(1, "Alex", LocalDate.of(2022, 1, 1));
    Customer customer2 = new Customer(2, "Benny", LocalDate.of(2022, 1, 15));
    Customer customer3 = new Customer(2, "Carl", LocalDate.of(2022, 12, 31));

    List<Customer> customers = new ArrayList<>();

    System.out.println("Before Sorting:"+customers);
    //Collections.sort(customers);
    System.out.println("After Sorting:"+customers);
  }
}
