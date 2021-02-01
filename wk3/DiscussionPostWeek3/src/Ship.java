public class Ship
{
	// Default ship attributes
	public int numEngines;
	public int crewNum;
	
	// Constructor
	public Ship(int numEngines, int crewNum)
	{
		this.numEngines = numEngines;
		this.crewNum = crewNum;
	}
	
	// Display method
	public void display()
	{
		System.out.println("Number of Engines: " + numEngines);
		System.out.println("Crew for Operation: " + crewNum);
	}
}
