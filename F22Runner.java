package com.xworkz.learningConstructor;

public class F22Runner {


	public static void main(String[] args) {
		 String[] role= {"multirole ","air supirior","missile carrier"};
		 String[] origin= {"usa","NATO air force"};
		 String[] varients={"F35","F16"};
		 String[] features= {"air to air strike","air to ground strike"};
		
		 F22 f22;
		 f22=new F22(role,origin,varients,features);
		 
		 f22.expose();
		 
	}

}
