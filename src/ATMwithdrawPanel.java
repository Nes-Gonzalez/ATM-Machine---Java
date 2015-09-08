import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ATMwithdrawPanel extends JPanel implements ActionListener //Withdraw panel
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;
	
	JTextField AmountEnterTextField;
	JLabel EnterAmountLabel;
	JLabel WithdrawSuccessLabel;

	public ATMwithdrawPanel()
	{
		
		setSize(WIDTH,HEIGHT); //panel info
		setLayout(null);
		
		JPanel withdrawPanel = new JPanel(); //panel
		withdrawPanel.setBounds(-15, 0, 989, 562);
		add(withdrawPanel);
		withdrawPanel.setLayout(null);
		
		JButton fourButton = new JButton("4"); //button
		fourButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fourButton.setBounds(367, 288, 75, 76);
		withdrawPanel.add(fourButton);
		
		fourButton.addActionListener(this);
		
		JButton twoButton = new JButton("2");//button
		twoButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		twoButton.setBounds(452, 201, 75, 76);
		withdrawPanel.add(twoButton);
		
		twoButton.addActionListener(this);
	
		JButton threeButton = new JButton("3");//button
		threeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		threeButton.setBounds(537, 201, 75, 76);
		withdrawPanel.add(threeButton);
		
		threeButton.addActionListener(this);
		
		JButton oneButton = new JButton("1");//button
		oneButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		oneButton.setBounds(367, 201, 75, 76);
		withdrawPanel.add(oneButton);
		
		oneButton.addActionListener(this);
		
		JButton fiveButton = new JButton("5");//button
		fiveButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fiveButton.setBounds(452, 288, 75, 76);
		withdrawPanel.add(fiveButton);
		
		fiveButton.addActionListener(this);
		
		JButton sixButton = new JButton("6");//button
		sixButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sixButton.setBounds(537, 288, 75, 76);
		withdrawPanel.add(sixButton);
		
		sixButton.addActionListener(this);
		
		JButton sevenButton = new JButton("7");//button
		sevenButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sevenButton.setBounds(367, 375, 75, 76);
		withdrawPanel.add(sevenButton);
		
		sevenButton.addActionListener(this);
		
		JButton eightButton = new JButton("8");//button
		eightButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		eightButton.setBounds(452, 375, 75, 76);
		withdrawPanel.add(eightButton);
		
		eightButton.addActionListener(this);
		
		JButton nineButton = new JButton("9");//button
		nineButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nineButton.setBounds(537, 375, 75, 76);
		withdrawPanel.add(nineButton);
		
		nineButton.addActionListener(this);
		
		AmountEnterTextField = new JTextField(); //text field
		AmountEnterTextField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		AmountEnterTextField.setBounds(367, 139, 245, 39);
		withdrawPanel.add(AmountEnterTextField);
		AmountEnterTextField.setColumns(10);
		
		JButton withdrawButton = new JButton("Withdraw");//button
		withdrawButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		withdrawButton.setBounds(664, 475, 170, 76);
		withdrawPanel.add(withdrawButton);
		
		withdrawButton.setActionCommand("WithdrawMoney");
		withdrawButton.addActionListener(this);
		
		JButton zeroButton = new JButton("0");//button
		zeroButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		zeroButton.setBounds(537, 462, 75, 76);
		withdrawPanel.add(zeroButton);
		
		zeroButton.addActionListener(this);
		
		JButton backButton = new JButton("Back");//button
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(148, 475, 170, 76);
		withdrawPanel.add(backButton);
		
		backButton.addActionListener(new EndingListener());
		
		JButton deleteButton = new JButton("Delete");//button
		deleteButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		deleteButton.setBounds(367, 462, 160, 76);
		withdrawPanel.add(deleteButton);
		
		deleteButton.addActionListener(this);
		
		EnterAmountLabel = new JLabel("Enter Amount"); //label
		EnterAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EnterAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EnterAmountLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		EnterAmountLabel.setBounds(407, 65, 170, 50);
		withdrawPanel.add(EnterAmountLabel);
		
		WithdrawSuccessLabel = new JLabel("Withdraw Successful");//label
		WithdrawSuccessLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		WithdrawSuccessLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WithdrawSuccessLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		WithdrawSuccessLabel.setBounds(387, 65, 200, 50);
		withdrawPanel.add(WithdrawSuccessLabel);
		WithdrawSuccessLabel.setVisible(false);
		
		
	}
	public void actionPerformed(ActionEvent e) //catches actions
	{
		
		
		String actionCommand = e.getActionCommand();//saving action sent here
		
		System.out.println("Withdraw Menu Action performer called");
		System.out.println(actionCommand + " Pressed");
		
		if(actionCommand.equals("1")) //action performers
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"1");
		
		}
		else if(actionCommand.equals("2"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"2");
		
		}
		else if(actionCommand.equals("3"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"3");
		
		}
		else if(actionCommand.equals("4"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"4");
		
		}
		else if(actionCommand.equals("5"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"5");
		
		}
		else if(actionCommand.equals("6"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"6");
		
		}
		else if(actionCommand.equals("7"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"7");
		
		}
		else if(actionCommand.equals("8"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"8");
		
		}
		else if(actionCommand.equals("9"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"9");
		
		}
		else if(actionCommand.equals("0"))
		{
			EnterAmountLabel.setVisible(true);
			WithdrawSuccessLabel.setVisible(false);
			AmountEnterTextField.setText(AmountEnterTextField.getText()+"0");
		
		}
		else if(actionCommand.equals("Delete"))
		{
			AmountEnterTextField.setText(AmountEnterTextField.getText().substring(0,(AmountEnterTextField.getText().length()-1)));
		}
		else if(actionCommand.equals("WithdrawMoney"))
		{
			int a = Integer.parseInt(AmountEnterTextField.getText());
			ATMcreator.setBalance(ATMcreator.getBalance()-a);
			AmountEnterTextField.setText("");
			System.out.println("Balance is " + ATMcreator.getBalance());
			
			EnterAmountLabel.setVisible(false);
			WithdrawSuccessLabel.setVisible(true);
			
		}		
	}
}
	