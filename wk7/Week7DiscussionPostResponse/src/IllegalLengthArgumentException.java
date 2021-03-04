/*
Filename: IllegalLengthArgumentException.java
Author: Jacob Chen
Date: 02/26/2020
Purpose: java class that creates user-defined exception to throw
*/

public class IllegalLengthArgumentException extends IllegalArgumentException{

	private static final long serialVersionUID = 1L; // Added by Tyler to remove serialization warning
	
	//private String message to return after exception is thrown
    // private String message; // Removed by Tyler
    private double length; // Added by Tyler

    //constructor that sets the message
    public IllegalLengthArgumentException(double length) {

    	super(); // Added by Tyler
		this.length = length; // Added by Tyler
		
    	/* Removed by Tyler
        if (length <= 0) {
            this.message = "Length must be more than 0";
        }
        */
    }

    //toString method to get the message
    public String toString() {
        return this.getClass().getSimpleName() + ": Length must be more than 0 : '" + length + "' is not valid."; // Modified by Tyler
    }
}
