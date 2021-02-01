public class Dog extends Pet
{
	// attributes
	private String chipID;
	
	// constructor
	public Dog(String name, String chipID)
	{
		super(name);
		this.chipID = chipID;
	}
	
	// get methods
	public String getChipID()
	{
		return chipID;
	}
	
	// set methods
	public void setChipID(String chipID)
	{
		this.chipID = chipID;
	}
	
	public void display()
	{
		System.out.println("Dog [name=" + this.getName() + " chipID=" + chipID + "]");
	}
}
