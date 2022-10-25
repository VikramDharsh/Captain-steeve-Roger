package com.xworkz.constructor121;

public class Mango {
	public String name="baadami"; // literal
	public String colour;  // ill initiate using method
	public int price;  // constructor
	public String shape;// reference
	public static double weightINGram=1200;
	
	
	public void setColour(String colour)
	{
		this.colour=colour;
		
	}
	public Mango(int price)
	
	{
		this.price=price;
	}	
public void display()
{                                             // instance method has accecs to both static and instance variable
	System.out.println("name  :"+name);
	System.out.println("colour :"+colour);
	System.out.println("price  :"+price);
	System.out.println("shape  :"+shape);
	System.out.println("weightINGram  :"+weightINGram);
	
}
}
