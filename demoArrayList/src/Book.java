package demoArrayList.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private String name;

  public Book(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString() {
    return "Book(name="
          +this.name
          +")";
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return Objects.hash(this.name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book)) {
      return false;
    }
    Book book = (Book) obj;
    return Objects.equals(this.name,book.getName());
  }

  public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>();
    
     Book book = new Book("ABC");
    //add
    bookList.add(book);
    bookList.add(new Book("DEF"));
    bookList.add(new Book("HIJ"));

    //contains Book ABC
    if (bookList.contains(new Book("ABC"))) {//if no equals,answer is false,because there is no equals,the addresses of the two objcet are compared
      System.out.println("contain "+ book.getName());
    }
  }
}
