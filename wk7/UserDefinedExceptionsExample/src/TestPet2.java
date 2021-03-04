public class TestPet2
{
	public static void main(String[] args)
	{
		try
		{
			Pet2 pet = new Pet2("", 10);
		} catch (IllegalPetNameArgumentException e)
		{
			// some code how we want to handle invalid name
			System.out.println(e.toString());
		} catch (IllegalArgumentException e2)
		{
			// Some code how we want to handle any issues when IllegalArgumentException is thrown
			System.out.println("Caught IllegalArgumentException");
		}
	}
}