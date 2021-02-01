/*  Author: Tyler Wilson
 *  Course: CMIS 242 6382
 *  Date: 31JAN21
 *  Purpose: Create and construct instances of a class.
 */
public class SpaceBoatClassification 
{
	public static void main(String[] args)
	{
		Prowler myProwler = new Prowler(2, 2, 8);
		myProwler.display();
		System.out.println("\n");
		Origin325A myOrigin325A = new Origin325A(2, 1, 1);
		myOrigin325A.display();
	}
}
