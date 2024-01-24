package demoBuilderPattern.src.exercise;

import javax.print.DocFlavor.STRING;

public class Buiger {
  private String bun;
  private String meat;
  private String salad;
  private String cheese;
  private String sauce;

  public Buiger(){

  }

  public Buiger(String bun,String meat,String salad,String cheese,String sauce){
    this.bun = bun;
    this.meat = meat;
    this.salad = salad;
    this.cheese = cheese;
    this.sauce = sauce;
  }

  public static class Builder {
    private String bun;
    private String meat;
    private String salad;
    private String cheese;
    private String sauce;
    
    public Builder bun(String bun){
      this.bun = bun;
      return this;
    }

    public Builder meat(String meat){
      this.meat = meat;
      return this;
    }

    public Builder salad(String salad){
      this.salad = salad;
      return this;
    }

    public Builder cheesse(String cheese){
      this.cheese = cheese;
      return this;
    }

    public Builder sauce(String sauce){
      this.sauce = sauce;
      return this;
    }

    public Buiger build(){
      return new Buiger(this.bun,this.cheese,this.meat,this.salad,this.sauce);
    }
  }
}
