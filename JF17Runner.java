package com.xworkz.learningConstructor;

public class JF17Runner {
	
	public static void main(String[] args) {
		 String[] role= {"multirole ","air supirior","missile carrier"};
		 String[] origin= {"chaina","USSAR","russian"};
		 String[] varients={"j10","FJ20"};
		 String[] features= {"air to air strike","air to ground strike"};
		
		 JF17  jF17;
		 jF17=new  JF17(role,origin,varients,features);
		 
		 jF17.expose();
		 
	}

}
