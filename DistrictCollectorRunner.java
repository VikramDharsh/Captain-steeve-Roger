package com.xworkz.learningConstructor;
import  com.xworkz.learningConstructor.*;

public class DistrictCollectorRunner {
	

	public static void main(String[] args) {
		System.out.println("start");
		// TODO Auto-generated method stub
		 DistrictCollector dc=	new  DistrictCollector (); 
		 
		 System.out.println("entered ");
		 
		 System.out.println(" dk ravi sir details");
		 dc.name="late DK RAVI sir";
		 dc.batchNo=2009;
		 dc.age=34;
		 dc.district="kolar";
		 
		 
		 System.out.println("name :"+dc.name);
		 System.out.println("age :"+dc.age);
		 System.out.println("district  :"+dc.district);
		 System.out.println("batch no  :"+dc.batchNo);
		 
		 System.out.println("***********************");
		 
		 System.out.println("updating details");
		 
		 dc.name="venkat raj";
		 dc.batchNo=2013;
		 dc.age=44;
		 dc.district="kolar";
		 
		 System.out.println("name :"+dc.name);
		 System.out.println("age :"+dc.age);
		 System.out.println("district  :"+dc.district);
		 System.out.println("batch no  :"+dc.batchNo);
		 
		 
		 System.out.println("end");
		
		

	}

}
