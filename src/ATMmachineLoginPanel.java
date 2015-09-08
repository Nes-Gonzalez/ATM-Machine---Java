import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ATMmachineLoginPanel extends JPanel  //Login Panel
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;

	JTextField AccountNumberField; //Panel items
	JTextField PasswordField;
	JLabel IncorrectLoginLabel;
	JLabel LoggedOutLable;
	
	public ATMmachineLoginPanel()
	{

		
		System.out.println("Login PANEL CREATED"); //Message to console for developer
		
		setSize(WIDTH, HEIGHT);		//size and layout
		setLayout(null);	
		
		JLabel AcountNumberLabel = new JLabel("Account Number:"); //label
		AcountNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AcountNumberLabel.setBounds(265, 227, 115, 29);
		add(AcountNumberLabel);
		
		JLabel PasswordLabel = new JLabel("Password: "); //label
		PasswordLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		PasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PasswordLabel.setBounds(313, 271, 67, 29);
		add(PasswordLabel);
		
		AccountNumberField = new JTextField(); //text field
		AccountNumberField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AccountNumberField.setBounds(401, 227, 242, 26);
		add(AccountNumberField);
		AccountNumberField.setColumns(10);
		
		PasswordField = new JTextField(); //text field
		PasswordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PasswordField.setColumns(10);
		PasswordField.setBounds(401, 273, 242, 26);
		add(PasswordField);
		
		IncorrectLoginLabel = new JLabel("Incorrect Login");//label
		IncorrectLoginLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		IncorrectLoginLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		IncorrectLoginLabel.setBounds(401, 141, 154, 75);
		add(IncorrectLoginLabel);
		IncorrectLoginLabel.setVisible(false);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setBounds(401, 358, 154, 47);
		
		LoginButton.addActionListener(new EndingListener()); //action listener
		
		add(LoginButton);
		
		LoggedOutLable = new JLabel("Logged Out");
		LoggedOutLable.setHorizontalTextPosition(SwingConstants.CENTER);
		LoggedOutLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		LoggedOutLable.setBounds(401, 141, 154, 75);
		add(LoggedOutLable);
		setVisible(false);
		
	}

}
