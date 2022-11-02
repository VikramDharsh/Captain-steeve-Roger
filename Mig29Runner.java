package com.xworkz.Vikram;

import com.xworkz.dharsh.Mig29;
import com.xworkz.dharsh.Mig29WarJet;

public class Mig29Runner {
	public static void main(String[] args)
	{
		Mig29 f35=new Mig29();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

Mig29WarJet f35WarJet= new Mig29WarJet();
f35WarJet.geName();

	}	
}
