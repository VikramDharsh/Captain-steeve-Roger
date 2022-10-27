package com.xworkz.spydy;

public class Mountain {
	
	public String name="K2";
	public Location location=new Location("mullahalli", "kolar", "karnataka", "india", 563126);
    public int heightInMeter=8612;
    public Temple temple=new Temple("kylaasa", "yogi adithya nath", "infinity");
    
    
    // no argumengt contructor is there im not creating any constructor
    public void display()
    {
    	System.out.println("name  :"+name);
    	System.out.println("heightInMeter  :"+heightInMeter);
    	location.show(); // calling location 
    	temple.thorisu(); // calling or revoking temple  // nenpitko both variable and method can be revoke
    	
    }
    
}
