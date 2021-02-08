import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGUI2
{
	private static class HelloWorldDisplay extends JPanel
	{
		public void paintComponent(Graphics g) // Method to draw a string "hello world!"
		{
			super.paintComponent(g);
			g.drawString("Hello World!", 20, 30); // String to draw, x-cord, y-cord
		}
	}
	
	private static class ButtonHandler implements ActionListener
	{
		private int clicks = 0;
		
		public void actionPerformed(ActionEvent e)
		{
			clicks++;
			System.out.println("Num clicks=" + clicks);
			if (clicks == 3)
				System.exit(0);
		}
		/* Can also use this
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
		*/
	}
	
	public static void main(String[] args)
	{
		HelloWorldDisplay displayPanel = new HelloWorldDisplay(); // Creates an instance of the class that will draw the String "Hello World!"
		JButton okButton = new JButton("OK"); // Creates the OK button widget
		
		ButtonHandler listener = new ButtonHandler(); // Creates the handler for the button - which has code what to do when the button is clicked
		okButton.addActionListener(listener); // Adds the handler to the button widget
		
		JPanel content = new JPanel(); // Creates new content instance - rectangle where other components can be added to
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER); // Adds the display panel instance that has the string "Hello World!" in CENTER
		content.add(okButton, BorderLayout.SOUTH); // Adds the ok button below Hello string
		
		JFrame window = new JFrame("GUI Test"); // Creates frame window
		window.setContentPane(content); // Adds content we created above which has hello string and ok button
		window.setSize(250,100); // Sets size of the window
		window.setLocation(100,100); // Sets x,y location where it should display
		window.setVisible(true); // Makes it visible
	}
}
