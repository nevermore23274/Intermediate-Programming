import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEX
{
	public static void main(String[] args)
	{
		PrintWriter result;
		
		try
		{
			// If file exists, will overwrite. If not, will make new file.
			result = new PrintWriter(new File("C:/tmp-umuc/result.dat"));
			result.println("Hello class");
			result.flush();
			result.close();
		}
		catch (IOException e)
		{
			// Handle exception
		}
	}
}