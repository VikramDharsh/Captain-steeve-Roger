package com.xworkz;

public class Putin {
	// russian president
	 public String name="valdimir putin";  //literal
	 public byte age=70;
	 public String fatherName="spiridonovich";
	 public String motherName="maria";
	 public boolean gf=true;
	 
	 
	 public String[] hobbies;
	 public String[] children;      
	 public String[] awards; 
	                                   //ill initialize using constructor 
	 public String[] warsHeFaced;
	 public String[] publicimage;  
	 public String[] goal;
	 
	 
	 public Putin( String[] hobbies, String[] children, String[] awards,String[] warsHeFaced,  String[] publicimage, String[] goal)
	 {
		 
		 this.hobbies=hobbies;
		 this.children=children;
		 this.awards=awards;                 //  constructor
		 this.warsHeFaced=warsHeFaced;
		 this.publicimage=publicimage;
		 this.goal=goal;
	 }
	 
	 public  void display()
	 {
		 System.out.println("name :"+name);
		 System.out.println("father name :"+fatherName);
		 System.out.println("mother name  :"+motherName);
		 System.out.println("age  :"+age);
		 System.out.println("he has gf  :"+gf);
		 
		 for( int index=0;index<hobbies.length;index++)
		 {
			 String ref=hobbies[index];
			 System.out.println("hobbies :"+ref);
			 
		 }
		 
		 for( int index=0;index<children.length;index++)
		 {
			 String ref=children[index];
			 System.out.println("children :"+ref);
			 
		 }
		 for( int index=0;index<awards.length;index++)
		 {
			 String ref=awards[index];
			 System.out.println("awards :"+ref);                // with help of  methods we can reduce the number of lines
			 
		 }
		 for( int index=0;index<warsHeFaced.length;index++)
		 {
			 String ref=warsHeFaced[index];
			 System.out.println("wars he faced :"+ref);
			 
		 }
		 for( int index=0;index<publicimage.length;index++)
		 {
			 String ref=publicimage[index];
			 System.out.println("public image:"+ref);
			 
		 }
		 for( int index=0;index<goal.length;index++)
		 {
			 String ref=goal[index];
			 System.out.println("goal :"+ref);
			 
		 }
		 
	 }

}
