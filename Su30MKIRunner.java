package com.xworkz.learningConstructor;

public class Su30MKIRunner {

	public static void main(String[] args) {
		 String[] role= {"multirole ","air supirior","missile carrier"};
		 String[] origin= {"russia","india"};
		 String[] varients={"sukhoi su-30MKM","sukhoi MKM"};
		 String[] features= {"air to air strike","air to ground strike"};
		
		 Su30MKI su30MKI;
		 su30MKI=new Su30MKI(role,origin,varients,features);
		 
		 su30MKI.expose();
	}

}
