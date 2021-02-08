// Imports
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Origin325A {

	private JFrame frame;
	private final JTextArea txtrShipEngines = new JTextArea();

	// Launches application after clicking "Origin 325A" button
	public static void NewScreen2()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Origin325A window = new Origin325A();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	// Creates the application
	public Origin325A()
	{
		initialize();
	}

	// Initialize the frame
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		txtrShipEngines.setText("Ship Engines: 2\nManufacturer: Origin\nClass: Interceptor");
		txtrShipEngines.setBounds(12, 0, 416, 258);
		
		frame.getContentPane().add(txtrShipEngines);
	}
}
