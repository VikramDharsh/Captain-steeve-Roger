package com.xworkz.spydy;

public class TempleRunner {
	public static void main(String[] args)
	{
		Temple temple;
		temple=new Temple("ram temple", "karthi", "infinity");
		temple.thorisu();  // calling or revoking method
		
				temple.god.mainPower="vara and shaapa"; // calling variable of different class using reference
	}

}
