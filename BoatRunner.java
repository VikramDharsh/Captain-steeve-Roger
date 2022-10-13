package com.xworkz.constructor121;

public class BoatRunner {

	public static void main(String[] args) {
		Boat boat;
		boat=new Boat();
		System.out.println("default details");
		
		System.out.println("name  :"+boat.name);
		System.out.println("type  :"+boat.type);
		System.out.println("colour :"+boat.colour);
		System.out.println("own name  :"+boat.ownerName);
		System.out.println("comp name  :"+boat.compName);
		
		System.out.println("***************************");
		
		boat=new Boat("titanic");
		System.out.println("name  :"+boat.name);
		System.out.println("type  :"+boat.type);
		System.out.println("colour :"+boat.colour);
		System.out.println("own name  :"+boat.ownerName);
		System.out.println("comp name  :"+boat.compName);
		
		
		System.out.println("***************************");
		
		boat=new Boat("black","titanic");
		System.out.println("name  :"+boat.name);
		System.out.println("type  :"+boat.type);
		System.out.println("colour :"+boat.colour);
		System.out.println("own name  :"+boat.ownerName);
		System.out.println("comp name  :"+boat.compName);
		
		
		System.out.println("***************************");
		
		boat=new Boat("passenger","black","titanic");
		System.out.println("name  :"+boat.name);
		System.out.println("type  :"+boat.type);
		System.out.println("colour :"+boat.colour);
		System.out.println("own name  :"+boat.ownerName);
		System.out.println("comp name  :"+boat.compName);
		
		
		System.out.println("***************************");
		
		boat=new Boat("passenger","black","jack","rose");
		System.out.println("name  :"+boat.name);
		System.out.println("type  :"+boat.type);
		System.out.println("colour :"+boat.colour);
		System.out.println("own name  :"+boat.ownerName);
		System.out.println("comp name  :"+boat.compName);
		
		
		System.out.println("***************************");
		boat=new Boat("black","titanic","jack","rose","passenger");
		System.out.println("name  :"+boat.name);
		System.out.println("type  :"+boat.type);
		System.out.println("colour :"+boat.colour);
		System.out.println("own name  :"+boat.ownerName);
		System.out.println("comp name  :"+boat.compName);
		
	}

}
