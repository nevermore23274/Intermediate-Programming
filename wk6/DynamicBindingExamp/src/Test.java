import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Mammal yourAnimal = null;
		int userSelection;
		
		System.out.print("Enter 1 for lion and 2 for dog: ");
		userSelection = scan.nextInt();
		
		if(userSelection == 1)
			yourAnimal = new Lion();
		else if(userSelection == 2)
			yourAnimal = new Dog();
		
		yourAnimal.speak(); // execute speak method
		
		if (yourAnimal instanceof Dog) // check what object was created, and if it's dog:
		{
			Dog dog = (Dog)yourAnimal; // cast animal to dog to call method
			dog.sit();
		}
		
		scan.close();
	}
}