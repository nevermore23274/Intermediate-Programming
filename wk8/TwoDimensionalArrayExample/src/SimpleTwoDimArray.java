public class SimpleTwoDimArray
{
	public static void main(String[] args)
	{
		int[][] A = {
					{13, 7, 33, 54, -5, -1, 92},
					{-3, 0, 8, 42, 18, 0, 67},
					{44, 78, 90, 79, -5, 72, 22},
					{43, -6, 17, 100, 1, -12, 12},
					{2, 0, 58, 58, 36, 21, 87}
					};
		
		int row, col; // Loop-control-variables for accessing rows and columns in A
		
		for(row = 0; row < 5; row++)
		{
			for(col = 0; col < 7; col++)
			{
				System.out.printf("%7d", A[row][col]);
			}
			System.out.println();
		}
	}
}