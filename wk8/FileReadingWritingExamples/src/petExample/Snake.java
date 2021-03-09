package petExample;

public class Snake extends Pet
{
	// Attributes
	private double length; // In feet
	
	// Constructor
	public Snake(String name, int id, double length)
	{
		super(name, id);
		this.length = length;
	}
	
	// Constructor to parse string with xml tags for its values
	public Snake(String line)
	{
		super(line);
		length = Float.parseFloat(line.substring(line.indexOf("<length>") + 8, line.indexOf("</length>")));
	}
	
	// Get method
	public double getLength()
	{
		return length;
	}
	
	// Set method
	public void setLength(double length)
	{
		this.length = length;
	}
	
	// Creates xml tags and puts current values between tags so when called it can gather formatted string for writing
	public String toString()
	{
		return "<Snake>"
				+ "<name>" + this.getName() + "</name>"
				+ "<id>" + this.getID() + "</id"
				+ "<length" + length + "</length>"
				+ "</Snake>";
	}
}