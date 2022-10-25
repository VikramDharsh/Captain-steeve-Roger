package com.xworkz.constructor121;

public class MangoRunner {

	public static void main(String[] args)
	{
		Mango  mango;
		mango=new  Mango(40);
		mango.setColour("yellow"); // method
		
		mango.shape="oval"; //ref
		mango.display();
	}
}
