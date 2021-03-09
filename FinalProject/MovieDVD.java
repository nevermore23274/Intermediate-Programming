/* Files: MediaRentalSystem.java, Media.java, EBook.java, Manager.java, MovieDVD.java, MusicCD.java, media.txt
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Final Project
*/

class MovieDVD extends Media
{
	MovieDVD(int id, String title, int year, int chapter, boolean available)
	{
		super(id, title, year, chapter, available);
	}

	@Override
	public String toString()
	{
		return "MovieDVD [ id=" + this.id + " / title=" + this.title + " / size=" + this.chapter + "MB / year=" + 
				this.year + " / available=" + this.available + " ]\n";
	}
}
