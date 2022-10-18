package com.xworkz.learningConstructor;

import com.xworkz.Putin;

public class PutinRunner {

	public static void main(String[] args) {
		
		
		String[] hobbies= {"playing with missile","throwing bombs on ukrain","building ISS"};
		 String[] children= {"katerina ","maria"};
		 String[] awards= {"doctarate","civilion"}; 
		 String[] warsHeFaced= {"Russo-geroguan war","russo-ukrain war"};
		 String[] publicimage= {"Ruler","dictator"};
		 String[] goal= {"destroying USA","Building ISS"};
		 
		Putin putin= new Putin(hobbies,children,awards,warsHeFaced,publicimage,goal);
		
		putin.display();
		
		
		 
	}

}
