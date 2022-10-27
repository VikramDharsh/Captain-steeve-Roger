package com.xworkz.spydy;

public class Location {

	public String street;
	public String city;
	public String state;
	public String country;
	public long pinCode;
	public Location(String street, String city, String state, String country, long pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	public void show()
	{
		System.out.println("street  :"+street);
		System.out.println("city  :"+city);
		System.out.println("state  :"+state);
		System.out.println("country  :"+country);
		System.out.println("pinCode  :"+pinCode);
	}

	
	
}
