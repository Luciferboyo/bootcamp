package demoClass.src;
public class People {
    //Attributes
    private String name;

    private int age;//0

    //Constructor(Produce Person is object)
    public People(){

    }
    public People(String name){
        this.name = name;
    }
    //Instance Method(Object method)
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}