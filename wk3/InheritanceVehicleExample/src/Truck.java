public class Truck extends Vehicle
{
	// attributes
	public int numberOfAxles;
	
	// constructor
	public Truck(int registrationNumber, Person owner, int numAxles)
	{
		super(registrationNumber, owner);
		this.numberOfAxles = numAxles;
	}
	
	// methods , this won't work with "way 1" or "way 2" from TestVehicleSystem
	public void display()
	{
		super.display(); // call parents display method to print class information
		System.out.println("Type of vehicle: Truck");
		System.out.println("Number of doors: " + numberOfAxles);
	}
}
