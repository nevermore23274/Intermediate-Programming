public class Vehicle
{
	// attributes
	public int registrationNumber;
	public Person owner;
	
	// constructors
	public Vehicle(int registrationNumber, Person owner)
	{
		this.registrationNumber = registrationNumber;
		this.owner = owner;
	}
	
	// methods
	public void transferOwnership(Person newOwner)
	{
		// code
	}
	
	// methods , this won't work with "way 1" or "way 2" from TestVehicleSystem
	public void display()
	{
		System.out.println("\nVehicle Data: ");
		System.out.println("Registration number: " + registrationNumber);
	}
}
