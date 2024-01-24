package demoException.src.exercise;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
  public static void main(String[] args) {
    try {
      //this line tries to find the file.txt in E drive
      //Following file does not exist
      File file = new File("E://file.txt");

      FileReader reader = new FileReader(file);
    } catch (java.io.FileNotFoundException e) {
      // TODO: handle exception
      System.out.println("File does not exist");
    }
  }
}
