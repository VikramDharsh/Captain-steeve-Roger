package com.xworkz.spydy;

public class Pillar {
public String name="420";
public  Shape shape=Shape.RECTANGLE;
public int id=344;
public String place="england";
public int heightInMet=21;
public Company company=new Company();


public void display()
{
	System.out.println("name  :"+name );
	System.out.println("shape  :"+shape );
	System.out.println("id  :"+id );
	System.out.println("place  :"+place );
	System.out.println("heightInMet  :"+heightInMet );
	
	company.display();// revoke 
	
	
	}




}
