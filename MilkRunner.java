package com.xworkz.constructor121;

public class MilkRunner {
	
	public static void main(String[] args)
	{
		 Milk  milk;
		 milk=new  Milk(40);
		 milk.setColour("white"); // method
		
		 milk.shape="depends on packet"; //ref
		 milk.display();
	}

}
