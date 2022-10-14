package com.xworkz.learningConstructor;

public class Tractor {
	public String name;
	public String brand;
	public String colour;
	public String hp;
	public String model;
	public double price;
	
	Tractor(){
	
		System.out.println("default constructor of a tractor");
	}
	Tractor(String name)
	{
		this();
		this.name=name;
		System.out.print("chained with default constructor");
	}
	
	Tractor(String brand,String colour)
	{
		this("fergusen");
		this.brand=brand;
		this.colour=colour;
		System.out.println("chained with name argument contructor");
	}
	Tractor(double price,String hp)
	{
		this("Fg","red");
		this.hp=hp;
		this.price=price;
		System.out.println("chained with brand and colour");
	
	}
	Tractor(double price,String colour,String model)
	{
		this(70000000,"200");
		this.model=model;
		System.out.println("chained with brand and hp");
	
}
	Tractor(double price)
	{
		this(700000,"red","2019");
		this.price=price;
		System.out.println("chained with price,colour,model");
	
}
}
