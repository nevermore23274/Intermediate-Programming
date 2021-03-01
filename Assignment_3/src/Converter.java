/*
* Files: GUIConverter.java, Converter.java, TemperatureConverter.java, DistanceConverter.java
* Name: Wilson, Tyler
* Assignment: Assignment 3
* Date: 22FEB2021
*/

public class Converter
{
	protected double value;
	
	// Default constructor sets value to NaN
	public Converter()
	{
		value=Double.NaN;
	}
	
	// Constructor to set value
	public Converter(double value)
	{
		this.value = value;
	}
	
	// Getter method
	public double getValue()
	{
		return value;
	}
	
	// Setter method
	public void setValue(double value)
	{
		this.value = value;
	}
	
	public double convert()
	{
		return value;
	}
}