package com.xworkz.learningConstructor;

public class RonaldoRunner {

	public static void main(String[] args) {
		
			String[] hobbies= {"music","chess"};
			 String[] children= {"eva maria","matio"};
			 String[] awards= {"FIFA ballonder","UEFA beast player award......."}; 
			 String[] clubsHePlayed= {"portugal national team"};
			 String[] publicimage= {"inspiration"};
			 String[] goal= {"just chill and enjoying life "};
			 
			 Ronaldo ronaldo= new  Ronaldo(hobbies,children,awards,clubsHePlayed,publicimage,goal);
			
			 ronaldo.display();


	}

}
