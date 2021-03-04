/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, IllegalTroopsAllowedArgumentExceptions.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 7 Discussion Post
*/

public class Prowler extends Ship
{
	// Attribute specific to this ship
	private int troopsAllowed;
	private boolean hasMissiles;

	// Constructor
	public Prowler(int numEngines, int crewNum, int troopsAllowed, boolean hasMissiles)
	{
		if (troopsAllowed <= 0)
			throw new IllegalTroopsAllowedArgumentExceptions(troopsAllowed);
		
		this.troopsAllowed = troopsAllowed;
		this.hasMissiles = hasMissiles;
	}
	
	// Setters
	public void setMissiles (boolean hasMissiles)
	{
		this.hasMissiles = hasMissiles;
	}
	
	public void setTroopsAllowed(int troopsAllowed)
	{
		this.troopsAllowed = troopsAllowed;
	}
	
	// Getters
	public boolean getMissiles()
	{
		return hasMissiles;
	}
	
	public int getTroopsAllowed()
	{
		return troopsAllowed;
	}

	@Override
	public void display()
	{
		Ship x = new Ship();
		System.out.println("Ship Name: Prowler");
		System.out.println("Type of Ship: Dropship");
		super.display();
		System.out.println("Number of Ground Troops: " + getTroopsAllowed());
		System.out.println("Weapon Systems: " + hasMissiles);
		System.out.println("Total on board: " + x.shipConfig(2, getTroopsAllowed())); // Pilot and copilot (required) added to troops for total
		
	}
}