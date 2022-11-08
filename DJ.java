package com.xworkz.dharsh;

public class DJ {
	public String DJname;
	public String DJOwner;
	public String DJsong;
	
	public DJ(String dJname, String dJOwner, String dJsong) {
		super();                                                       // constructor
		DJname = dJname;
		DJOwner = dJOwner;
		DJsong = dJsong;
		System.out.println("parameterised constructor of a parent class ");
	}

}
