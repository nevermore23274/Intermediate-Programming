public class Account
{
	// other attributes
	private float balance;
	
	// methods
	public void deposit(float amount)
	{
		System.out.println("executing float method");
		balance = balance + amount;
	}
	
	public void deposit(int amount)
	{
		System.out.println("executing int method");
		balance = balance + amount;
	}
	
	public float getBalance()
	{
		return balance;
	}
}