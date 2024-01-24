package demoStream.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer {
  
  List<Address> addresses;

  public void addAddress(String addressLine1,String addressLine2){
    addresses.add(new Address(addressLine1,addressLine2));
  }

  public List<Address> getAddresses(){
    return this.addresses;
  }

  public class Address {

    private String line1;
    private String line2;

    public Address(String line1,String line2){
      this.line1 = line1;
      this.line2 = line2;
    }
    public void print(){
      System.out.println(addresses);
    }
  }
  
  public static void main(String[] args) {
    
    Customer customer = new Customer();

    //Prepare 2 customers, each of them has his own addresses

    List<Customer> customers1 = Arrays.asList(new Customer(),new Customer());
    
    customers1.get(0).addAddress("Sample Address Line 1", "Sample Address Line2");
    customers1.get(0).addAddress("ABCD EFG", "XYZ IJK");
    customers1.get(1).addAddress("123456", "789");

    //Retrieve all address from a list of customers

    List<Customer.Address> addresses = customers1.stream()
                                      .flatMap(c->c.getAddresses().stream())
                                      .collect(Collectors.toList());
    System.out.println(addresses);
  }
}
