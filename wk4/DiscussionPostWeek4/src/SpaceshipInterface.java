/*
* Files: SpaceshipInterface.java, ProwlerInfo.java, Origin325A.java
* Author: Tyler Wilson
* Date: 06FEB21
* Course: CMIS 242
* Assignment: Discussion 4
* Purpose: Create main menu, with buttons, that pops up with information regarding the ships
*/

// Imports
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpaceshipInterface extends JFrame {

	/** Added serialVersionUID to fix issue:
	 ** https://stackoverflow.com/questions/5632065/what-does-the-declare-a-static-final-serialversionuid-warning-mean-and-how-to/5632080
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Prowler");
	private final JButton btnaNewButton = new JButton("325A");

	// Launches the overall application
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					SpaceshipInterface frame = new SpaceshipInterface();
					frame.setVisible(true);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame
	public SpaceshipInterface()
	{
		initGUI();
	}
	
	private void initGUI()
	{
		setTitle("Starship Database");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ProwlerInfo.NewScreen();
			}
		});
		btnaNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Origin325A.NewScreen2();
			}
		});
		
		contentPane.add(btnNewButton, BorderLayout.WEST);
		contentPane.add(btnaNewButton, BorderLayout.EAST);
	}
}
