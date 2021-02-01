public class Snake extends Pet
{
	// attributes
	private double length;
	
	// constructor
	public Snake(String name, double length)
	{
		super(name);
		this.length = length;
	}
	
	// get methods
	public double getLength()
	{
		return length;
	}
	
	// set methods
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void display()
	{
		System.out.println("Snake [name=" + this.getName() + " length=" + length + "]");
	}
}