package com.xworkz.spydy;

public class God {
	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon=new Weapon("archery","for the war",20000);
	
	
	
	public God(String name, String gender, String mainPower) 
	{
		super();
		this.name = name;                                     // constructor
		this.gender = gender;   
		this.mainPower = mainPower;
	}



	public void exposeAll()         // it has acces to both static as well as non static
	{
		System.out.println("name :"+name);                           //method
		System.out.println("gender :"+gender);
		System.out.println("mainPower :"+mainPower);
	 if(weapon!=null)
	 {
		 
		weapon.expose();     // accesing the method of the different class
		
		weapon.name ="raavan" ;            // accesing the variable  of the different class  and re initilizing
		
		System.out.println("name :"+weapon.name);
	}
	 else
	 { 
		 System.out.println("weapon is pointing  to null");
	 }
	 
	
	

	
	}	
	

}
