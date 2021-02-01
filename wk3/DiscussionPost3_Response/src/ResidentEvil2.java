public class ResidentEvil2 extends VideoGame {
	
	//variables
	private String monthRel;
	private int playerCount;

	//constructor
	ResidentEvil2(String title, String genre, float price, String monthRel, int playerCount) {
		super(title, genre, price);
		this.monthRel = monthRel;
		this.playerCount = playerCount;
	}

	//getter methods
	public String getMonthRel() {
		return this.monthRel;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	//setter method 
	public void setMonthRel(String monthRel) {
		this.monthRel = monthRel;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	//toString
	public String toString() {
		return "ResidentEvil2 [title = " + getTitle() +", genre = " + getGenre() +", price = $" + getPrice() +", month released = " + getMonthRel() +", player count = " + getPlayerCount() +"]";
	}
}