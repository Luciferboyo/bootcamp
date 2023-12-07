package demoClass.src.staticvariable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
  
  private static int bookCounter = 0;

  private static Librarian librarian;

  private Book[] books;

   public Library(){
      books = new Book[0];    
  }


  public Library(Librarian librarian){
    this.books = new Book[0];

    Library.librarian = librarian;
  }



  public Book addBook(Book book){
    
    bookCounter++;

    Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);

    newBooks[newBooks.length - 1] = book;

    return newBooks[newBooks.length - 1];
  }

  public String librarianName(Librarian librarian){
    return librarian.getLibrarianName();
  }

  public static void main(String[] args) {
    
    Library library = new Library();
    
    Book book = new Book("aaa");

    library.addBook(book);

    System.out.println(Library.bookCounter);

    Librarian librarian = new Librarian("Tommy");

    String librarianName = library.librarianName(librarian);
    System.out.println(librarianName);
  }
}
