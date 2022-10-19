package com.xworkz.learningConstructor;

import com.xworkz.constants.JetNames;
import com.xworkz.constants.Mach;

public class JF17 {
	public JetNames name=JetNames.JF17;
	public Mach speedInMach=Mach.TWO;
	public byte lengthInMeter=26;	
	public boolean Inservice=true;     // literal

	
	public String[] role;    // ill create copies for only arrays
	public String[] origin;
	public String[] varients;   // ill initialize using constructor
	public String[] features;
	
	public JF17(String[] role,String[] origin,String[] varients,String[] features)
	{
		this.role=role;
		this.features=features;
		this.origin=origin;
		this.varients=varients;
		System.out.println("constructor working");
	}
	public void expose()
	{
		
		System.out.println("name  :"+name);
		System.out.println("speedInMach  :"+speedInMach);
		System.out.println("lengthInMeter  :"+lengthInMeter);
		System.out.println("Inservice  :"+Inservice);
		
		System.out.println("*************************************");
		
		for (int i = 0; i < features.length; i++) {
			String string = features[i];
			System.out.println("features   :"+string);
			System.out.println("*************************************");
		}
		for (int i = 0; i < role.length; i++) {
			String string = role[i];
			System.out.println("role   :"+string);
			System.out.println("*************************************");
		}
		for (int i = 0; i < origin.length; i++) {
			String string = origin[i];
			System.out.println("origin   :"+string);
			System.out.println("*************************************");
		}
		for (int i = 0; i < varients.length; i++) {
			String string = varients[i];
			System.out.println("varients   :"+string);
			System.out.println("*************************************");
			
		}
	}

}
