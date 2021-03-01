/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, Origin325A.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 5 Discussion Post
 * Purpose: Show usage of Overloading and Overriding
*/

public class Prowler extends Ship
{
	// Attribute specific to this ship
	private int troopsAllowed;
	private boolean hasMissiles;

	// Constructor
	public Prowler(int numEngines, int crewNum, int numberOfTroops, boolean hasMissiles)
	{
		super();
		troopsAllowed = numberOfTroops;
		this.hasMissiles = hasMissiles;
	}
	
	// Setter
	public void setMissiles (boolean hasMissiles)
	{
		this.hasMissiles = hasMissiles;
	}
	
	// Getter
	public boolean getMissiles()
	{
		return hasMissiles;
	}

	@Override
	public void display()
	{
		Ship x = new Ship();
		System.out.println("Ship Name: Prowler");
		System.out.println("Type of Ship: Dropship");
		super.display();
		System.out.println("Max Number of Troops: " + troopsAllowed);
		System.out.println("Weapon Systems: " + hasMissiles);
		System.out.println("Total on board: " + x.Ship(2,8));
		
	}
}