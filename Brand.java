package com.xworkz.spydy;

public class Brand {
	public String name;        //hydrogen fuel
	public long gstNo;
	public Location location=new Location("kr circle", "kolar", "karnataka", "india", 563126);
	public String rating;
	public Brand(String name, long gstNo, String rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}
	public void display()
	{
		System.out.println("name   :"+name);
		System.out.println("gstNo   :"+gstNo);
		System.out.println("rating   :"+rating);
		location.show(); // revoking method of diffrent class using reference
		
	}
	
	
	
	
	

}
