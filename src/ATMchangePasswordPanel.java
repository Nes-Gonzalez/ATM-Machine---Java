import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ATMchangePasswordPanel extends JPanel //Change Password Panel
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;
	
	static JTextField CurrentPasswordTextfield;
	static JTextField NewPasswordTextfield;
	static JTextField confirmPasswordTextfield;
	
	static JLabel PasswordChangedLabel;
	static JLabel IncorrectPasswordNewPasswordLabel;
	
	public ATMchangePasswordPanel()
	{
		setSize(WIDTH,HEIGHT); //panel info
		setLayout(null);
		
		JLabel ChangePasswordLabel = new JLabel("Change Password"); //label
		ChangePasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ChangePasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ChangePasswordLabel.setBounds(352, 72, 279, 58);
		add(ChangePasswordLabel);
		
		CurrentPasswordTextfield = new JTextField(); //text field
		CurrentPasswordTextfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CurrentPasswordTextfield.setBounds(377, 201, 419, 44);
		add(CurrentPasswordTextfield);
		CurrentPasswordTextfield.setColumns(10);
		
		JLabel EnterCurrentPasswordLabel = new JLabel("Enter Current Password");//label
		EnterCurrentPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EnterCurrentPasswordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		EnterCurrentPasswordLabel.setBounds(23, 201, 331, 44);
		add(EnterCurrentPasswordLabel);
		
		JLabel EnterNewPasswordLabel = new JLabel("Enter New Password");//label
		EnterNewPasswordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		EnterNewPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EnterNewPasswordLabel.setBounds(23, 256, 331, 44);
		add(EnterNewPasswordLabel);
		
		JLabel ConfirmNewPasswordLabel = new JLabel("Confirm New Password");//label
		ConfirmNewPasswordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		ConfirmNewPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ConfirmNewPasswordLabel.setBounds(23, 311, 331, 44);
		add(ConfirmNewPasswordLabel);
		
		NewPasswordTextfield = new JTextField();//text field
		NewPasswordTextfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NewPasswordTextfield.setColumns(10);
		NewPasswordTextfield.setBounds(377, 256, 419, 44);
		add(NewPasswordTextfield);
		
		confirmPasswordTextfield = new JTextField();//text field
		confirmPasswordTextfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		confirmPasswordTextfield.setColumns(10);
		confirmPasswordTextfield.setBounds(377, 311, 419, 44);
		add(confirmPasswordTextfield);
		
		PasswordChangedLabel = new JLabel("Password Changed");//label
		PasswordChangedLabel.setForeground(Color.BLACK);
		PasswordChangedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordChangedLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordChangedLabel.setBounds(273, 373, 410, 58);
		add(PasswordChangedLabel);
		
		PasswordChangedLabel.setVisible(false);
		
		IncorrectPasswordNewPasswordLabel = new JLabel("Incorrect Password/New Password");//label
		IncorrectPasswordNewPasswordLabel.setForeground(Color.RED);
		IncorrectPasswordNewPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		IncorrectPasswordNewPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		IncorrectPasswordNewPasswordLabel.setBounds(273, 373, 410, 58);
		add(IncorrectPasswordNewPasswordLabel);
		
		IncorrectPasswordNewPasswordLabel.setVisible(false);
		
		JButton OkButton = new JButton("OK");//button
		OkButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OkButton.setBounds(536, 449, 147, 58);
		add(OkButton);
		
		OkButton.addActionListener(new EndingListener());
		
		JButton backButton = new JButton("Back");//button
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(273, 449, 147, 58);
		add(backButton);
		
		backButton.addActionListener(new EndingListener());
		
	}

}
