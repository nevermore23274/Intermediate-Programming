/*
* Files: GUIConverter.java, Converter.java, TemperatureConverter.java, DistanceConverter.java
* Name: Wilson, Tyler
* Assignment: Assignment 3
* Date: 22FEB2021
*/

// Imports
import java.text.DecimalFormat;

public class DistanceConverter extends Converter
{
	// Default constructor
	public DistanceConverter()
	{
		super();
	}
	
	// Constructor
	public DistanceConverter(double value)
	{
		super(value);
	}
	
	// Convert MI -> KM
	@Override
	public double convert()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		double km = 0;
		if (Double.isNaN(value))
		{
			km = Double.NaN;
		}
		else
		{
			km = value * 1.609;
			km = Double.valueOf(df.format(km));
		}
		return km;
	}
}