package com.xworkz.Vikram;

import com.xworkz.dharsh.Su25;
import com.xworkz.dharsh.Su25WarJet;

public class S25Runner {
	public static void main(String[] args)
	{
		Su25 f35=new Su25();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

Su25WarJet f35WarJet= new Su25WarJet();
f35WarJet.geName();

	}
}
