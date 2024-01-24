package demoComparator.src;

public class Student implements Comparable<Student>{
  
  private int score;

  private String name;

  public Student(int score,String name){
    this.score = score;
    this.name = name;
  }

  public int getScore(){
    return this.score;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public int compareTo(Student o) {
    if (o.getName().compareTo(this.name) > 1) {
      return -1;
    }else if (o.getName().compareTo(this.name) == 0) {
        return o.getScore() > this.score ? -1:1;
    }else{
      return 1;
    }
    
  }

  @Override
  public String toString() {
    return "Student(score="+this.score+",name="+this.name+")";
  }
}
