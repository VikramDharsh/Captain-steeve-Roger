package com.xworkz.learningConstructor;

import com.xworkz.learningConstructor.*;

public class BobMarleyRunner {

	public static void main(String[] args) {
		String[] hobbies= {"smoking","Drinking"};
		 String[] children= {"rohan ","julan","cedella","stephen"};
		 String[] awards= {"order of merit","peace medal of third world"}; 
		 String[] songsHeWritten= {"sun is shining","could you be loved"};
		 String[] publicimage= {"cultural icon"};
		 String[] goal= {"no goal only enjoying life "};
		 
		 BobMarley bobMarley= new BobMarley(hobbies,children,awards,songsHeWritten,publicimage,goal);
		
		 bobMarley.display();

	}

}
