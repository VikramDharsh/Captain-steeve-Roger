package com.xworkz.dharsh;

public class F11WarJet {
	private String name="fighterr air craft";
	public void access()
	
	{
		 F11 f11=new F11();
		 f11.settype("combat");        // we did modification as well  reading in the same package of a private specified variable through method
		 f11.getType();
		 f11.settype(" light combat");
		 f11.getType();
		 f11.display();

	}
	public void geName()
	{
		System.out.println("name  :"+name);
	}

}
