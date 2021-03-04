/*
Filename: Tshirt.java
Author: Jacob Chen
Date: 02/26/2020
Purpose: Child class of TopClothing representing Tshirt
*/

public class Tshirt extends TopClothing{
    
    //private hasStripes attribute custom to Tshirt class
    private boolean hasStripes;
    private boolean hasCollar;
    private int numButtons;

    //default constructor
    public Tshirt() {

        super();
        this.hasStripes = false;
        this.hasCollar = false;
        this.numButtons = 0;
    }

    //constructor
    public Tshirt(double length, String color, boolean hasStripes) {
        
        super(length, color);
        this.hasStripes = hasStripes;
    }

    //overloading constructor
    public Tshirt(double length, String color, boolean hasCollar, int numButtons) {
        
        super(length, color);
        this.hasCollar = hasCollar;
        this.numButtons = numButtons;
    }

    //method to display attributes
    public void display() {
        
        System.out.println("\nTshirt length: " + getLength() + " inches\nTshirt color: " + getColor() + "\nTshirt has stripes?: " + this.hasStripes + "\nTshirt has collar?: " + this.hasCollar + "\nTshirt has how many buttons?: " + this.numButtons);
    }
}
