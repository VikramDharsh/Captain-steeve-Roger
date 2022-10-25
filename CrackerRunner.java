package com.xworkz.constructor121;

public class CrackerRunner {
	public static void main(String[] args)
	{
		Cracker cracker;
		cracker=new Cracker(12000000);
		cracker.setColour("black"); // method
		
		cracker.shape="as shape as missile"; //ref
		cracker.display();
	}
}
