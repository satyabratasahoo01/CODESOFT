package ATM_INTERFACE;

import java.util.Scanner;

class BankAccount{
	private double balance;
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposite Sucessfully.. New Balance :"+ balance);
		}else {
			System.out.println("Invalid amount for deposit..!!");
		}
	}
	public void withdraw(double amount) {
		if(amount >0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal Sucessfull.. New Balance: "+balance);
		}else {
			System.out.println("Insufficient funds or Invalid amount for withdrawal...");
		}
	}
}
class ATM{
	private BankAccount account;
	private Scanner scanner;
	
	public ATM(BankAccount account) {
		this.account = account;
		this.scanner = new Scanner(System.in);
	}
	public void showMenu() {
		System.out.println("1 Check Balance...");
		System.out.println("2 Deposit...");
		System.out.println("3 Withdraw");
		System.out.println("4 Exit");
	}
	public void run() {
		int choice;
		do {
			showMenu();
			System.out.println("Enter your Choice :");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
				
			case 4:
				System.out.println("Thank you for Using the Atm");
				break;
				default:
					System.out.println("Invalid choice !! Please Select a Valid Option..");
				
				
			}
		}while(choice !=4);
	}
	private void checkBalance() {
		System.out.println("Your Current Balance is :"+account.getBalance());
	}
	private void deposit() {
		System.out.println("Enter the Amount to Deposite:");
		double amount = scanner.nextDouble();
		account.deposit(amount);
	}
	private void withdraw() {
		System.out.println("Enter the Amount to Withdraw:");
		double amount = scanner.nextDouble();
		account.withdraw(amount);
	}
}
public class Task3 {
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Four Digit Pin:");
		int enteredPin = sc.nextInt();
		
		BankAccount userAccount = new BankAccount(10000.0);//initial balance
		ATM atm = new ATM(userAccount);
		atm.run();
	}

}
