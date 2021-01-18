/*  File: RentalStoreMain.java and TimeClock.java
 *  Author: Tyler Wilson
 *  Course: CMIS 242
 *  Purpose: Implement simple class, fixing original post based on teachers input
 */
import java.util.Scanner;

public class RentalStoreMain
{	
	public static void main(String[] args)
	{
		Scanner menuOption = new Scanner(System.in);
		boolean menuLoop = true;
		
		System.out.println("\n" + "Please enter the module you'd like to use: " + "\n");
		System.out.println("1.) Store Timeclock");
		
		while(menuLoop = true)
		{
			System.out.print("\nOption: ");
			int userInput = menuOption.nextInt();
			
			switch(userInput)
			{
				case 1: RentalStoreClock();
						break;
						
				default: System.err.println("Invalid Input.");
			}
		}
	}
	
	static void RentalStoreClock() 
	{
		TimeClock RentalStore1 = new TimeClock();
		TimeClock RentalStore2 = new TimeClock("Comics and Stuff", true);
		
		System.out.println("\n" + "Welcome to the Store Timeclock Module" + "\n");
		System.out.println("Store #001: " + RentalStore1.toString());
		System.out.println("Store #002: " + RentalStore2.toString());
		System.exit(0);
	}
}