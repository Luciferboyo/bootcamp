package demoClass.src;

public class StringBox {
  private char[] charaters;//object reference type
  public static void main(String[] args) {

    StringBox stringBox = new StringBox("hello");

    System.out.println(stringBox.toString());

    System.out.println("--------------------------");

    StringBox sb1 = new StringBox("11");
    StringBox sb2 = sb1.concat2("11");
    StringBox sb3 = sb1.concat("11");
    System.out.println(sb1.getAddress());
    System.out.println(sb2.getAddress());
    System.out.println(sb3.getAddress());
    System.out.println("----------------------");
    //stringBox = stringBox.concat("world");
    String s3 = "a";
    System.out.println(System.identityHashCode(s3));
    String s1 = new String("a");
    System.out.println(System.identityHashCode(s1));
    String s = "a";
    System.out.println(System.identityHashCode(s));
    String s2 = new String("a");
    System.out.println(System.identityHashCode(s2));


  }

  public StringBox(){

  }
  public StringBox(String str){
      this.charaters = new char[str.length()];
      for(int i = 0;i < str.length();i++){
        this.charaters[i] = str.charAt(i);
      }
  }

  @Override
  public String toString(){
    return String.valueOf(this.charaters);
  }

  public String getString(char[] c){
    return charaters.toString();
  }

  public StringBox getAddress(){
    return this;
  }

  public char[] setString(char[] c,int length){
    char[] charaters2 = new char[charaters.length + length];
    for(int i = charaters.length;i < charaters2.length;i++){
      charaters2[i] =  c[i - charaters.length];
    }
    return charaters2;
  }

  public void append(String string){
    char[] c1 = new char[string.length() + length()];
    for(int i = 0;i < c1.length; i++){
      if(i < length()){
        c1[i] = charaters[i]; 
      }else{
        c1[i] = string.charAt(i - length());
      }
    }
    this.charaters = c1;
  }

  private int length(){
    return this.charaters.length;
  }

  public StringBox concat(String string){
    char[] c1 = new char[string.length() + length()];
    for(int i = 0;i < c1.length; i++){
      if(i < length()){
        c1[i] = charaters[i]; 
      }else{
        c1[i] = string.charAt(i - length());
      }
    }
    return new StringBox(c1.toString());
  }
  
  //Similar to StringBuilder append()
  public StringBox concat2(String string){
    char[] c1 = new char[string.length() + length()];
    for(int i = 0;i < c1.length; i++){
      if(i < length()){
        c1[i] = charaters[i]; 
      }else{
        c1[i] = string.charAt(i - length());
      }
    }
    this.charaters = c1;
    return this;
  }



  public boolean isEmty(){
    return length() == 0;
  }

  public StringBox replace(String a,String b){
    return this;
  }
}

