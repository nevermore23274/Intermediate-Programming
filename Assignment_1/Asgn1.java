/*  Files: BookInventoryMain.java
 *  Author: Wilson, Tyler
 *  Class: CMIS 242
 *  Date: 01/18/2021
*/
// Imports
import java.util.*;

public class Asgn1
{
	public static void main(String[] args)
	{
		Scanner uInput = new Scanner(System.in);
		HashMap<Integer, Book> ar1 = new HashMap<Integer, Book>(); // Create hashmap
		int uChoice; 
		
		do // Loop to make input easier for user exit
		{
			// User input, "main menu"
			System.out.println("\nAuthor: Wilson, Tyler\n" + "CMIS 242 - 6382\n" + "Date: 01/18/2021"); // Later use system time instead
			System.out.println("\n   MENU\n1: Add book\n2: Remove book\n3: Find book\n4: Display all books\n9: Exit program\n");
			System.out.print("Enter your selection: ");
			uChoice = uInput.nextInt();
			
			switch(uChoice)
			{
				case 1: System.out.print("Book ID = ");
						int id = uInput.nextInt(); // Add the book to the inventory
						uInput.nextLine();
						System.out.print("What is book title? ");
						String title = uInput.nextLine();
						System.out.print("Book price (double value)? ");
						double price = uInput.nextDouble();
				
						Book b = new Book(id,title,price); // Call book constructor
				
						ar1.put(id,b); // Add book to hashmap
						break;
				
				case 2: if(ar1.size() == 0)
						{
							System.out.println("The inventory has no books to remove.");
						}
						else
						{
							Iterator<Map.Entry<Integer, Book>> it = ar1.entrySet().iterator(); // Using Iterator to iterate over hashmap
							int found = 0;
							
							System.out.print("Enter the book ID you want to remove: ");
							int Bid = uInput.nextInt();
					
							// Check for ID
							while(it.hasNext())
							{
								Map.Entry<Integer,Book> b1 = it.next();
								int key = b1.getKey();
						
								// Remove ID if available
								if(key == Bid)
								{
									found = 1;
									ar1.remove(key);
									System.out.println("Book is now removed from the inventory.");
									break;
								}
							}
							
							if(found == 0) // If ID isn't found, give error message.
							{
								System.out.println("There is no book with the given ID.");
							}
						}
				
						break;
				
				case 3: if(ar1.size() == 0)
						{
							System.out.println("The inventory has no books.");
						}
						else
						{
							Iterator<Map.Entry<Integer, Book>> it = ar1.entrySet().iterator();
							int found = 0;
					
							System.out.print("Enter the book ID you want to search: ");
							int Bid = uInput.nextInt();
					
							while(it.hasNext())
							{
								Map.Entry<Integer,Book> B2 = it.next();
								int key = B2.getKey();
						
								// Display ID if available
								if(key == Bid)
								{
									found = 1;
									Book b2 = B2.getValue();
									System.out.println("\nBook ID: "+b2.id+"\nBook title: "+b2.title+"\nBook price: "+b2.price);
									break;
								}
							}
					
							// Error catch for no ID
							if(found == 0)
							{
								System.out.println("There is no book with given ID, please enter a valid ID number.");
							}
						}
				
						break;
				
				case 4: if(ar1.size() == 0)
						{
							System.out.println("There are currently no books in inventory.");
						}
						else
						{
							Iterator<Map.Entry<Integer, Book>> it = ar1.entrySet().iterator();
					
							System.out.println("Inventory List: ");
					
							// Display all given books
							while(it.hasNext())
							{
								Map.Entry<Integer,Book> B3 = it.next();
						
								Book b3 = B3.getValue();
						
								System.out.println("\nBook ID: "+b3.id+"\nBook title: "+b3.title+"\nBook price: "+b3.price);
							}
						}
				
						break;
				
				case 9: System.out.println("\nThank you for using the program. Goodbye!\n");
						uInput.close();
						break;
			}
		} while(uChoice!=9);
	}
}

class Book
{
	int id;
	String title;
	double price;
	
	Book(int id, String title, double price)
	{
		this.id = id;
		this.title = title;
		this.price = price;
	}
}
