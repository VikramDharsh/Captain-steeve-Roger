package com.xworkz.learningConstructor;

public class Chain {

	public String type;
	public String material;
	public int price;
	public float length ;
	public double weight;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;
	
	public Chain()
	{
		//super //parent class //like innond profram alli iro constructor 
		// innond program alli no argument ge match adre alliro msg print odiyutte 
		System.out.println("default constructor of chain");
	}
	public Chain(String type)
	{
		this();
		this.type=type; //this // same class
	
		System.out.println(" chaining default values of same class");
	}
	public Chain(String material,String usedFor)
	{
		this("gold chain");
		this.material=material;
		this.usedFor=usedFor;
		
	
		System.out.println(" chaining type of same class");
	}
	public Chain(int price)
	{
		this("gold","make up");
		this.price=price;
		System.out.println(" chaining material and use of same class");
	}
	public Chain(float length)
	{
		this(600000);
		this.length=length;
		System.out.println(" chaining price of same class");
	}

public Chain(double weight)
{
	this(45.43f);
	this.weight=weight;
	System.out.println(" chaining price of same class");
}
public Chain(boolean stolen)
{
	this(5.87d);
	this.stolen=stolen;
	System.out.println(" chaining weight of same class");
}

	
}
