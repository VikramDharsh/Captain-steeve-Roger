package com.xworkz.dharsh;

public class Catering {
	public String catName;
	public String catOwner;
	public String catSong;
	public Catering(String catName, String catOwner, String catSong) {
		super();
		this.catName = catName;
		this.catOwner = catOwner;
		this.catSong = catSong;
		System.out.println("parameterised constructor of a parent class ");
	}
}
