package com.xworkz.spydy;

public class Temple {
	public String name;
	public String mainPriest;
	public String noOFVisitors;
	public God god=new God("ram", "male", "one wife");
	public Temple(String name, String mainPriest, String noOFVisitors) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOFVisitors = noOFVisitors;
	}
	
	
	public void thorisu()
	{
		System.out.println("name   "+name);
		System.out.println("mainPriest   "+mainPriest);
		System.out.println("noOFVisitors   "+noOFVisitors);
		god.exposeAll();   // calling  a method of different class
		god.mainPower="shaaapa kodadu"; // calling variable of different class
		
	}
	

}
