package com.xworkz.Vikram;

import com.xworkz.dharsh.J20;
import com.xworkz.dharsh.J20WarJet;

public class J20Runner {
	public static void main(String[] args)
	{
		J20 f35=new J20();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

J20WarJet f35WarJet= new J20WarJet();
f35WarJet.geName();

	}

}
