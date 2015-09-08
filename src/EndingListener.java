import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class EndingListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Action performer called");

		String actionCommand=e.getActionCommand();
		System.out.println(actionCommand + " Pressed");
	
		
		if(actionCommand.equals("Login"))
		{
			
			

			if(atmWindow.loginPanel.AccountNumberField.getText().equals(ATMcreator.getAccountNumber())&& atmWindow.loginPanel.PasswordField.getText().equals(ATMcreator.getPassword()))
			{
				System.out.println("Successful Login");
				atmWindow.loginPanel.IncorrectLoginLabel.setVisible(false);
				atmWindow.loginPanel.setVisible(false);
				atmWindow.mainMenu.setVisible(true);
			}
			else
			{
				atmWindow.loginPanel.LoggedOutLable.setVisible(false);
				System.out.println("Incorrect Login");
				atmWindow.loginPanel.AccountNumberField.setText("");
				atmWindow.loginPanel.PasswordField.setText("");
				atmWindow.loginPanel.IncorrectLoginLabel.setVisible(true);
			}
			
		}
		else if(actionCommand.equals("Log Out"))
		{
			
			atmWindow.loginPanel.LoggedOutLable.setVisible(true);
			atmWindow.mainMenu.setVisible(false);
			atmWindow.loginPanel.AccountNumberField.setText("");
			atmWindow.loginPanel.PasswordField.setText("");
			atmWindow.loginPanel.setVisible(true);
	
		}
		else if(actionCommand.equals("Deposit"))
		{
			atmWindow.mainMenu.setVisible(false);
			atmWindow.depositPanel.setVisible(true);
		}
		else if(actionCommand.endsWith("Withdraw"))
		{
			atmWindow.mainMenu.setVisible(false);
			atmWindow.withdrawPanel.setVisible(true);
		}
		else if(actionCommand.equals("Back"))
		{
			atmWindow.mainMenu.setVisible(true);
			atmWindow.depositPanel.setVisible(false);
			atmWindow.withdrawPanel.setVisible(false);
			atmWindow.checkBalancePanel.setVisible(false);
			atmWindow.changePasswordPanel.setVisible(false);
			atmWindow.makeTransferPanel.setVisible(false);
		}
		else if(actionCommand.equals("Check Balance"))
		{
			DecimalFormat formater = new DecimalFormat("###,###.00");
			ATMcheckBalancePanel.CheckingAccountLabel.setText("Checking Accnt 111859620: $"+formater.format(ATMcreator.getBalance()));
			ATMcheckBalancePanel.SavingsAccountLabel.setText("Savings Accnt 111000020: $"+formater.format(ATMcreator.getSavings()));
			atmWindow.mainMenu.setVisible(false);
			atmWindow.checkBalancePanel.setVisible(true);		
		}
		else if(actionCommand.equals("Change Password"))
		{
			ATMchangePasswordPanel.NewPasswordTextfield.setText("");
			ATMchangePasswordPanel.CurrentPasswordTextfield.setText("");
			ATMchangePasswordPanel.confirmPasswordTextfield.setText("");
			
			ATMchangePasswordPanel.PasswordChangedLabel.setVisible(false);
			ATMchangePasswordPanel.IncorrectPasswordNewPasswordLabel.setVisible(false);
			atmWindow.mainMenu.setVisible(false);
			atmWindow.changePasswordPanel.setVisible(true);
			
		}
		else if(actionCommand.equals("OK"))
		{
		
			
			if(ATMchangePasswordPanel.CurrentPasswordTextfield.getText().equals(ATMcreator.getPassword()) && ATMchangePasswordPanel.NewPasswordTextfield.getText().equals(ATMchangePasswordPanel.confirmPasswordTextfield.getText()))
			{
				ATMcreator.setPassword(ATMchangePasswordPanel.NewPasswordTextfield.getText());
				ATMchangePasswordPanel.PasswordChangedLabel.setVisible(true);
				ATMchangePasswordPanel.IncorrectPasswordNewPasswordLabel.setVisible(false);
				
			}
			else if (!(ATMchangePasswordPanel.CurrentPasswordTextfield.getText().equals(ATMcreator.getPassword())) || !(ATMchangePasswordPanel.NewPasswordTextfield.getText().equals(ATMchangePasswordPanel.confirmPasswordTextfield.getText())))
			{
				ATMchangePasswordPanel.PasswordChangedLabel.setVisible(false);
				ATMchangePasswordPanel.IncorrectPasswordNewPasswordLabel.setVisible(true);
			}
		}
		else if(actionCommand.equals("Make Transfer"))
		{
			DecimalFormat formater = new DecimalFormat("###,###.00");
			
			ATMmakeTransferPanel.CheckingAccountButton.setText("Checking Accnt: $" + formater.format(ATMcreator.getBalance()));
			ATMmakeTransferPanel.SavingsAccountButton.setText("Savings Accnt: $" + formater.format(ATMcreator.getSavings()));
			
			atmWindow.mainMenu.setVisible(false);
			atmWindow.makeTransferPanel.setVisible(true);
			ATMmakeTransferPanel.TransferFromTopLabel.setVisible(false);
			ATMmakeTransferPanel.TransferFromBottomLabel.setVisible(false);
			ATMmakeTransferPanel.MakeTransferButton.setVisible(false);
			ATMmakeTransferPanel.TransferToLabel.setVisible(false);
			ATMmakeTransferPanel.MakeTransferLabel.setVisible(true);
			ATMmakeTransferPanel.CheckingAccountButton.setVisible(true);
			ATMmakeTransferPanel.SavingsAccountButton.setVisible(true);
			ATMmakeTransferPanel.transferFromLabel.setVisible(true);
			ATMmakeTransferPanel.AmountLabel.setVisible(false);
			ATMmakeTransferPanel.SelectDifferentAccountsLabel.setVisible(false);
			ATMmakeTransferPanel.AmountTextField.setVisible(false);
			ATMmakeTransferPanel.AmountTextField.setText("");
			ATMmakeTransferPanel.TransferSuccessLabel.setVisible(false);
				
			ATMmakeTransferPanel.FirstChoice="";
			
		}
		else if(actionCommand.equals("TransferMoneyButton"))
		{
			if(ATMmakeTransferPanel.FirstChoice.equals("Checking"))
			{
				System.out.println("Checking"+ ATMcreator.getBalance()+ "-"+ Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				System.out.println("Savings"+ ATMcreator.getSavings()+ "+"+ Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				
				
				ATMcreator.setBalance(ATMcreator.getBalance()-Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				ATMcreator.setSavings(ATMcreator.getSavings()+Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				
				System.out.print("Textfield was is"+ATMmakeTransferPanel.AmountTextField.getText());
				System.out.print("Savings now is"+ ATMcreator.getSavings());
				System.out.print("Checking now is"+ ATMcreator.getBalance());
				
				ATMmakeTransferPanel.TransferFromTopLabel.setVisible(false);
				ATMmakeTransferPanel.TransferFromBottomLabel.setVisible(false);
				ATMmakeTransferPanel.MakeTransferButton.setVisible(false);
				ATMmakeTransferPanel.TransferToLabel.setVisible(false);
				ATMmakeTransferPanel.MakeTransferLabel.setVisible(false);
				ATMmakeTransferPanel.CheckingAccountButton.setVisible(false);
				ATMmakeTransferPanel.SavingsAccountButton.setVisible(false);
				ATMmakeTransferPanel.transferFromLabel.setVisible(false);
				ATMmakeTransferPanel.AmountLabel.setVisible(false);
				ATMmakeTransferPanel.SelectDifferentAccountsLabel.setVisible(false);
				ATMmakeTransferPanel.AmountTextField.setVisible(false);
				ATMmakeTransferPanel.TransferSuccessLabel.setVisible(true);
				
				
			}
			else if(ATMmakeTransferPanel.FirstChoice.equals("Savings"))
			{
				System.out.println("Checking" + ATMcreator.getBalance()+ "+"+ Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				System.out.println("Savings" +ATMcreator.getSavings()+ "-"+ Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				
				double temp = ATMcreator.getBalance()+Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText());
				ATMcreator.setSavings(ATMcreator.getSavings()-Double.parseDouble(ATMmakeTransferPanel.AmountTextField.getText()));
				ATMcreator.setBalance(temp);
				
				System.out.print("Textfield was is"+ATMmakeTransferPanel.AmountTextField.getText());
				System.out.print("Savings now is"+ ATMcreator.getSavings());
				System.out.print("Checking now is"+ ATMcreator.getBalance());
					
				ATMmakeTransferPanel.TransferFromTopLabel.setVisible(false);
				ATMmakeTransferPanel.TransferFromBottomLabel.setVisible(false);
				ATMmakeTransferPanel.MakeTransferButton.setVisible(false);
				ATMmakeTransferPanel.TransferToLabel.setVisible(false);
				ATMmakeTransferPanel.MakeTransferLabel.setVisible(false);
				ATMmakeTransferPanel.CheckingAccountButton.setVisible(false);
				ATMmakeTransferPanel.SavingsAccountButton.setVisible(false);
				ATMmakeTransferPanel.transferFromLabel.setVisible(false);
				ATMmakeTransferPanel.AmountLabel.setVisible(false);
				ATMmakeTransferPanel.SelectDifferentAccountsLabel.setVisible(false);
				ATMmakeTransferPanel.AmountTextField.setVisible(false);
				ATMmakeTransferPanel.TransferSuccessLabel.setVisible(true);
				
			}
		}
	}
}

