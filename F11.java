package com.xworkz.dharsh;

public class F11 {
	 private String type;
	 String madeBy;
	 String mode;
	 String commander;           
	 String commanderName;       // im not initilizing any variables
	 String origin;
	 String use;  // variable with out a specifer // we cant modify this variables in different packages
     // we can only read it in diffrent packages

	 long cost;
	 String machNo;
	 boolean combat;
	 int Crew;


 public void display()
{
	System.out.println("type :"+type);
	System.out.println("madeBy :"+madeBy);
	System.out.println("mode :"+mode);
	System.out.println("commander :"+commander);
	System.out.println("origin :"+origin);
	System.out.println("use :"+use);
	System.out.println("cost :"+cost);
	System.out.println("machNo :"+machNo);
	System.out.println("combat :"+combat);
	System.out.println("Crew :"+Crew);
}
 
 void settype(String type)
 {
	this.type=type; 
 }
 public void  getType()
 {
	 System.out.println("type :"+type);
 }

}
