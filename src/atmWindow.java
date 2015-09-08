import java.awt.BorderLayout;

import javax.swing.JFrame;


public class atmWindow extends JFrame //MAIN FRAME FOR ALL PANELS
{
	public static final int WIDTH= 1000;
	public static final int HEIGHT= 600;
	public static final int NUMBER_OF_CHAR= 30;
	
	static ATMmachineLoginPanel loginPanel ; //all panels
	static ATMmainMenuPanel mainMenu;
	static ATMdepositPanel depositPanel;
	static ATMwithdrawPanel withdrawPanel;
	static ATMcheckBalancePanel checkBalancePanel;
	static ATMchangePasswordPanel changePasswordPanel;
	static ATMmakeTransferPanel makeTransferPanel;

	public atmWindow()
	{
		
		super("ATM Machine Group 25"); //calls super to make a name for window
		
		System.out.println("Window PANEL CREATED");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); //window info
		
		loginPanel = new ATMmachineLoginPanel(); //creating login panel
		add(loginPanel);
		loginPanel.setVisible(true);
		
		mainMenu = new ATMmainMenuPanel(); //creating main menu panel
		add(mainMenu);
		mainMenu.setVisible(false);
		
		depositPanel = new ATMdepositPanel(); //creating deposit panel
		add(depositPanel);
		depositPanel.setVisible(false);
		
		withdrawPanel= new ATMwithdrawPanel(); //creating withdraw panel
		add(withdrawPanel);
		withdrawPanel.setVisible(false);
		
	
		checkBalancePanel= new ATMcheckBalancePanel(); //creating check balance panel
		add(checkBalancePanel);
		checkBalancePanel.setVisible(false);
		
		changePasswordPanel=new ATMchangePasswordPanel(); //creating change password panel
		add(changePasswordPanel);
		changePasswordPanel.setVisible(false);
		
		makeTransferPanel= new ATMmakeTransferPanel(); //creating make transfer panel
		add(makeTransferPanel);
		makeTransferPanel.setVisible(false);
		
		
	}
	
}