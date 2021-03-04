public class IllegalPetNameArgumentExceptions extends IllegalArgumentException
{
	private String msg;
	
	public void IllegalPetNameArgumentException(String name)
	{
		if (name == null)
			msg = "Pet name cannot be null";
		else if (name.isBlank())
			msg = "Pet name cannot have all blank values";
		else if (name.isEmpty())
			msg = "Pet name cannot be empty value";
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName() + " : " + msg;
	}
}