/* Files: MediaRentalSystem.java, Media.java, EBook.java, Manager.java, MovieDVD.java, MusicCD.java, media.txt
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Final Project
*/

class Media
{
	int id;
	String title;
	int year, chapter;
	float size;
	boolean available;

	Media()
	{
		
	}

	public Media(int id, String title, int year, int chapter, boolean available)
	{
		this.id = id;
		this.title = title;
		this.year = year;
		this.chapter = chapter;
		this.available = available;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getChapter()
	{
		return chapter;
	}

	public void setChapter(int chapter)
	{
		this.chapter = chapter;
	}

	public boolean isAvailable()
	{
		return available;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}
}
