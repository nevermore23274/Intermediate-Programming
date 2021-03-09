import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerFileReader
{
	public static void main(String[] args)
	{
		Scanner data = null;
		
		try
		{
			data = new Scanner(new FileReader("C:/tmp-umuc/data.txt"));
			System.out.println(data.nextLine());
		} catch(FileNotFoundException e)
		{
			// Handle exception
		}
	}
}