/*
Filename: SweatShirt.java
Author: Jacob Chen
Date: 02/26/2020
Purpose: Child class of TopClothing representing SweatShirt
*/

public class SweatShirt extends TopClothing{

    //private hasHood attribute custom to SweatShirt class
    private boolean hasHood;

    //default constructor
    public SweatShirt() {

        super();
        this.hasHood = true;
    }

    //constructor
    public SweatShirt(double length, String color, boolean hasHood) {
        
        super(length, color);
        this.hasHood = hasHood;
    }

    //method to display attributes
    public void display() {
        
        System.out.println("\nSweatshirt length: " + getLength() + " inches\nSweatshirt color: " + getColor() + "\nSweatshirt has hood?: " + this.hasHood);
    }
}
