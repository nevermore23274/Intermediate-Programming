/* Files: MediaRentalSystem.java, Media.java, EBook.java, Manager.java, MovieDVD.java, MusicCD.java, media.txt
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Final Project
*/

class EBook extends Media
{
	EBook(int id, String title, int year, int chapter, boolean available)
	{
		super(id, title, year, chapter, available);
	}

	@Override
	public String toString()
	{
		return "EBook [ id=" + this.id + " / title=" + this.title + " / chapter=" + this.chapter + " / year=" + this.year
				+ " / available=" + this.available + " ]\n";
	}
}
