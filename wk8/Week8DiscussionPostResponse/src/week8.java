/*
* Files: week8.java
* Name: Davis, Nicholas
* Assignment: Week 8 Discussion Post
* Date: 09MAR2021
*/
// Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter; // Added by Tyler
import java.io.IOException; // Added by Tyler
import java.util.Scanner;

public class week8
{
	public static void main(String[] args)
	{
		// Declare variables
		int [][] array = new int [5][5];
		int i = 0;
		int	ii = 0;
		int iCounter = 0;  // Added by Tyler
		Scanner sc = null;
		
		try
		{
			sc = new Scanner(new File("/home/nevermore23274/Documents/cmis_242/wk8/Week8DiscussionPostResponse/src/test.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("An error has occured."); // Added by Tyler
			e.printStackTrace();
		}
					
		while(sc.hasNext())
		{
			array[i/5][i%5] = sc.nextInt();
			i = i + 1;
		}
		
		for (i = 0;i < 5;i++)
		{
			for (ii = 0;ii < 5;ii++)
			{
				System.out.print(array[i][ii] + " ");
				iCounter++;  // Added by Tyler
				System.out.println();
			}
			
			System.out.print("Your program has had " + iCounter + " iterations" + "\n");  // Added by Tyler
		}
		
		// Added by Tyler
		try
		{
			FileWriter myWriter = new FileWriter("/home/nevermore23274/Documents/cmis_242/wk8/Week8DiscussionPostResponse/src/test2.txt");
			myWriter.write("You had " + iCounter + " iterations overall.");
			myWriter.close();
		}
		catch(IOException fileNotMade)
		{
			fileNotMade.printStackTrace();
		}
	}
}