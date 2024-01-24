package demoStream.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Customer2 {
  
  List<Address> addresses = new ArrayList<>();

  public void addAddress(String addressLine1, String addressLine2) {
    addresses.add(new Address(addressLine1, addressLine2));
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }

  public class Address {
    private String line1;
    private String line2;

    public Address(String line1, String line2) {
      this.line1 = line1;
      this.line2 = line2;
    }

    public void print() {
      System.out.println(line1 + ", " + line2);
    }

    @Override
    public String toString() {
      return "Address[line1="+this.line1+",line2="+line2+"]";
    }
  }

  public static void main(String[] args) {
    // Prepare 2 customers, each of them has his own addresses
    List<Customer2> customers1 = Arrays.asList(new Customer2(), new Customer2());
    
    customers1.get(0).addAddress("Sample Address Line 1", "Sample Address Line2");
    customers1.get(0).addAddress("ABCD EFG", "XYZ IJK");
    customers1.get(1).addAddress("123456", "789");

    // Retrieve all addresses from a list of customers
    List<Customer2.Address> allAddresses = customers1.stream()
        .flatMap(customer -> customer.getAddresses().stream())
        .collect(Collectors.toList());

    System.out.println(allAddresses);

    List<List<Customer2.Address>> listOfList = customers1.stream()
                                              .map(customer->customer.getAddresses())
                                              .collect(Collectors.toList());
    System.out.println("---------------");
    System.out.println(listOfList);

    List<List<Integer>> intList = new ArrayList<>(List.of(new ArrayList<>(List.of(1,3,5)),new ArrayList<>(List.of(2,4,6))));

    List<Integer> integers = intList.stream().flatMap(e->e.stream()).sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
    
    System.out.println(integers);

    //Return a List of cat names, with age > 9,order by the age of cats

    List<Cat> cats = new ArrayList<>(List.of(new Cat("Jenny", 10),new Cat("Karis", 8),new Cat("Andy",14)));

    List<String> catName = cats.stream().filter(c->c.getAge()>9).sorted(Comparator.comparingInt(Cat::getAge)).map(cat->cat.getName()).collect(Collectors.toList());

    System.out.println(catName);
  }
}
