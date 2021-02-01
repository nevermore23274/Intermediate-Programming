public class Minecraft extends VideoGame {
	
	//variables 
	private String founder;
	private String composer;

	//constructor
	Minecraft(String title, String genre, float price, String founder, String composer) {
		super(title, genre, price);
		this.founder = founder;
		this.composer = composer;
	}

	//getter methods
	public String getFounder() {
		return this.founder;
	}

	public String getComposer() {
		return this.composer;
	}

	//setter method 
	public void setFounder(String founder) {
		this.founder = founder;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	//toString
	public String toString() {
		return "Minecraft [title = " + getTitle() +", genre = " + getGenre() +", price = $" + getPrice() +", founder = " + getFounder() +", composer = " + getComposer() +"]";
	}
}