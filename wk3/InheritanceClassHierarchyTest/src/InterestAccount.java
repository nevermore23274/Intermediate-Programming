public class InterestAccount extends Account
{
	// attributes
	public double interest;
	
	// constructor
	public InterestAccount(int num, int interest)
	{
		super(num); // calls constructor of the parent account
		this.interest = interest;
	}
	
	// methods
}
