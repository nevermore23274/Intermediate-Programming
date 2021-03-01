/*
* Files: GUIConverter.java, Converter.java, TemperatureConverter.java, DistanceConverter.java
* Name: Wilson, Tyler
* Assignment: Assignment 3
* Date: 22FEB2021
*/

// Imports
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class GUIConverter extends JFrame
{
	private static final long serialVersionUID = 1L; // Added to get rid of warning for static class

	public GUIConverter()
	{
		JFrame frame = new JFrame("Converter");
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 90); // Give the frame an initial size
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create three buttons
		JButton distanceConverter = new JButton("Distance Converter");
		JButton tempConverter = new JButton("Temperature Converter");
		JButton exit = new JButton("Exit");
		// Add button to content pane
		frame.add(distanceConverter);
		frame.add(tempConverter);
		frame.add(exit);
		
		// Add action listener for distance converter
		distanceConverter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				DistanceConverter distanceConverter = new DistanceConverter();
				try
				{
					double distance = Double.parseDouble(JOptionPane.showInputDialog("Input distance in convert"));
					distanceConverter.setValue(distance);
					JOptionPane.showMessageDialog(rootPane, distance + " MI equals " + distanceConverter.convert() + " KM");
				}
				catch (NumberFormatException numException)
				{
					JOptionPane.showMessageDialog(rootPane, "No input, Double.NaN = " + distanceConverter.convert());
				}
			}
		});
		
		// Add action listener for temperature converter
		tempConverter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent actionEvent)
			{
				TemperatureConverter tempConverter = new TemperatureConverter();
				try
				{
					double temp = Double.parseDouble(JOptionPane.showInputDialog("Input Fahrenheit temperature to convert:"));                  
					tempConverter.setValue(temp);
					JOptionPane.showMessageDialog(rootPane, temp + " F equals " + tempConverter.convert() + " C");
				}
				catch
				(NumberFormatException numException)
				{
					JOptionPane.showMessageDialog(rootPane, "No input, Double.NaN = " + tempConverter.convert());
				}
			}
		});
		
		// Add action listener for exit button
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent acEvent)
			{
				frame.dispose();
			}
		});
		
		// Display frame
		frame.setVisible(true);
	}

	public static void main(String args[])
	{
		// Create frame on event dispatching thread
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new GUIConverter();
			}
		});
	}
}
