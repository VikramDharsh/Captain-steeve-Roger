package com.xworkz.spydy;

public class Weapon {
	public String name;
	public String use;
	public double  weight;
	
	
	public Weapon(String name, String use, double weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
	}
	 public void  expose()
	{
		System.out.println("name   :"+name);
		System.out.println("use   :"+use);
		System.out.println("weight   :"+weight);

	
}
}