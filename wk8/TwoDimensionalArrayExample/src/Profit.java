public class Profit
{
	public static void main(String[] args)
	{
		// Local variables
		int numStores = 25; // How many stores there are
		int numMonths = 12; // 12 months in a year
		int store, month; // Variables for looping through the stores and the months
		double[][] profit = new double[numStores][numMonths]; // Two-dimensional array to store profit values per month
		double totalProfit = 0; // Company's total profit in 2014
		
		// Use random generated data to load into the profit table
		for(store = 0; store < numStores; store++)
			for(month = 0; month < numMonths; month++)
				profit[store][month] = (int)(Math.random() * 100 + 25); // Values between 25 and 125
				
				// Print the values in formatted table
		for(store = 0; store < numStores; store++)
		{
			for(month = 0; month < numMonths; month++)
			{
				System.out.printf("%7.2f", profit[store][month]);
			}
			System.out.println();
		}

		// Calculate total profit
		for(store = 0; store < 25; store++)
		{
			for(month = 0; month < 12; month++)
			{
				totalProfit += profit[store][month];
			}
		}

		System.out.printf("\nTotal profit in 2014: $%.0f in thousands", totalProfit);

		// Calculate December profit
		double decemberProfit = 0;
		int storeNum;

		for(storeNum = 0; storeNum < numStores; storeNum++)
		{
			decemberProfit += profit[storeNum][11];
		}
		System.out.printf("\nDecember profit in 2014: $%.0f in thousands", decemberProfit);
	}
}