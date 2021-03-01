/*
* Files: TestMenu.java, Lyrics.java, MarinersRevenge/HearseSong/YouAreMine.java, MarinersRevenge/HearseSong/YouAreMine.txt
* Name: Wilson, Tyler
* Assignment: Week 6 Discussion Post
* Date: 21FEB2021
*/
// Imports
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMenu
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		
		Lyrics lyrics1;
		
		System.out.println("Please enter the lyrics you'd like to read:");
		System.out.println("1.) You Are Mine - S3RL");
		System.out.println("2.) The Hearse Song - Rusty Cage");
		System.out.println("3.) The Mariner's Song - The Decemberists");
		System.out.print("> ");
		
		int userChoice = in.nextInt();
		
		switch(userChoice)
		{
			case 1:
				lyrics1 = new YouAreMine("", 0, 0, 0, 0, null);
				lyrics1.readLyrics();
				lyrics1.displayCounts();
				in.close();
				break;
				
			case 2:
				lyrics1 = new HearseSong("", 0, 0, 0, 0, null);
				lyrics1.readLyrics();
				lyrics1.displayCounts();
				in.close();
				break;
			
			case 3:
				lyrics1 = new MarinersRevenge("", 0, 0, 0, 0, null);
				lyrics1.readLyrics();
				lyrics1.displayCounts();
				in.close();
				break;
		}
	}
}