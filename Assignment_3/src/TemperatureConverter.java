/*
* Files: GUIConverter.java, Converter.java, TemperatureConverter.java, DistanceConverter.java
* Name: Wilson, Tyler
* Assignment: Assignment 3
* Date: 22FEB2021
*/

// Imports
import java.text.DecimalFormat;

public class TemperatureConverter extends Converter
{
	// Default Constructor
	public TemperatureConverter()
	{
		super();
	}
	
	// Constructor
	public TemperatureConverter(double value)
	{
		super(value);
	}
	
	// Convert temp from F -> C
	@Override
	public double convert()
	{
		DecimalFormat decFormat = new DecimalFormat("#.##");
		double celsius = 0;
		if (Double.isNaN(value))
		{
			celsius = Double.NaN;
		}
		else
		{
			celsius = ((value - 32) *5)/9;
			celsius = Double.valueOf(decFormat.format(celsius));
		}
		return celsius;
	}
}