package com.xworkz.spydy;

public class FuelRunner
{
public static void main(String[] args)
{
	Fuel fuel= new Fuel(Type.HYDROGEN, 1223, 200,true);
	fuel.displayFuel();  // calling method
    fuel.brand.name="ethanol";  // calling variable of the different class and initilizing 
    
	
}
}