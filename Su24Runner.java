package com.xworkz.Vikram;

import com.xworkz.dharsh.Su24;
import com.xworkz.dharsh.Su24WarJet;

public class Su24Runner {
	public static void main(String[] args)
	{
		Su24 f35=new Su24();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

Su24WarJet f35WarJet= new Su24WarJet();
f35WarJet.geName();

	}

}
