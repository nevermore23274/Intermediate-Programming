public class TestVehicleSystem
{
	/* This way is a bit better, because it doesn't need to know about any of the internals for the classes, it just has to
	 * call the display() method that each class has.
	 */
	public static void main(String[] args)
	{
		Car myCar = new Car(1234, new Person(), 4);
		myCar.display();
		
		Truck myTruck = new Truck(1235, new Person("John"), 6);
		myTruck.display();
		
		Motorcycle myMotorcycle = new Motorcycle(1236, new Person("Eddy"), true);
		myMotorcycle.display();
	}
	/*
	public static void display(Vehicle myVehicle)
	{
		One way of passing class instance as parent data type:
		
		// cast myVehicle to car to access unique attributes of Car
		if (myVehicle instanceof Car)
		{
			System.out.println(((Car)myVehicle).numberOfDoors + " " + myVehicle.registrationNumber + " " + myVehicle.owner.name);
		}
		
		if (myVehicle instanceof Truck)
		{
			System.out.println(((Truck)myVehicle).numberOfAxles + " " + myVehicle.registrationNumber + " " + myVehicle.owner.name);
		}
		
		if (myVehicle instanceof Motorcycle)
		{
			System.out.println(((Motorcycle)myVehicle).hasSidecar + " " + myVehicle.registrationNumber + " " + myVehicle.owner.name);
		}
		
		
		------------------------------------------------------------------------------------------------------
		
		Second way:
		
		System.out.println("\nVehicle Data: ");
		System.out.println("Registration number: " + myVehicle.registrationNumber);
		
		if (myVehicle instanceof Car)
		{
			System.out.println("Type of vehicle: Car");
			Car c;
			c = (Car)myVehicle; // Type-cast to get access to numberOfDoors
			System.out.println("Number of Doors: " + c.numberOfDoors);
		}
		
		else if (myVehicle instanceof Truck)
		{
			System.out.println("Type of vehicle: Truck");
			Truck t;
			t = (Truck)myVehicle; // Type-cast to get access to numberOfAxles
			System.out.println("Number of axles: " + t.numberOfAxles);
		}
		
		else if (myVehicle instanceof Motorcycle)
		{
			System.out.println("Type of vehicle: Motorcycle");
			Motorcycle m;
			m = (Motorcycle)myVehicle; // Type-cast to get access to hasSidecar
			System.out.println("Has a sidecar: " + m.hasSidecar);
		}
	}
	
	public static void main(String[] args)
	{
		// create instance of child subclass being treated as parent class
		Car myCar = new Car(1234, new Person(), 4); // registration num, default person, num of doors
		display(myCar); // pass instance of Car to display method with datatype Vehicle
		
		Truck myTruck = new Truck(1235, new Person("John"), 6);
		display(myTruck);
	}
	*/
}

/* For object types, when the computer executes a program, it checks whether type-casts are valid. So, for example, if
 * myVehicle refers to an object of type Truck, then the type cast (Car)myVehicle would be an error. When this happens, an
 * exception of type ClassCastException is thrown. This check is done at run time, not compile time, because the actual type
 * of the object referred to by myVehicle is not known when the program is compiled.
 */