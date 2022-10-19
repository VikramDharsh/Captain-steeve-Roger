package com.xworkz.learningConstructor;

public class J10CRunner {
	public static void main(String[] args) {
		 String[] role= {"multirole ","air supirior","missile carrier"};
		 String[] origin= {"chaina","pakisthan"};
		 String[] varients={"rafe4.5","rafale 4th generation"};
		 String[] features= {"air to air strike","air to ground strike"};
		
		 J10C j10C;
		 j10C=new J10C(role,origin,varients,features);
		 
		 j10C.expose();
		 
	}
}
