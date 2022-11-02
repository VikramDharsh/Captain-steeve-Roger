package com.xworkz.Vikram;

import com.xworkz.dharsh.F22;
import com.xworkz.dharsh.F22WarJet;

public class F22Runner {
	public static void main(String[] args)
	{
F22 f35=new F22();
f35.getType(); // accesing the private specified variable of different package// we can only read it cant modify in another class of different package

F22WarJet f35WarJet= new F22WarJet();
f35WarJet.geName();

	}

}
