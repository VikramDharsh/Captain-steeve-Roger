package com.xworkz.constructor121;

public class PassPort {
	
	public int no;
	public String name;
	public short expiryDate;
	public String country;
	public int issuedDate;
	public double noOfLeaves;

	public PassPort() {
		System.out.println("start the runner");
	}

	public PassPort(int no) {
		this.no = no;
	}

	public PassPort(String name) {
		this.name = name;
	}

	public PassPort(short expiryDate) {
		this.expiryDate = expiryDate;
	}

	public PassPort(double noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public PassPort(String name, int issuedDate) {
		this.name = name;
		this.issuedDate = issuedDate;
	}
	public PassPort(String country,String name) {
		this.country=country;
		this.name=name;

}
}