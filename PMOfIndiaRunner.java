package com.xworkz.learningConstructor;

import com.xworkz.*;

public class PMOfIndiaRunner {

	public static void main(String[] args) {

		String[] hobbies= {"playing with missile","yoga","throing bombs on POK"};
		 String[] children= {"no childrens officially .. "};
		 String[] awards= {"doctarate","civilion"}; 
		 String[] warsHeFaced= {"uri surgical strike","air strike pulvaama"};
		 String[] publicimage= {"Ruler","dictator"};
		 String[] goal= {"destroy Pok","make in india","playing with imran khan and raahul gandhi"};
		 
		 PMOfIndia pMOfIndia= new PMOfIndia(hobbies,children,awards,warsHeFaced,publicimage,goal);
		
		 pMOfIndia.display();
		

	}

}
