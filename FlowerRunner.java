package com.xworkz.constructor121;

public class FlowerRunner {
	public static void main(String[] args)
	{
		Flower flower;
		flower=new Flower(40);
		flower.setColour("white"); // method
		
		flower.shape="oval"; //ref
		flower.display();
	}
}
