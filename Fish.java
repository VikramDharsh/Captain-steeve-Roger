package com.xworkz.constructor121;

public class Fish {
	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;
	
	Fish()
	{
		System.out.println(" entered no argument constructor");
	}
	Fish(String name)
	{
		this.name=name;
		
	}
	Fish(int price)
	{
		this.price=price;
		
}
	Fish(String type,double length)
	{
		this.type=type;
		this.length=length;
		
}
	Fish(double weight)
	{
		this.weight=weight;
		
}
	Fish(double length,String name)
	{
		this.length=length;
		this.name=name;
}
	Fish(int price,String type)
	{
		this.price=price;
		this.type=type;
}
	Fish(int price,double length)
	{
		this.price=price;
		this.length=length;
}
}