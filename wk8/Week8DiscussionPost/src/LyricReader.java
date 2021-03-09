/*
* Files: LyricReader.java
* Name: Wilson, Tyler
* Assignment: Week 8 Discussion Post
* Date: 07MAR2021
*/
// Imports
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.FileReader;

public class LyricReader
{
	public static void main(String[] args) throws Exception
	{
		// Variables
		int lCounter = 0;
		Scanner sc = new Scanner(new BufferedReader(new FileReader("/home/nevermore23274/Documents/cmis_242/wk8/Week8DiscussionPost/src/MarinersRevenge.txt")));
		int rows = 127;
		int cols = 1;
		String[][] songData = new String[rows][cols];
		
		while(sc.hasNextLine())
		{
			for(int i=0; i < songData.length; i++)
			{
				String[] line = sc.nextLine().split("\n");
				for(int j=0; j<line.length; j++)
				{
					songData[i][j] = String.format(line[j] + "\n");
					lCounter++;
				}
			}
		}

		System.out.println(Arrays.deepToString(songData).replace("[", "").replace("]", "").replace(",", "")); // I hate this. This is a sin, truly terrible.
		System.out.println("The Mariner's Revenge Song has " + lCounter + " lines of lyrics.");
	}
}