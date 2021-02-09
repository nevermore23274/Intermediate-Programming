
public class Gift
{
	protected String itemID;
	public char itemSize;
	public double itemPrice;
	
	public Gift(String itemID)
	{
		this.itemID = itemID;
	}
	
	public void Set_size(char c)
	{
		this.itemSize = c;
	}
	
	public void price()
	{
		if(itemSize == 'S')
		{
			this.itemPrice = 19.99;
		}
		
		if (itemSize == 'M')
		{
			this.itemPrice = 29.99;
		}
		
		if (itemSize == 'L')
		{
			this.itemPrice = 39.99;
		}
	}
}