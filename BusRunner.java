package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		 System.out.println("entered ");
		 
		 
	 Bus anakondaTravels=new Bus();
	 System.out.println("bus number  :"+anakondaTravels.num);
	 
	 anakondaTravels.num=5654;
	 System.out.println("bus number  :"+anakondaTravels.num);
	 
	 anakondaTravels.startPlace="kolar"; 
	 anakondaTravels.destination="chinthamani";
	 
	 System.out.println("starting place  :"+anakondaTravels.startPlace);
	 
	 System.out.println("destination :"+anakondaTravels.destination);
	 
	 
	 System.out.println("**************************");
	 System.out.println("updated bus details");
	 
	 anakondaTravels.num=5840;
	 anakondaTravels.startPlace="banglore";
	 anakondaTravels.destination="kolar";
	 
	 
	 System.out.println("bus number  :"+anakondaTravels.num);
	 System.out.println("start place  :"+anakondaTravels.startPlace);
	 System.out.println("destination :"+anakondaTravels.destination);

	}

}
