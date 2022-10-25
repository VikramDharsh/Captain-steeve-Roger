package com.xworkz.constructor121;

public class ShirtBrandRunner {
	

		public static void main(String[] args)
		{
			ShirtBrand  shirtBrand;
			shirtBrand=new  ShirtBrand(1350);
			shirtBrand.setColour("white"); // method
			
			shirtBrand.shape="depends on body size"; //ref
			shirtBrand.display();
		}

}
