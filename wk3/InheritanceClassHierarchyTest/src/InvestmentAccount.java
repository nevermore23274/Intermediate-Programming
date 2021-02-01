public class InvestmentAccount extends Account
{
	// attributes
	public boolean taxable;
	
	// constructor
	public InvestmentAccount(int num, boolean taxable)
	{
		super(num); // calls constructor of the parent account
		this.taxable = taxable;
	}
	
	// methods
}
