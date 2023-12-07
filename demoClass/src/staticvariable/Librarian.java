package demoClass.src.staticvariable;

import java.time.LocalDate;

public class Librarian {
  
  private String librarianName;

  private int workId;

  private LocalDate startDate;

  private LocalDate endDate;

  public Librarian(){

  }

  public Librarian(String librarianName){
    this.librarianName = librarianName;
  }
  
  public String getLibrarianName(){
    return this.librarianName;
  }
}
