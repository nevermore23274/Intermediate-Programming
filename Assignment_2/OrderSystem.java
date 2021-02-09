/*  Files: OrderSystem.java, Gift.java, FruitBasket.java, SweetsBasket.java
 *  Author: Wilson, Tyler
 *  Class: CMIS 242
 *  Date: 02/8/2021
*/

// Imports
import java.util.Scanner;

public class OrderSystem
{
	public static void main(String[] args)
	{
		int uChoice; // Variable for users choice in the main menu
		int uInput = 0; // Variable for user input within the menu
		char iSize; // Variable for item size
		boolean includeIndicator; // Boolean variable for fruit indicator
		FruitBasket bFruit = new FruitBasket("FB3150");
		SweetsBasket bSweets = new SweetsBasket("SB3160");
		Scanner uScanner = new Scanner(System.in);
		
		do // Trapped "main menu" in a do loop to help with exit protocol
		{
			System.out.println("\n" + "\t" + "MENU");
			System.out.println("1: Order a Gift Basket");
			System.out.println("2: Change Gift Basket");
			System.out.println("3: Display Gift");
			System.out.println("9: Exit Program");
			
			System.out.print("Enter your selection: ");
			uChoice = uScanner.nextInt();
			
			switch (uChoice)
			{
			case 1:
                System.out.print("Do you want Fruit Basket (1) or Sweets Basket (2): ");
                uInput = uScanner.nextInt();
                
                if (uInput == 1)
                {
                    System.out.print("What size do you want: S, M, or L: ");
                    iSize = uScanner.next().charAt(0);
                    bFruit.Set_size(iSize);
                    bFruit.fruitNum();
                    bFruit.price();
                    System.out.print("Do you want citrus fruits included? true/false: ");
                    includeIndicator = uScanner.nextBoolean();
                    bFruit.citrusIndicator(includeIndicator);
                }

                if (uInput == 2)
                {
                    System.out.print("What size do you want: S, M, or L: ");
                    iSize = uScanner.next().charAt(0);
                    bSweets.Set_size(iSize);
                    bSweets.price();
                    System.out.println("Do you want nut Sweet included? true/false: ");
                    includeIndicator = uScanner.nextBoolean();
                    bSweets.nutsIndicator(includeIndicator);
                }
                continue;

            case 2:
                if (uInput == 1)
                {
                    System.out.print("Current gift size is: S What size do you want? S, M, or L: ");
                    iSize = uScanner.next().charAt(0);
                    bFruit.Set_size(iSize);
                    bFruit.fruitNum();
                    bFruit.price();
                    System.out.print("Current basket citrus=" + bFruit.getCitrusIndicator()
                            + " Do you want citrus fruits included? true/false: ");
                    includeIndicator = uScanner.nextBoolean();
                    bFruit.citrusIndicator(includeIndicator);
                }
                
                if (uInput == 2)
                {
                    System.out.print("What size do you want: S, M, or L: ");
                    iSize = uScanner.next().charAt(0);
                    bSweets.Set_size(iSize);
                    bSweets.price();
                    System.out.println("Do you want nut Sweet included? true/false: ");
                    includeIndicator = uScanner.nextBoolean();
                    bSweets.nutsIndicator(includeIndicator);

                }
                
                if (uInput == 0)
                {
                    System.out.print("\n" + "No gift has been ordered yet" + "\n");
                }

                continue;

            case 3:
                if (uInput == 1)
                {
                    bFruit.Display();
                }
                
                if (uInput == 2)
                {
                    bSweets.Display();

                }
                
                if (uInput == 0)
                {
                    System.out.print("\n" + "No gift has been ordered yet" + "\n");
                }
                continue;

            case 9:
                System.out.print("\n" + "Thank you for using the program. Goodbye!");
                uScanner.close();
                break;
                
            default:
            	System.err.println("Invalid option '" + uChoice + "' entered, please select valid input option.");
            	continue;

			}
		} while (uChoice != 9);
	}
}