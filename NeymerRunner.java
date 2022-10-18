package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.*;
public class NeymerRunner {

	public static void main(String[] args) {
		String[] hobbies= {"music","chess"};
		 String[] children= {"no childrens "};
		 String[] awards= {"FIFA ballonder","UEFA beast player award......."}; 
		 String[] clubsHePlayed= {"paris team","barcelona Fc"};
		 String[] publicimage= {"play boy"};
		 String[] goal= {"just chill and enjoying life "};
		 
		 Neymer  neymer= new  Neymer(hobbies,children,awards,clubsHePlayed,publicimage,goal);
		
		 neymer.display();

	}

}
