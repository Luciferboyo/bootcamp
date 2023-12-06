package demoClass.src;
public class People {
    //Attributes
    private String fristName;

    private String lastName;

    private int age;//0

    //Constructor(Produce Person is object)
    public People(){

    }


    public People(String name){
        this.fristName = name; 
        this.lastName = "";
    }

    public People(String surname,String name){
        this.fristName = name; 
        this.lastName = surname;
    }

    public People(String surname,String name,int age){
        //this(lastName,fristName);
        this.fristName = name; 
        this.lastName = surname;
        this.age = age;
    }
    //Instance Method
    //1.Belongs to the object(Person p1 = new Person(); p1.swim();)
    //2.Able to control the instance variable by "this"

    //Static Method
    //1.Belongs to the class(ClassName.staticMethod() -> Person.swim(3))
    //2.Not able to read/write instance variable
    //3.The output completely derived by the input parameters

    //Instance Method(Object method)
    //Setter
    public void setFullName(String surname, String name){
        fristName = name;
        this.lastName = surname;
    }
    public String getFullName(){
        return lastName.concat(" ").concat(fristName);
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public String getFirstName(){
        return fristName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String name){
        this.fristName = name;
    }
    public void setLastName(String surname){
        this.lastName = surname;
    }
    
    public String getUpperAndLower(boolean str){
        return str ? getFullName().toUpperCase():getFullName().toLowerCase();
    }

    public String getFullName2(String firstName,String lastName){
        return this.fristName.substring(0, 1).toLowerCase()
            .concat(this.fristName.substring(1,this.lastName.length()))
            .concat(" ")
            .concat(this.lastName.substring(0,1))
            .concat(this.lastName.substring(1,this.lastName.length()));
    }

     public String getFullName3(String firstName,String lastName){
        return String.valueOf(this.fristName.charAt(0)).toUpperCase()
            .concat(this.fristName.substring(1,this.lastName.length()))
            .concat(" ")
            .concat(this.lastName.substring(0,1))
            .concat(this.lastName.substring(1,this.lastName.length()));
    }

     public String getFullName4(){
        //if lastName -> "",return"John";
        //if lastName -> "x",return "John X"
        if (this.lastName == null) {
            return this.fristName;
        }
        return this.lastName.isEmpty() ? this.fristName:this.fristName.concat(" ").concat(this.lastName);
    }
    
    public void swim(){//void method can be with "return" or without "return"
        int a = 1;
        if (a > 2) 
            return;
        System.out.println("hello");
    }

    public int eat(){//int method has to be with "return" keyword
        int b = 10;
        if (b < 12) 
            return 100;
        return -1;
    }

    public static void swimming(){
        System.out.println("i am __");
    }
}