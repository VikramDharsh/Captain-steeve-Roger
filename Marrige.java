package com.xworkz.dharsh;

public class Marrige {
	public String boyName;
	public String girlName;
	public String Type;
	
	public Marrige()
	{}

	public Marrige(String boyName, String girlName, String type) {
		super();
		this.boyName = boyName;
		this.girlName = girlName;
		Type = type;
		System.out.println("parameterised constructor of a parent class ");
	}
	
	

}
