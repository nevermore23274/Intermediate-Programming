/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, IllegalTroopsAllowedArgumentExceptions.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 7 Discussion Post
*/

public class Ship
{
	// Default ship attributes
	private int numEngines;
	
	// Overloaded sum(). This sum takes two int parameters 
    public int shipConfig(int crewNum, int numPassagers)
    { 
        return (crewNum + numPassagers); 
    } 

	// Display method
	public void display()
	{
		System.out.println("Number of Engines: " + numEngines);
	}
}