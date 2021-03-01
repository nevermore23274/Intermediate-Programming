/*
* Files: TestMenu.java, Lyrics.java, MarinersRevenge/HearseSong/YouAreMine.java, MarinersRevenge/HearseSong/YouAreMine.txt
* Name: Wilson, Tyler
* Assignment: Week 6 Discussion Post
* Date: 21FEB2021
*/
// Imports
import java.io.FileNotFoundException;

public class Lyrics
{
	public String fContent = "";
	public int lCounter = 0;
	public int vCounter = 0;
	public int cCounter = 0;
	public char[] charArr;
	public int arrCharCount = 0;
	
	public Lyrics(String fContent, int lCounter, int vCounter, int cCounter, int arrCharCount, char[] charArr)
	{
		this.fContent = fContent;
		this.lCounter = lCounter;
		this.vCounter = vCounter;
		this.cCounter = cCounter;
		this.arrCharCount = arrCharCount;
		this.charArr = charArr;
	}
	
	public void readLyrics() throws FileNotFoundException
	{
		System.out.println("If it works, nobody will see this");
	}
	
	public void displayCounts()
	{
		System.out.println("Nothing to see here");
	}
}