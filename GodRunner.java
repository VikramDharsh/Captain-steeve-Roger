package com.xworkz.spydy;

public class GodRunner {

	public static void main(String[] args) {
		God god=new God("Ram", "male", "expert in archery"); // instansation
		god.exposeAll();
		god.weapon.use="war purpose";  // re initilization through reference // sumne hange nan kushige
	}

}
