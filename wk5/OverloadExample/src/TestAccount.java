public class TestAccount
{
	public static void main(String[] args)
	{
		Account currentAccount = new Account();
		
		currentAccount.deposit(5.5f); // calls the first deposit() mehtod
		System.out.println("balance="+currentAccount.getBalance());
		
		currentAccount.deposit(5); // calls the second deposit() method
		System.out.println("balance="+currentAccount.getBalance());
	}
}