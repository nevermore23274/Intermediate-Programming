/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, Origin325A.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 5 Discussion Post
 * Purpose: Show usage of Overloading and Overriding
*/

public class SpaceBoatClassification
{
	public static void main(String[] args)
	{
		/* / Default ship is a drone
		Ship s1 = new Ship(0, 0);
        s1.display();
        s1.lifeSupport();
        */
        System.out.println(); // Separates output
        
        Prowler s2 = new Prowler(2, 2, 8, true);
        s2.display();
        //s2.lifeSupport();
        
        System.out.println(); // Separates output
        
        Origin325A s3 = new Origin325A(2, 1, 2);
        s3.display();
        //s3.lifeSupport();
	}
}