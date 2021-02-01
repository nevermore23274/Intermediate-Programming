// Info for ship: https://starcitizen.tools/Prowler#Statistics

public class Prowler extends Ship
{
	// Attribute specific to this ship
	public int troopsAllowed;
	
	// Constructor
	public Prowler(int numEngines, int crewNum, int numberOfTroops)
	{
		super(numEngines, crewNum);
		troopsAllowed = numberOfTroops;
	}
	
	public void display()
	{
		System.out.println("Ship Name: Prowler");
		super.display();
		System.out.println("Type of Ship: Dropship");
		System.out.println("Max Number of Troops: " + troopsAllowed);
	}
}
