package com.xworkz.dharsh;

public class Party {
	public String type;
	public boolean juiceIsAvailable;
	public boolean omSirsLastBachelorParty;
	public Party(String type, boolean juiceIsAvailable, boolean omSirsLastBachelorParty) {
		super();
		this.type = type;
		this.juiceIsAvailable = juiceIsAvailable;
		this.omSirsLastBachelorParty = omSirsLastBachelorParty;
		System.out.println("parameterised constructor of a parent class ");
	}

}
