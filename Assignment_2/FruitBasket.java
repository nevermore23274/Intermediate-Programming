public class FruitBasket extends Gift
{
	private int fruitNum;
	private boolean citrusIndicator;
	
	public FruitBasket(String itemID)
	{
		super(itemID);
	}
	
	public void fruitNum()
	{
		if (itemSize == 'S')
		{
			this.fruitNum = 6;
		}
		
		if (itemSize == 'M')
		{
			this.fruitNum = 9;
		}
		
		if (itemSize == 'L')
		{
			this.fruitNum = 15;
		}
	}
	
	public void citrusIndicator(boolean citrusIndicator)
	{
		this.citrusIndicator = citrusIndicator;
		if (citrusIndicator == true)
		{
			itemPrice = itemPrice + 5.99;
		}
	}
	
	public int getFruitNum()
	{
		return fruitNum;
	}
	
	public boolean getCitrusIndicator()
	{
		return citrusIndicator;
	}
	
	public void Display()
	{
		System.out.println("FruitBasket [numFruits=" + fruitNum + " haveCitrus=" + citrusIndicator+ " size="
				+ itemSize + " id=" + itemID + " price=" + String.format("%.02f", itemPrice) + "]");
	}
}
