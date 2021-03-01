/*
* Files: TestMenu.java, Lyrics.java, MarinersRevenge/HearseSong/YouAreMine.java, MarinersRevenge/HearseSong/YouAreMine.txt
* Name: Wilson, Tyler
* Assignment: Week 6 Discussion Post
* Date: 21FEB2021
*/
// Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MarinersRevenge extends Lyrics
{
	public MarinersRevenge(String fContent, int lCounter, int vCounter, int cCounter, int arrCharCount, char[] charArr)
	{
		super(fContent, lCounter, vCounter, cCounter, arrCharCount, charArr);
	}

	@Override
	public void readLyrics() throws FileNotFoundException
	{
		File sLyrics = new File("MarinersRevenge.txt"); // If you're using and IDE, will have to change this to exact file location
		Scanner reader = new Scanner(sLyrics);
		
		while(reader.hasNext())
		{
			this.fContent += reader.nextLine() + "\n";
			this.lCounter++;
		}
		
		reader.close();

		char[] charArr = fContent.toCharArray();
		
		for(char c : charArr)
		{
			if(Character.isLetter(c))
			{
				arrCharCount++;
			}
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') // Vowel check
			{
			    vCounter++; // Increment vowel counter
			}
			
			// Y is "sometimes" a consonant, but I'm not dealing with that for a discussion post. So, it's only a vowel here [Consonant check]
			else if (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || 
			    c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' ||
                c == 't' || c == 'v' || c == 'w' || c == 'x' || c == 'z')
			{
			    cCounter++; // Increment consonant counter
			}
		}
		
		System.out.println(this.fContent);
	}
	
	@Override
	public void displayCounts()
	{
		System.out.println("The Mariner's Revenge Song has " + this.lCounter + " lines of lyrics.");
		System.out.println("The Mariner's Revenge Song has " + this.vCounter + " of vowels.");
		System.out.println("The Mariner's Revenge Song has " + this.cCounter + " of consonant(s).");
		System.out.println("The Mariner's Revenge Song has " + this.arrCharCount + " characters.");
	}
}