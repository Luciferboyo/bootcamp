package demoException.src.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.lang.NumberFormatException;
public class StackTraceDemo{
  public static void main(String[] args) {
    Path filePath = Paths.get("someFile.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int getSomeInteger1(String filePath)throws FileNotFoundException{
    Scanner scanner = new Scanner(new File(filePath));
    return Integer.parseInt(scanner.nextLine());
  }

  public int getSomeInteger2(String filePath){
    try {
      Scanner scanner = new Scanner(new File(filePath));
      return Integer.parseInt(scanner.nextLine());
    } catch(Exception exception){
      exception.printStackTrace();
      return 0;
    }
  }

  public int getSomeInteger3(String filePath) throws FileNotFoundException{
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File(filePath));
      return Integer.parseInt(scanner.nextLine());
    } finally{
      if (scanner != null) {
        scanner.close();
      }
    }
  }

  //
  public int getSomeInteger4(String filePath) {
    //we do not need to close the resource ourselves.
    try (Scanner scanner = new Scanner(new File(filePath))){
      return Integer.parseInt(scanner.nextLine());
    }catch(FileNotFoundException e){
      System.out.println("File not found!Returnning 0....");
      return 0;
    }
  }

  public int getSomeInteger5(String filePath) {
    //
    try (Scanner scanner = new Scanner(new File(filePath))){
      return Integer.parseInt(scanner.nextLine());
    }catch(FileNotFoundException e){
      System.out.println("File not found!Returnning 0....");
      return 0;
    }catch(NumberFormatException e){
      System.out.println("Unable to parse integer!Returning 0....");
      return 0;
    }
  }

  public int getSomeInteger6(String filePath) {
    //Notice the | operator that separates the exceptions
    try (Scanner scanner = new Scanner(new File(filePath))){
      return Integer.parseInt(scanner.nextLine());
    }catch(FileNotFoundException | NumberFormatException e){
      System.out.println("File not found!Returnning 0....");
      return 0;
    }
  }
}
