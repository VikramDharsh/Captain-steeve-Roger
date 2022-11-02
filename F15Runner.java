package com.xworkz.Vikram;

import com.xworkz.dharsh.F15;
import com.xworkz.dharsh.F15WarJet;

public class F15Runner {
	public static void main(String[] args)
	{
F15 f11=new F15();

f11.getType(); // accesing the private specified variable of different package// we can only read it cant modify in different package

F15WarJet f11WarJet= new F15WarJet();
f11WarJet.geName();  // accesing the private specified variable of different package// we can only read it cant modify in differet package


	}


}
