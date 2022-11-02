package com.xworkz.Vikram;

import com.xworkz.dharsh.Mig21;
import com.xworkz.dharsh.Mig21WarJet;


public class Mig21Runner {
	public static void main(String[] args)
	{
		Mig21 f35=new Mig21();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

Mig21WarJet f35WarJet= new Mig21WarJet();
f35WarJet.geName();

	}
}
