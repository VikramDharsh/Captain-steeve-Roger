package com.xworkz.constructor121;
import com.xworkz.constructor121.Song;
public class SongRunner {
	
	public static void main(String[] vikram)

	{
	Song ref=new Song();
	
	ref.lang="telugu";
	ref.lyricist="santhosh sooraj";
	ref.name="o sayanara sayanara selavntu nee chelimik";
	ref.singer="M M maanasi";
	ref.type="melody";
	
	System.out.println("name :"+ref.name);
	System.out.println("lang  :"+ref.lang);
	System.out.println("lyricist :"+ref.lyricist);
	System.out.println("singer  :"+ref.singer);
	System.out.println("type :"+ref.type);

	}

}
