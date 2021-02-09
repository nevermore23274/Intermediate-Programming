public class SweetsBasket extends Gift
{
	public boolean nuts_indication;
	
	public SweetsBasket(String id)
	{
		super(id);
	}
	
	public void nutsIndicator(boolean t)
	{
		this.nuts_indication = t;
	}
	
	public boolean get_nuts_indication()
	{
		return nuts_indication;
	}
	
	public void Display()
	{
		System.out.println("SweetsBasket [havenuts= " + nuts_indication + " size=" + itemSize + " id=" + itemID + " price =" + itemPrice + "]");
	}
}