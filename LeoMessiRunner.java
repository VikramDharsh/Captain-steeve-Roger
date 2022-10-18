package com.xworkz.learningConstructor;

import com.xworkz.learningConstructor.*;
public class LeoMessiRunner {

	public static void main(String[] args) {
		String[] hobbies= {"music","chess"};
		 String[] children= {"tiago","matio","ciro"};
		 String[] awards= {"FIFA ballonder","UEFA beast player award......."}; 
		 String[] clubsHePlayed= {"FC barcelona","paris saint...."};
		 String[] publicimage= {"inspiration"};
		 String[] goal= {"just chill and enjoying life "};
		 
		 LeoMessi leoMessi= new  LeoMessi(hobbies,children,awards,clubsHePlayed,publicimage,goal);
		
		 leoMessi.display();


	}

}
