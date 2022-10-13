package com.xworkz.constructor121;

public class Boat {
	public String name;
	public String colour;
	public String compName;
	public String type;
	public String ownerName;
	
	Boat()
	{
		System.out.println("default constructor");
	}
	
	Boat(String name)
	  {
		this.name=name;
	  }
	Boat(String colour,String name)
	  {
		this.name=name;
		this.colour=colour;
	  }
	
	Boat(String type,String colour,String name)
	  {
		this.type=type;
		this.colour=colour;
		this.name=name;
	  }

	Boat(String name,String colour,String ownerName,String compName)
	  {
		this.compName=compName;
		this.name=name;
		this.colour=colour;
		this.ownerName=ownerName;
	  }
	Boat(String colour,String name,String ownerName,String compName,String type)
	  {
		this.type=type;
		this.compName=compName;
		this.name=name;
		this.colour=colour;
		this.ownerName=ownerName;
	  }
}
