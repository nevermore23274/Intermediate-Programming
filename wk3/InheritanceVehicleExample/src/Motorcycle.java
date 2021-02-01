public class Motorcycle extends Vehicle
{
	// attributes
	public boolean hasSidecar;
	
	// constructor
	public Motorcycle(int registrationNumber, Person owner, boolean sidecar)
	{
		super(registrationNumber, owner);
		hasSidecar = sidecar;
	}
	
	// methods , this won't work with "way 1" or "way 2" from TestVehicleSystem
	public void display()
	{
		super.display(); // call parents display method to print class information
		System.out.println("Type of vehicle: Motorcycle");
		System.out.println("Has sidecar: " + hasSidecar);
	}
}
