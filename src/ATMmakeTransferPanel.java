import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ATMmakeTransferPanel extends JPanel implements ActionListener //make transfer panel
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;
	
	static JLabel transferFromLabel;
	static JLabel TransferFromTopLabel;
	static JLabel TransferToLabel;
	static JLabel TransferFromBottomLabel;
	static JButton CheckingAccountButton;
	static JButton SavingsAccountButton;
	static JLabel AmountLabel;
	static JButton MakeTransferButton;
	static JLabel SelectDifferentAccountsLabel;
	static JLabel MakeTransferLabel;
	static JTextField AmountTextField;
	static JLabel TransferSuccessLabel;
	
	DecimalFormat formater = new DecimalFormat("###,###.00");
	
	static String FirstChoice; //string for saving what was chosen first by user
	
	public ATMmakeTransferPanel()
	{
		setSize(WIDTH,HEIGHT);//panel info
		setLayout(null);
		
		JPanel MakeTransferPanel = new JPanel();
		MakeTransferPanel.setBounds(0, 0, 984, 562);
		add(MakeTransferPanel);
		MakeTransferPanel.setLayout(null);
		
		TransferFromTopLabel = new JLabel("Transfer From: Checking"); //label
		TransferFromTopLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TransferFromTopLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		TransferFromTopLabel.setBounds(143, 147, 705, 69);
		MakeTransferPanel.add(TransferFromTopLabel);
		TransferFromTopLabel.setVisible(false);
		
		MakeTransferLabel = new JLabel("Make Transfer");//label
		MakeTransferLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MakeTransferLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		MakeTransferLabel.setBounds(367, 30, 253, 78);
		MakeTransferPanel.add(MakeTransferLabel);
		
		TransferToLabel = new JLabel("Transfer To:");//label
		TransferToLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TransferToLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		TransferToLabel.setBounds(367, 171, 223, 69);
		MakeTransferPanel.add(TransferToLabel);
		TransferToLabel.setVisible(false);
		
		CheckingAccountButton = new JButton("Checking Accnt: $" );//button
		CheckingAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CheckingAccountButton.setBounds(320, 251, 335, 89);
		MakeTransferPanel.add(CheckingAccountButton);
		CheckingAccountButton.setActionCommand("CheckingAccountButton");
		
		CheckingAccountButton.addActionListener(this);
		
		SavingsAccountButton = new JButton("Savings Accnt: $");//button
		SavingsAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SavingsAccountButton.setBounds(320, 351, 335, 89);
		MakeTransferPanel.add(SavingsAccountButton);
		SavingsAccountButton.setActionCommand("SavingsAccountButton");
		
		SavingsAccountButton.addActionListener(this);
		
		JButton backButton = new JButton("Back");//button
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(87, 465, 133, 63);
		MakeTransferPanel.add(backButton);
		
		backButton.addActionListener(new EndingListener());
		
		transferFromLabel = new JLabel("Transfer From:");//label
		transferFromLabel.setHorizontalAlignment(SwingConstants.CENTER);
		transferFromLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		transferFromLabel.setBounds(367, 171, 223, 69);
		MakeTransferPanel.add(transferFromLabel);
		
		TransferFromBottomLabel = new JLabel("Transfer From: Savings");//label
		TransferFromBottomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TransferFromBottomLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		TransferFromBottomLabel.setBounds(143, 227, 705, 69);
		MakeTransferPanel.add(TransferFromBottomLabel);
		TransferFromBottomLabel.setVisible(false);
		
		AmountLabel = new JLabel("Enter Amount: ");//label
		AmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AmountLabel.setBounds(143, 307, 235, 69);
		MakeTransferPanel.add(AmountLabel);
		AmountLabel.setVisible(false);
		
		MakeTransferButton = new JButton("Make Transfer");//button
		MakeTransferButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		MakeTransferButton.setBounds(367, 399, 241, 62);
		MakeTransferPanel.add(MakeTransferButton);
		MakeTransferButton.setVisible(false);
		
		MakeTransferButton.setActionCommand("TransferMoneyButton");
		MakeTransferButton.addActionListener(new EndingListener());
		
		SelectDifferentAccountsLabel = new JLabel("Select Different Accounts");//label
		SelectDifferentAccountsLabel.setForeground(Color.RED);
		SelectDifferentAccountsLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SelectDifferentAccountsLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		SelectDifferentAccountsLabel.setBounds(50, 307, 241, 54);
		MakeTransferPanel.add(SelectDifferentAccountsLabel);
		SelectDifferentAccountsLabel.setVisible(false);
		
		AmountTextField = new JTextField();//text field
		AmountTextField.setBounds(367, 307, 253, 50);
		AmountTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MakeTransferPanel.add(AmountTextField);
		AmountTextField.setColumns(10);
		AmountTextField.setVisible(false);
		
		TransferSuccessLabel = new JLabel("Transfer Successful");//label
		TransferSuccessLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TransferSuccessLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		TransferSuccessLabel.setBounds(270, 235, 457, 78);
		MakeTransferPanel.add(TransferSuccessLabel);
		TransferSuccessLabel.setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent e) //action performers
	{
		String actionCommand=e.getActionCommand(); //saves action sent 
		

		if(actionCommand.equals("CheckingAccountButton")) //action performers
		{
			
			if(FirstChoice.equals(""))//saves first choice
			{
				FirstChoice="Checking";
				transferFromLabel.setVisible(false);
				TransferToLabel.setVisible(true);
			}
			else if(FirstChoice.equals("Checking"))  //prevents selecting same choice
			{
				SelectDifferentAccountsLabel.setVisible(true);
				
			}
			else if(FirstChoice.equals("Savings"))//makes transfer
			{
				SelectDifferentAccountsLabel.setVisible(false);
				TransferToLabel.setVisible(false);
				TransferFromTopLabel.setText("Transfer From Savings Accnt: $" + formater.format(ATMcreator.getSavings()));
				TransferFromBottomLabel.setText("Transfer To Checking Accnt: $" + formater.format(ATMcreator.getBalance()));
				TransferFromTopLabel.setVisible(true);
				TransferFromBottomLabel.setVisible(true);
				MakeTransferButton.setVisible(true);
				CheckingAccountButton.setVisible(false);
				SavingsAccountButton.setVisible(false);
				AmountTextField.setVisible(true);
				AmountLabel.setVisible(true);
				
			}
			
		}
		else if(actionCommand.equals("SavingsAccountButton"))
		{
			if(FirstChoice.equals(""))//saves first choice
			{	
				FirstChoice="Savings";
				transferFromLabel.setVisible(false);
				TransferToLabel.setVisible(true);
			}
			else if(FirstChoice.equals("Savings"))//prevents selecting same choice
			{
				SelectDifferentAccountsLabel.setVisible(true);
			}
			else if(FirstChoice.equals("Checking"))//makes transfer
			{
				
				SelectDifferentAccountsLabel.setVisible(false);
				TransferToLabel.setVisible(false);
				TransferFromTopLabel.setText("Transfer From Checking Accnt: $" + formater.format(ATMcreator.getBalance()));
				TransferFromBottomLabel.setText("Transfer To Savings Accnt: $" + formater.format(ATMcreator.getSavings()));
				TransferFromTopLabel.setVisible(true);
				TransferFromBottomLabel.setVisible(true);
				MakeTransferButton.setVisible(true);
				CheckingAccountButton.setVisible(false);
				SavingsAccountButton.setVisible(false);
				AmountTextField.setVisible(true);
				AmountLabel.setVisible(true);
				
			}
		
		}
		
		
	}

}
