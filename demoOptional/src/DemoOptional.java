package demoOptional.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import demoOptional.src.DemoOptional;
public class DemoOptional {
  public static void main(String[] args) {
    //Cat:age,name
    //Cat.class,Cat is the name of a class only,You can name it anything, such as Box.
    //Or you can simply treat it as AgeAndNameHolder.class

    //Important Note:We never use Option<T> as input parameter's type.
    //Inside the method,we still need to perform null check on Optional<T>
    //So we can't see any benefit in using Opional<T> in input parameter.
    //Optional is primarily intended for use as a method return type where there is a clear need to represent "no result," and where using null is likely to cause errors. 
    //A variable whose type is Optional should never itself be null; it should always point to an Optional instance.
    
    List<Account> accounts = new ArrayList<>(List.of(new Account(1,80.0d),new Account(2,120.0d)));
    
    Optional<Account> optaccount = accounts.stream()
      .filter(e->e.getBalance() > 30.0d)
      .findFirst();

    if (!optaccount.isPresent()) {
      System.out.println(optaccount.get().getAccountNo());
    }

    
  }
}

