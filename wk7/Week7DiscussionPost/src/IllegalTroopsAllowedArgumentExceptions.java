/* Files: SpaceBoatClassification.java, Ship.java, Prowler.java, IllegalTroopsAllowedArgumentExceptions.java
 * Author: Tyler Wilson
 * Class: CMIS 242, Loan Salomie
 * Assignment: Week 7 Discussion Post
*/

public class IllegalTroopsAllowedArgumentExceptions extends IllegalArgumentException
{
	private static final long serialVersionUID = 1L; // Removes serialization warning
	private int troopsAllowed;
	
	public IllegalTroopsAllowedArgumentExceptions(int troopsAllowed)
	{
		super("Dropships cannot have null or less than 0 troops allowed: " + troopsAllowed + " invalid.");
		this.troopsAllowed = troopsAllowed;
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName() + " : Dropships cannot have null or less than 0 troops allowed: '" + troopsAllowed + "' is invalid.";
	}
}