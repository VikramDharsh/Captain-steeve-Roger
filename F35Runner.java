package com.xworkz.Vikram;

import com.xworkz.dharsh.F35;
import com.xworkz.dharsh.F35WarJet;

public class F35Runner {
	public static void main(String[] args)
	{
F35 f35=new F35();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

F35WarJet f35WarJet= new F35WarJet();
f35WarJet.geName();

	}
}
