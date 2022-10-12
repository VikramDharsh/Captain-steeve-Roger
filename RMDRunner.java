package com.xworkz.constructor121;

public class RMDRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RMD rMD=new RMD();
		rMD.compName="manik chand groups";
		rMD.estDate="1991";
		rMD.compOwner="prakash rasiklal";
		rMD.compCEO="rupaali karnawath";
		rMD.compLocation="india";
		rMD.compDomain="private";
		rMD.compGrowth="10%";
		rMD.compCountry="india";
		rMD.noCompEmploys="200000";
		
		System.out.println("RMD product company details ");
		
		System.out.println("comp name  :"+rMD.compName);
		System.out.println("comp established in  :"+rMD.estDate);
		System.out.println("comp owner  :"+rMD.compOwner);
		System.out.println("comp CEO  :"+rMD.compCEO);
		System.out.println("comp location :"+rMD.compLocation);
		System.out.println("comp domain  :"+rMD.compDomain);
		System.out.println("comp growth  :"+rMD.compGrowth);
		System.out.println("comp country  :"+rMD.compCountry);
		System.out.println("np of employees   :"+rMD.noCompEmploys);
		
		System.out.println("product details");
		
		System.out.println("name :"+rMD.name);
		System.out.println("price :"+rMD.price);
		System.out.println("chemical used :"+rMD.chemicalUsed);
		System.out.println("quantity :"+rMD.quantity);
		System.out.println("colour  :"+rMD.colour);
		System.out.println("it has agmark :"+rMD.agMark);
		System.out.println("it is availbale in india :"+rMD.availableInIndia);
		System.out.println("it is good for health  :"+rMD.goodForHealth);
		System.out.println("it is natural :"+rMD.natural);
	}

}
