/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, Origin325A.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 5 Discussion Post
 * Purpose: Show usage of Overloading and Overriding
*/

public class Ship
{
	// Default ship attributes
	private int numEngines;
	//private boolean lifeSupport;
	//private int crewNum;
	//private int numPassagers;
	
	// Overloaded sum(). This sum takes two int parameters 
    public int Ship(int crewNum, int numPassagers) 
    { 
        return (crewNum + numPassagers); 
    } 
  
    // Overloaded sum(). This sum takes three int parameters 
    public int Ship(int crewNum, int numPassagers, int gravityGenerators) 
    { 
    	return (crewNum + numPassagers + gravityGenerators); 
    } 
  
  
    // Overloaded sum(). This sum takes two double parameters 
    public double Ship(double crewNum, double numPassagers) 
    { 
    	return (crewNum + numPassagers); 
    } 

	// Display method
	public void display()
	{
		Ship x = new Ship();
		System.out.println("Number of Engines: " + numEngines);
		//System.out.println("Crew for Operation: " + x.Ship(2,8));
	}
}