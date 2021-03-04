/*
Filename: TopClothing.java
Author: Jacob Chen
Date: 02/26/2020
Purpose: Parent class of top article of clothing
*/
import java.util.Scanner; // Added by Tyler

public class TopClothing {

    //color text for console
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[0m";

    //private attributes
    private double length;
    private String color;
	private static int shirtLength = 0; // Added by Tyler
	private static String shirtColor = ""; // Added by Tyler
	private static boolean shirtHasStripes = false; // Added by Tyler
	private static boolean inputCatch = true; // Added by Tyler
	static Scanner userInput = new Scanner(System.in); // Added by Tyler

    //default constructor
    public TopClothing() {
        this.length = 30;
        this.color = "White";
    }

    public TopClothing(double length, String color) {
        if (length > 0) {
            this.length = length;
            this.color = color;
        } else {
            throw new IllegalLengthArgumentException(length);
        }
    }

    //getter methods
    public double getLength() {
        return this.length;
    }

    public String getColor() {
        return this.color;
    }

    //method to display all attributes
    public void display() {

        System.out.println("\nTop length: " + getLength() + " inches\nTop color: " + getColor());

    }

    public static void main(String[] args) {
    	
    	while(inputCatch) { // Added by Tyler
    		
    		System.out.print("How long is your shirt? "); // Added by Tyler
			shirtLength = userInput.nextInt(); // Added by Tyler
			System.out.print("What color is your shirt? "); // Added by Tyler
			shirtColor = userInput.next(); // Added by Tyler
			System.out.print("Does this shirt have stripes? "); // Added by Tyler
			shirtHasStripes = userInput.hasNext(); // Added by Tyler
			
    		//try to create and display TopClothing object
    		try {

    			TopClothing tshirt = new Tshirt(shirtLength, shirtColor, shirtHasStripes); // Some added and some altered by Tyler
    			tshirt.display();
    			userInput.close(); // Added by Tyler
				inputCatch = false; // Added by Tyler

    		} catch (IllegalLengthArgumentException e) {
            
    			//if the constructor throws the exception, then print the exceptions toString
    			System.err.println(ANSI_RED + e.toString() + ANSI_WHITE);
    			System.exit(0);
    		}
    	}
    }
}