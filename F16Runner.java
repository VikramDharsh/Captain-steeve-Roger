package com.xworkz.Vikram;

import com.xworkz.dharsh.F16;
import com.xworkz.dharsh.F16WarJet;


public class F16Runner {

	public static void main(String[] args)
	{
F16 f16=new F16();
f16.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

F16WarJet f16WarJet= new F16WarJet();
f16WarJet.geName();

	}
	

}
