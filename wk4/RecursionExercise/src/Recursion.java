public class Recursion
{
	// method to sum up numbers 1... num
	public static int sum(int num)
	{
		if (num == 1) // stopping case
		{
			return num;
		}
		
		return num + sum(num-1); // recursive case
	}
	
	// recursive method that sums up digits of a number num => sumDigits(num)
	public static int sumDigits(int num)
	{
		if (num == 0)
		{
			return 0;
		}
		
		return num % 10 + sumDigits(num/10);
	}
	
	public static void main(String[] args)
	{
		System.out.println(sum(4)); // 4 + 3 + 2 + 1 = 10
		
		System.out.println(sumDigits(3512)); // 2 + 1 + 5 + 3 = 11
	}
}
