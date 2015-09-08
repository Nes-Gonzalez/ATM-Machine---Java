import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ATMcheckBalancePanel extends JPanel //Check Balance Panel
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;
	
	static JLabel SavingsAccountLabel;
	static JLabel CheckingAccountLabel;
	
	public ATMcheckBalancePanel()
	{

		
		setSize(WIDTH,HEIGHT);//panel info
		setLayout(null);
		
		JPanel CheckBalancePanel = new JPanel(); // panel
		CheckBalancePanel.setBounds(0, 0, 984, 562);
		add(CheckBalancePanel);
		CheckBalancePanel.setLayout(null);
		
		CheckingAccountLabel = new JLabel("Checking Accnt 111859620: $"); //label
		CheckingAccountLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		CheckingAccountLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		CheckingAccountLabel.setBounds(280, 244, 514, 53);
		CheckBalancePanel.add(CheckingAccountLabel);
		
		SavingsAccountLabel = new JLabel("Savings Accnt 111000020: $"); //label
		SavingsAccountLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		SavingsAccountLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		SavingsAccountLabel.setBounds(299, 310, 514, 53);
		CheckBalancePanel.add(SavingsAccountLabel);
		
		JLabel NameLabel = new JLabel(ATMcreator.getFirstName()+" "+ATMcreator.getLastName()); //label
		NameLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		NameLabel.setBounds(244, 85, 514, 53);
		CheckBalancePanel.add(NameLabel);
		
		JButton backButton = new JButton("Back");//button
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(110, 451, 152, 53);
		CheckBalancePanel.add(backButton);
		
		backButton.addActionListener(new EndingListener());
	}

}
