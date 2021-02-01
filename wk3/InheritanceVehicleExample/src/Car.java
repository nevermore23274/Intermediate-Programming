public class Car extends Vehicle
{
	// attributes
	public int numberOfDoors;
	
	// constructor
	public Car(int registrationNumber, Person owner, int numDoors)
	{
		super(registrationNumber, owner);
		numberOfDoors = numDoors;
	}
	
	// methods , this won't work with "way 1" or "way 2" from TestVehicleSystem
	public void display()
	{
		super.display(); // call parents display method to print class information
		System.out.println("Type of vehicle: Car");
		System.out.println("Number of doors: " + numberOfDoors);
	}
}
