package demoArrayList.src;

import java.util.Objects;

public class Author {
  
  private String name;

  public Author(String name){
    this.name = name;
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return Objects.hash(this.name);
  }

  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Author)) {
      return false;
    }

    Author author = (Author)obj;
    return Objects.equals(this.name,author.name);
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.name;
  }
}
