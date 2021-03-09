import java.util.Scanner;

public class ScannerEX
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println(scan.next());
		
		//if (scan.hasNextInt()) // Can use to skip string input
			System.out.println(scan.nextInt()); // Will read integers
			
		//System.out.println(scan.nextLine()); //Reads entire next line, regardless of input
			
		scan.close();
	}
}