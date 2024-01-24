package demoClass.src.staticvariable;

public class Book {
  

  private int bookId;

  private String bookName;

  private static int idx;

  public Book(){
    this.bookId = ++idx;
  }

  public Book(String bookName){
    
    this.bookName = bookName;
  }

  //set and get

  public void setBookName(String bookName){
    this.bookName = bookName;
  }

  public String getBookName(){
    return this.bookName;
  }

  public int getBookId(){
    return this.bookId;
  }


  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "The book is " + this.bookName + ",the book's id is " + bookId;
  }
}
