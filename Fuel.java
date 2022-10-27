package com.xworkz.spydy;

public class Fuel {

	public Type type;  // enum 
	public int price;
	public double qyantityInLt;
	public boolean special;
	public Brand brand=new Brand("hydrogen fuel", 1222222, "banglore", "good");   // association 
	public Fuel(Type type, int price, double qyantityInLt, boolean special) {
		super();
		this.type = type;
		this.price = price;
		this.qyantityInLt = qyantityInLt;
		this.special = special;
	}
	
	
	public void displayFuel()
	{
		System.out.println("type   :"+type);
		System.out.println("price   :"+price);
		System.out.println("qyantityInLt   :"+qyantityInLt);
		System.out.println("special   :"+special);
		brand.display(); // revoking method of different class
		brand.gstNo=12334545; // revoking a variable of different class and re initializing 
		
	}
	
}


