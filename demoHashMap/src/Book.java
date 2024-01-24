package demoHashMap.src;

import java.util.Objects;

public class Book {
  
  String author;

  String bookName;

  public Book(String author,String bookName){
    this.author = author;
    this.bookName = bookName;
  }

  public Book(){

  }

  @Override
  public String toString() {
    return this.bookName;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book)) {
      return false;
    }
    Book book = (Book)obj;
    return Objects.equals(this.author, book.author)
        && Objects.equals(this.bookName, book.bookName);
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return Objects.hash(this.author,this.bookName);
  }
}
