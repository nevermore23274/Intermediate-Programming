public class TestInheritance
{
	public static void main(String[] args)
	{
		// create instances of subclasses
		Dog d = new Dog("Buster", "ABC123");
		Snake s = new Snake("Joe", 6);
		
		// call display methods
		d.display();
		s.display();
	}
}