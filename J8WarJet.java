package com.xworkz.dharsh;

public class J8WarJet {
	private String name="fighterr air craft";
	public void access()
	
	{
		 J8 f16=new J8();
		 f16.settype("combat");        // we did modification as well  reading in the same package of a private specified variable through method
		 f16.getType();
		 f16.settype(" light combat");
		 f16.getType();
		 f16.display();

	}
	public void geName()
	{
		System.out.println("name  :"+name);
	}
}
