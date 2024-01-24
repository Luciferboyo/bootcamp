package demoOptional.src.exercise;

import java.io.IOException;
import java.io.Serializable;
import java.util.Optional;


public class UserOptionalField implements Serializable{
  
  private long  userId;

  //transient is means that the variable does not participate in the sserialization process of the object.
  private transient Optional<String> firstName;

  public void setUserId(long userId){
    this.userId = userId;
  }

  public void setFirstName(Optional<String> firstName){
    this.firstName = firstName;
  }

  private void writeObject(java.io.ObjectOutputStream out) throws IOException{
    out.defaultWriteObject();
    out.writeObject(firstName.orElse(null));
  }

  private void readObject(java.io.ObjectInputStream input) throws IOException,ClassNotFoundException{
    input.defaultReadObject();
    firstName = Optional.ofNullable(((String)input.readObject()));
    
  }

  public static void main(String[] args) {
    
    UserOptionalField user = new UserOptionalField();

    user.setUserId(1l);

    user.setFirstName(Optional.of("BOBO"));

    
  }
}
