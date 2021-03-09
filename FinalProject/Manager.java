// Import(s)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Manager
{
	static List<Media> list=new ArrayList<>();

	Manager()
	{
		
	}

	public boolean LoadMedia(String path)
	{
		try
		{
			File myObj = new File(path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				String[] str = data.split(" ");
				if (str[0].equals("EBook"))
				{
					list.add(new EBook(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
							Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
				}
				else if(str[0].equals("MusicCD"))
				{
					list.add(new MusicCD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
							Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
				}
				else
				{
					list.add(new MovieDVD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
							Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
				}
			}
			System.out.println(list.toString().replace("[", "").replace("]", "").replace(",", ""));
			myReader.close();
			return true;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File cannot be opened: Could not load, no such directory");
			e.printStackTrace();
			return false;
		}
	}

	public void findMedia(String title)
	{
		for(Media media : list)
		{
			if(media.getTitle().equals(title))
				System.out.print(media.toString());
		}
	}

	public void rentMedia(int id)
	{
		for(Media media : list )
		{
			if(media.getId()==id)
			{
				if(media.isAvailable())
					System.out.println("Media successfully rented. Rental fee = $2.00");
				else
					System.out.println("Media with id=" + id + " is not available for rent ");
			}
		}
	}
}