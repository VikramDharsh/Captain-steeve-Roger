package com.xworkz.dharsh;

public class J20WarJet {
	private String name="fighterr air craft";
	public void access()
	
	{
		 J20 f35=new J20();
		 f35.settype("combat");        // we did modification as well  reading in the same package of a private specified variable through method
		 f35.getType();
		 f35.settype(" light combat");
		 f35.getType();
		 f35.display();

	}
	public void geName()
	{
		System.out.println("name  :"+name);
	}

}
