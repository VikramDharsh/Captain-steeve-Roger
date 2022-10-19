package com.xworkz.learningConstructor;

public class F16Runner {

	public static void main(String[] args) {
		 String[] role= {"multirole ","air supirior","missile carrier"};
		 String[] origin= {"usa","NATO air force"};
		 String[] varients={"F35","F22","4th gen aircraft"};
		 String[] features= {"air to air strike","air to ground strike"};
		
		 F16 f16;
		 f16=new F16(role,origin,varients,features);
		 
		 f16.expose();
		 
	}

}
