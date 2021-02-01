/*
* Author: Vivian Garcia
* Date: 1/31/2021
* File: VideoGame.java
* Purpose: Completion of DB3
*/

public class VideoGame {

	// Variables
	private String title;
	private String genre;
	private float price;

	//Constructor
	VideoGame(String title, String genre, float price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
	}

	//Get methods
	public String getTitle() {
		return title;

	}

	public String getGenre() {
		return genre;
	}

	public float getPrice() {
		return price;
	}

	//Set methods 
	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

}