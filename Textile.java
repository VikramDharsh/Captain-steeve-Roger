package com.xworkz.learningConstructor;

public class Textile {
	public String ownName;
	public String ownWifeName;
	public String ownDaughterName;
	public long  ownDaughterNo;
	public int noOfWifes;
	public byte shopNo;
	public long contNo;
	
	public Textile()
	{
		System.out.println("default constructor of textile");
	}
	public Textile(String ownName)
	{
		this();
		this.ownName=ownName;                                              
		System.out.println("chaining default constructor of same class");
	}
	public Textile(String ownName,String ownWifwName,String ownDaughterName)
	{
		this(ownName);
		this.ownWifeName=ownWifeName;
		this.ownDaughterName=ownDaughterName;
		System.out.println("chaining name constructor of same class");
	}
	public Textile(String ownName,String ownWifeName,String ownDaughterName,long  ownDaughterNo)
	{  // passing reference 
		this(ownName,ownWifeName,ownDaughterName);
		this.ownDaughterNo=ownDaughterNo;
		System.out.println("chaining wf name & ODNo construcftor  of same class");
	}
	
	public Textile(int noOfWifes)
	{
		this("vikram","searching","wife illa inna daughter elli",83783783);
		this.noOfWifes=noOfWifes;
		System.out.println("chaininig daughterNO construcftor  of same class");
		
	}
	public Textile(String ownName,String ownWifeName,String ownDaughterName,long  ownDaughterNo,int noOfWifes,long contNo)
	{
		this(5);
		this.noOfWifes=noOfWifes;
		System.out.println("chaining daughterNO construcftor  of same class");
	}
public Textile(byte shopNo)
{this(8);
this.shopNo=shopNo;
	
	}
}
