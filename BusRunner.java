package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		
	 Bus anakonda=new Bus();
	 System.out.println("bus number  :"+anakonda.num);
	 
	 anakonda.num=5654;
	 System.out.println("bus number  :"+anakonda.num);
	 
	 anakonda.startPlace="kolar"; 
	 anakonda.destination="chinthamani";
	 
	 System.out.println("starting place  :"+anakonda.startPlace);
	 
	 System.out.println("destination :"+anakonda.destination);
	 
	 

	}

}
