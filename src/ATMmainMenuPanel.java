import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ATMmainMenuPanel extends JPanel  //Main Menu Panel
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;

	public ATMmainMenuPanel()
	{

		
		System.out.println("Main menu PANEL CREATED"); //Message to console for developer

		
		setSize(WIDTH,HEIGHT); //Main Menu Info
		setBounds(-15, 0, 989, 562);
		setVisible(true);
		setLayout(null);
		
		JButton DepositButton = new JButton("Deposit");  //Button
		DepositButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DepositButton.setBounds(289, 138, 156, 63);
		add(DepositButton);
		
		DepositButton.addActionListener(new EndingListener());//action listener
		
		JButton MakeTransferButton = new JButton("Make Transfer");//Button
		MakeTransferButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MakeTransferButton.setBounds(537, 233, 156, 63);
		add(MakeTransferButton);
		
		MakeTransferButton.addActionListener(new EndingListener());//action listener
		
		JButton LogoutButton = new JButton("Log Out");//Button
		LogoutButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LogoutButton.setBounds(537, 328, 156, 63);
		
		LogoutButton.addActionListener(new EndingListener());//action listener
		
		add(LogoutButton);
		
		JButton WithdrawButton = new JButton("Withdraw");//Button
		WithdrawButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		WithdrawButton.setBounds(537, 138, 156, 63);
		add(WithdrawButton);
		
		WithdrawButton.addActionListener(new EndingListener());//action listener
		
		JButton CheckBalanceButton = new JButton("Check Balance");//Button
		CheckBalanceButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CheckBalanceButton.setBounds(289, 234, 156, 63);
		add(CheckBalanceButton);
		
		CheckBalanceButton.addActionListener(new EndingListener());//action listener
		
		JButton ChangePasswordButton = new JButton("Change Password");//Button
		ChangePasswordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ChangePasswordButton.setBounds(289, 328, 156, 63);
		add(ChangePasswordButton);
		
		ChangePasswordButton.addActionListener(new EndingListener());//action listener
	}
	
}
