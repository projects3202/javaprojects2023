import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	//private static final double CheckingBalance = 0;
//	private static final Object checkingWithdraw = null;
	private int CustomerNumber;
	private int pinNumber;
	private double CheckingBalance = 0;
	private double SavingBalance = 0;

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	//private Object SavingDeposit;
	//private Object calcSavingWithdraw;
	//private Object checkingBalance;

	public int SetCustomerNumber(int CustomerNumber) {
		this.CustomerNumber = CustomerNumber;
		return CustomerNumber;
	}
   public int getCustomerNumber() {
	   return CustomerNumber;
	   
}
   public int SetPinNumber(int pinNumber){
	   this.pinNumber = pinNumber;
	   return pinNumber;
   }
   public int getpinNumber() {
	   return pinNumber;
	   }
   public double getCheckingBalance() {
	   return CheckingBalance;
	   
   }
   
   public double getSavingBalance() {
	   return SavingBalance;
   }
   
   public double calcCheckingWithdraw(double amount) {
	   CheckingBalance = (CheckingBalance - amount);
	   return CheckingBalance;
   }
   
   public double calcSavingWithdraw(double amount) {
	   SavingBalance = (SavingBalance - amount);
	   return SavingBalance;
	}
   
   public double calcCheckingDeposit(double amount) {
	   CheckingBalance = (CheckingBalance + amount);
	   return CheckingBalance;
   }
   public double calcSavingDeposit(double amount) {
	   SavingBalance = (SavingBalance + amount);
	   return SavingBalance;
   }
   
   public void getCheckingWithdrawInput() {
	   System.out.println("Checking Account Balance: " + moneyFormat.format(CheckingBalance));
	   System.out.println("Amount you want to withdraw from Checking Account: ");
	   double amount = input.nextDouble();
	   if((CheckingBalance - amount) >= 0 ) {
		   calcCheckingWithdraw(amount);
		   System.out.println("New Checking Account Balance : " + moneyFormat.format(CheckingBalance));
	   }
	   else {
		   System.out.println("Balance cannot be Negative. " + "\n");
		   
		   
		   
	   }
	   
   }
   
   public void getSavingWithdrawInput() {
	   System.out.println("Saving Acount Balance : " + moneyFormat.format(SavingBalance));
	   System.out.println("AAmount you want to withdraw from SavingAccount :");
	   double amount = input.nextDouble();
	   if((SavingBalance - amount) >=0 ) {
		   calcSavingWithdraw(amount);
		   System.out.println("New Saving Account Balance : " + moneyFormat.format(SavingBalance));
		   
	   } else {
		   System.out.println("Balance cannot be Negative. " + "\n");
		   
	   }
	   
   
   
   }
 
   
   
   public void getCheckingDepositInput() {
	   System.out.println("Checking Account Balance : " + moneyFormat.format(CheckingBalance));
	   System.out.println("Amount you want to Deposit from Checking Account : ");
	   double  amount = input.nextDouble();
	  if((CheckingBalance + amount) >= 0) {
		  calcCheckingDeposit(amount);
		  System.out.println("New checking Account Balance: " + moneyFormat.format(CheckingBalance));
	  }
	  else {
		  System.out.println("Balance cannot to be Negative." + "\n");
		  
	  }
   }
   
   
   public void getSavingDepositInput() {
	   System.out.println("Saving Account Balamce: " + moneyFormat.format(SavingBalance));
	   System.out.println("Amount you want to deposit from SavingAccount: ");
	   double amount = input.nextDouble();
	   if((SavingBalance + amount) >= 0) {
			  calcSavingDeposit(amount);
			  System.out.println("New Saving Account Balance: " + moneyFormat.format(SavingBalance));
		  }
		  else {
			  System.out.println("Balance cannot to be Negative." + "\n");
			  
		  }
	   }
   
    // private int customerNumber;
    // private int pinNumber;
    // private double checkingalance = 0;
     //private double savingBalance = 0;
   
   
   }
   
   
   
   
   
   
   
   
   
   
   
   
