import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;


public class ATMcreator { //contains Main
	
	
	
	private static String AccountNumber; //private variables for user info
	private static String FirstName;
	private static String LastName;
	private static String Password;
	private static double Balance;
	private static String ATMstatus;
	private static double Savings =500.00;

	public static void main (String args[]) throws FileNotFoundException  //main
	{
		System.out.println("Creator Started");  //Message to console for developer
		
		
		Scanner FileINaccountInfo = null;
		FileINaccountInfo = new Scanner (new FileInputStream ("AccountInformation.txt")); //Opening files
		Scanner FileINpasswordInfo = null;
		FileINpasswordInfo = new Scanner (new FileInputStream ("Password.txt"));
		
		AccountNumber = FileINpasswordInfo.next(); //Saving info from files
		Password = FileINpasswordInfo.next();
		FileINaccountInfo.nextLine();
		LastName= FileINaccountInfo.nextLine();
		FirstName = FileINaccountInfo.nextLine();
		Balance = Integer.parseInt(FileINaccountInfo.nextLine());
		ATMstatus = FileINaccountInfo.nextLine();
		
		atmWindow atmMachine = new atmWindow();  //Creates Window
		atmMachine.setVisible(true);
	
	}
	public static String getAccountNumber() //standard Methods
	{
		return AccountNumber;
	}
	public static String getPassword()
	{
		return Password;
	}
	public static String getFirstName()
	{
		return FirstName;
	}
	public static String getLastName()
	{
		return LastName;
	}
	public static double getBalance()
	{
		return Balance;
	}
	public static double getSavings()
	{
		return Savings;
	}
	public static String getStatus()
	{
		return ATMstatus;
	}
	public static void setBalance(double a)
	{
		Balance=a;
	}
	public static void setPassword(String a)
	{
		Password=a;
	}
	public static void setSavings(double a)
	{
		Savings=a;
	}
	
}
