/* Files: MediaRentalSystem.java, Media.java, EBook.java, Manager.java, MovieDVD.java, MusicCD.java, media.txt
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Final Project
*/

// Import(s)
import java.util.Scanner;

public class MediaRentalSystem
{
	public static void main(String[] args)
	{
		Scanner uInput = new Scanner(System.in);
		
		while (Menu()) // While loop to make menu transition smoother
		{
			int uChoice = 0;
			Manager m = new Manager();
			
			System.out.print("Enter your selection : ");
			uChoice = uInput.nextInt();
			
			switch (uChoice)
			{
				case 1:
					// Location /home/nevermore23274/Documents/cmis_242/media/media.txt
					System.out.print("Enter path (directory) where to load from: ");
					String path = uInput.next();
					m.LoadMedia(path);
					break;

				case 2:
					System.out.print("Enter the title: ");
					String title = uInput.next();
					m.findMedia(title);
					break;

				case 3:
					System.out.print("Enter media id :");
					int id = uInput.nextInt();
					m.rentMedia(id);
					break;

				case 9:
					System.out.println("\n" + "Thank you for using the program. Goodbye!");
					System.exit(0);
					break;

				default:
					System.out.println("\n" + uChoice + " is invalid input, please try again.\n");
					break;
			}
		}
		uInput.close(); // Closes scanner
	}

	private static boolean Menu()
	{
		System.out.println("\n" + "   " + "Welcome to Media Rental System");
		System.out.println("1: Load Media objects...");
		System.out.println("2: Find Media objects...");
		System.out.println("3: Rent Media objects...");
		System.out.println("9: Quit" + "\n");
		return true;
	}
}
