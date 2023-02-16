import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(952141, 191904);
				data.put(989947, 71976);
				System.out.println("Welcome to the ATM project! ");
				System.out.println("Enter your Cosutomer Number");
				SetCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your PIN Number");
				
			}
			catch(Exception e){
				System.out.println("\n" + "Invalid character(s).only numbers." + "\n");
				x=2;
			}
			int cn = getCustomerNumber();
			int pn = getpinNumber();
			if(data.containsKey(cn) && data.get(cn)==pn ) {
				getAccoutnType();
			}
			//else 
			//	System.out.println("\n" + "Wrong Customer Number or pinNumber" + "\n");
			
		} 
		while (x==1);
		
	}

	public void getAccoutnType() {
		System.out.println("Select the Account you want to Access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");

		int Selection = menuInput.nextInt();
		switch (Selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, bye. \n");

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getAccoutnType();

		}

	}

	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funs");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		int selection = menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccoutnType();
			break;
			case 2:
				getCheckingWithdrawInput();
				getAccoutnType();
				break;
				
			case 3:
				getCheckingDepositInput();
				getAccoutnType();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, bye. \n");
				break;
				default:
					System.out.println("\n" + "Invalid choice. " + "\n");
					getChecking();
					
		}
		
		
	}
	
	public void getSaving() {
		System.out.println("Saving Accoutn");
		System.out.println("Type 1 - view Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - deposit funds");
		System.out.println("Type 4 - Exit");	
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccoutnType();
			break;
			case 2:
				getCheckingWithdrawInput();
				break;
			case 3:
			getSavingDepositInput();
			break;
			case 4:
				System.out.println("Thank you for using this ATM, bye. ");
				break;
				default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getChecking();
				
			
		}
	}

	
		
	}


