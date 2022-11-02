package com.xworkz.Vikram;

import com.xworkz.dharsh.F11;
import com.xworkz.dharsh.F11WarJet;

public class F11Runner {
	public static void main(String[] args)
	{
F11 f11=new F11();
f11.getType(); // accesing the private specified variable of different package// we can only read it cant modify in different package

F11WarJet f11WarJet= new F11WarJet();
f11WarJet.geName();  // accesing the private specified variable of different package// we can only read it cant modify in differet package


	}

}
