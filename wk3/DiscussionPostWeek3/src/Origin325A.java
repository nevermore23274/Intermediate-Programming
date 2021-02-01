// Info for ship: https://starcitizen.tools/325a#Avionics_.26_Systems

public class Origin325A extends Ship
{
	// Attribute specific to this ship
	public int numBed;
	
	// Constructor
	public Origin325A(int numEngines, int crewNum, int numberOfBeds)
	{
		super(numEngines, crewNum);
		numBed = numberOfBeds;
	}
	
	public void display()
	{
		System.out.println("Ship Name: Origin325A");
		super.display();
		System.out.println("Type of Ship: Interdiction");
		System.out.println("Max Number of Beds: " + numBed);
	}
}