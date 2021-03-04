/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, IllegalTroopsAllowedArgumentExceptions.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 7 Discussion Post
*/

// Imports
import java.util.Scanner;

public class SpaceBoatClassification
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int troopsAllowed = 0;
		boolean inputCatch = true;
		
		while(inputCatch)
		{
			System.out.println("How many ground troops will your Prowler Dropship hold? ");
			troopsAllowed = userInput.nextInt();
			
			try
			{
				Prowler s1 = new Prowler(2, 2, troopsAllowed, true);
				System.out.println(); // Put a line between user input and the output
				s1.display();
				userInput.close();
				inputCatch = false;
			} catch (IllegalTroopsAllowedArgumentExceptions e)
			{
				System.out.println("Invalid troop count for dropships: " + e.toString() + " (no decimal, zero, or string values)" + "\n");
			}
		}
	}
}