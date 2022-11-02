package com.xworkz.Vikram;


import com.xworkz.dharsh.J8WarJet;
import com.xworkz.dharsh.J8;

public class J8Runner {
	public static void main(String[] args)
	{
		J8 f35=new J8();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

J8WarJet f35WarJet= new J8WarJet();
f35WarJet.geName();

	}

}
