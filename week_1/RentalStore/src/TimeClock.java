public class TimeClock 
{
	private String storeName;
	private boolean clockedIn;
	String statusClockedIn;
	
	public TimeClock(String storeName, boolean clockedIn)
	{
		this.storeName = storeName;
		this.clockedIn = clockedIn;
	}
	
	// Default Constructor
	public TimeClock()
	{
		storeName = "Robo Co.";
		clockedIn = false;
	}
	
	// Getters
	public void storeName(String storeName)
	{
		this.storeName = storeName;
	}
	
	public void setclockedIn(boolean clockedIn)
	{
		this.clockedIn = clockedIn;
	}
	
	// Setters
	public String getstoreName()
	{
		return storeName;
	}
	
	public boolean getClockedIn()
	{
		if(clockedIn == true)
		{
			statusClockedIn = "You're clocked in.";
		}
		else
		{
			statusClockedIn = "You're clocked out.";
		}
		
		return clockedIn;
	}
	
	// Use a ternary operator to change true/false output to open/closed
	public String alteredclockedIn(boolean clockedIn)
	{
		return clockedIn ? "Open" : "Closed";
	}
	
	// toString for returning current status'
	public String toString()
	{
		String storeName = this.getstoreName();
		boolean clockedIn = this.getClockedIn();
		
		StringBuilder mainString = new StringBuilder();
		
		mainString.append(String.format("- %s\n", storeName));
		mainString.append(String.format("- Store Status: %s\n", alteredclockedIn(clockedIn)));
		
		return mainString.toString();
	}
}
