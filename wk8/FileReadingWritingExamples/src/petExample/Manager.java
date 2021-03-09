package petExample;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager
{
	// Attribute
	private ArrayList<Pet> pets;
	
	// Default constructor
	public Manager()
	{
		// Initialize empty pets list
		pets = new ArrayList<Pet>();
	}
	
	// Load all pet files from directory; Assumes file name convention starts with pet type Dog or Snake followed by id
	// If directory is not found, it will throw exception
	public Manager(String directory) throws FileNotFoundException
	{
		// Initialize empty pets list
		pets = new ArrayList<Pet>();
		
		// Create a file object for directory
		File directoryPath = new File(directory);
		
		// Get list of all files and directories
		File fileslist[] = directoryPath.listFiles();
		
		if(fileslist == null)
			throw new FileNotFoundException("Could not load, no such directory.");
		
		// Declare local variables
		Pet pet = null;
		String line = null;
		Scanner scan = null;
		
		// Process each Pet file
		for(File file : fileslist)
		{
			// Parse files whose filename starts with "Dog" or "Snake"
			if(file.getName().contains("Dog") || file.getName().contains("Snake"))
			{
				// Open and read line (assumes whole object is stored on single line)
				scan = new Scanner(file);
				line = scan.nextLine(); // Assumes the file isn't empty
				
				// If Dog object than call dog constructor
				if(file.getName().contains("Dog"))
					pet = new Dog(line);
				
				// If Snake object than call snake constructor
				if(file.getName().contains("Snake"))
					pet = new Snake(line);
				
				// Add Pet object to pets attribute
				pets.add(pet);
			}
		}
	}
	
	// Creates (or overwrites) a file for each Pet object in pets attribute in given directory
	public void createPetFiles(String directory) throws IOException
	{
		PrintWriter out = null;
		
		// For all Pet objects create files using Pet type and id value as filename
		for(int i = 0; i < pets.size(); i++)
		{
			String filename = directory + "/" + pets.get(i).getClass().getSimpleName() + "-" + pets.get(i).getID() + ".txt";
			out = new PrintWriter(new FileWriter(filename)); // Create/overwrite file
			out.println(pets.get(i).toString()); // Write the pet's data
			out.flush(); // Flush all data to the file
			out.close(); // Close stream
		}
	}
	
	// Display all stored pets on console
	public void displayAllPets()
	{
		// For all pet objects display the xml tag data
		for(int i = 0; i < pets.size(); i++)
		{
			System.out.println(pets.get(i).toString());
		}
	}
	
	// Add Pet object
	public void addPet(Pet pet)
	{
		pets.add(pet);
	}
}