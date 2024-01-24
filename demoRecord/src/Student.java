package demoRecord.src;
//King of Class
public record Student(String name,int age) {

  //All attributes in "record" have been "final";
  /*
  public void setName(String name){
    this.name = name;
  }
  */

  //only one constructor
}