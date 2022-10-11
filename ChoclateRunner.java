package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.Choclate;

public class ChoclateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Choclate chak=	new Choclate ();
		
		 System.out.println("entered ");
		 
		chak.brand="cadbury";
		chak.flavour="strawberry";
		chak.name="sweet cadb Bury";
		chak.price=200;
		
		 
		System.out.println("brand  :"+chak.brand);
		System.out.println("flavour :"+chak.flavour);
		System.out.println("name :"+chak.name);
		System.out.println("price  :"+chak.price);
		
		System.out.println("*******************");
		System.out.println("updating details");
		
		chak.brand="still not eregistered";
		chak.flavour="orange";
		chak.name="pepparamentu";
		chak.price=1;
		
		
		System.out.println("brand  :"+chak.brand);
		System.out.println("flavour :"+chak.flavour);
		System.out.println("name :"+chak.name);
		System.out.println("price in rupees :"+chak.price);
	}
	

}
