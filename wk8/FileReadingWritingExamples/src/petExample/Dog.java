package petExample;

public class Dog extends Pet
{
	// Attributes
	private String chipID;
	
	// Constructor
	public Dog(String name, int id, String chipID)
	{
		super(name, id);
		this.chipID = chipID;
	}
	
	public Dog(String line)
	{
		super(line);
		chipID = line.substring(line.indexOf("<chipID>") + 8, line.indexOf("</chipID>")); // Skips 8 characters for <chipID>
	}
	
	// Get method
	public String getChipID()
	{
		return chipID;
	}
	
	// Set method
	public void setChipID(String chipID)
	{
		this.chipID = chipID;
	}
	
	// Creates xml tags and puts current values between tags so when called it can gather formatted string for writing
	public String toString()
	{
		return "<Dog>"
				+ "<name>" + this.getName() + "</name"
				+ "<id>" + this.getID() + "</id>"
				+ "<chipID" + this.chipID + "</chipID>"
				+ "</Dog>";
	}
}