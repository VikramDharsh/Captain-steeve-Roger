package com.xworkz.constructor121;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish fish;
		fish=new Fish();
		
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);         // default
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		System.out.println("nanna hale fish details");
		
		
		fish.name="jack";
		fish.type="Fresh water fish";
		fish.length=2.3;
		fish.price=80;
		fish.weight=10;
		
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
		
		System.out.println("********************");
		
		fish=new Fish("lazy");
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
		System.out.println("********************");
		
		fish=new Fish(80);
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
System.out.println("********************");
		
		fish=new Fish("fresh water",2.5);
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
System.out.println("********************");
		
		fish=new Fish(2.5);
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
System.out.println("********************");
		
		fish=new Fish(2.5,"jack");
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
System.out.println("********************");
		
		fish=new Fish(80,"fresh water");
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
		
System.out.println("********************");
		
		fish=new Fish(80,2.5);
		System.out.println("name  :"+fish.name);
		System.out.println("type  :"+fish.type);
		System.out.println("length in cm :"+fish.length);
		System.out.println("price in rupee :"+fish.price);
		System.out.println("weight in grams  :"+fish.weight);
	}

}
