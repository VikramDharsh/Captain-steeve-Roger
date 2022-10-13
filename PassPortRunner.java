package com.xworkz.constructor121;
import  com.xworkz.constructor121.*;
public class PassPortRunner {


			public static void main(String[] args) {

				PassPort passport = new PassPort();
				System.out.println(passport.country = "India");
				System.out.println(passport.issuedDate = 0);
				System.out.println(passport.name = null);
				System.out.println(passport.no = 0);
				System.out.println(passport.noOfLeaves = 30);
				System.out.println("----------------------passport no--------------------------------------");
				PassPort passPort1 = new PassPort(23145637);
				System.out.println(passport.country);
				System.out.println(passport.issuedDate);
				System.out.println(passport.name );
				System.out.println(passport.no );
				System.out.println(passport.noOfLeaves );

				System.out.println("----------------------name--------------------------------------");
				PassPort passpoart3 = new PassPort("dharshan");
				System.out.println(passport.country);
				System.out.println(passport.issuedDate);
				System.out.println(passport.name );
				System.out.println(passport.no );
				System.out.println(passport.noOfLeaves );

				
				System.out.println("----------------------experiy date--------------------------------------");
				PassPort passPort2 = new PassPort(21);
				System.out.println(passport.country);
				System.out.println(passport.issuedDate);
				System.out.println(passport.name );
				System.out.println(passport.no );
				System.out.println(passport.noOfLeaves );

				System.out.println("----------------------no of leaves --------------------------------------");
				PassPort passPort4 = new PassPort(10);
				System.out.println(passport.country);
				System.out.println(passport.issuedDate);
				System.out.println(passport.name );
				System.out.println(passport.no );
				System.out.println(passport.noOfLeaves );

				System.out.println("----------------------name issueddate--------------------------------------");
				PassPort passPort5 = new PassPort("hari", 24);
				System.out.println(passport.country);
				System.out.println(passport.issuedDate);
				System.out.println(passport.name );
				System.out.println(passport.no );
				System.out.println(passport.noOfLeaves );

				System.out.println("----------------------country name--------------------------------------");
				PassPort passPort6 = new PassPort("india", "satish");
				System.out.println(passport.country);
				System.out.println(passport.issuedDate);
				System.out.println(passport.name );
				System.out.println(passport.no );
				System.out.println(passport.noOfLeaves );

	}

}
