public class TryCatch
{
	public static void main(String[] args)
	{
		double x = 0;
		String str = "42";
		
		try
		{
			x = Double.parseDouble(str);
			System.out.println("The number is " + x);
		} catch (NumberFormatException e)
		{
			System.out.println("Not a legal number.");
			x = Double.NaN;
		}
		
		// rest of code checking and doing something based on x value
	}
}