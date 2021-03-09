package petExample;

public class Pet
{
	// Attributes
	private int id;
	private String name;
	
	// Constructor
	public Pet(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	// Overload constructor to parse string with xml tags for its values
	public Pet(String line)
	{
		id = Integer.parseInt(line.substring(line.indexOf("<id>") + 4, line.indexOf("</id>"))); // Skips 4 characters for <id>
		name = line.substring(line.indexOf("<name>") + 6, line.indexOf("</name>")); // Skips 6 characters for <name>
	}
	
	// Get method
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
	
	// Set method
	public void setName(String name)
	{
		this.name = name;
	}
}