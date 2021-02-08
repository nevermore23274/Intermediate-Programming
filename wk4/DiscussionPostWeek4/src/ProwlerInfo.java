// Imports
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ProwlerInfo
{
	private JFrame frame;
	private final JTextArea txtrShipEngines = new JTextArea();
	
	// Launches application after clicking the "Prowler" button
	public static void NewScreen()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					ProwlerInfo window = new ProwlerInfo();
					window.frame.setVisible(true);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	// Create application
	public ProwlerInfo()
	{
		initialize();
	}

	// Initialize the frame
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		txtrShipEngines.setText("Ship Engines: 2\nManufacturer: Esperia\nClass: Dropship");
		txtrShipEngines.setBounds(12, 0, 416, 258);
		
		frame.getContentPane().add(txtrShipEngines);
	}
}