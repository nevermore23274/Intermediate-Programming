/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, Origin325A.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 5 Discussion Post
 * Purpose: Show usage of Overloading and Overriding
*/

public class Origin325A extends Ship
{
	// Attribute specific to this ship
	private int afterBurn;

	// Constructor
	public Origin325A(int numEngines, int crewNum, int numberAfterBurn)
	{
		super();
		afterBurn = numberAfterBurn;
	}
	
	// Setter
	public void afterBurn(int afterBurn)
	{
		this.afterBurn = afterBurn;
	}

	public void display()
	{
		Ship x = new Ship();
		System.out.println("Ship Name: Origin325A");
		System.out.println("Type of Ship: Interdiction");
		super.display();
		System.out.println("Number of Afterburners: " + afterBurn);
		System.out.println("Total on board: " + x.Ship(2.0,0.0));
	}
}