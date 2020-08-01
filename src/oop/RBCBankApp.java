package oop;

public class RBCBankApp {

	public static void main(String[] args) {
		RBCAccount accno1 = new RBCAccount("102345678", 1200.50);
		
		accno1.setAccName("Anthony Joshua");
		System.out.println(accno1.getAccName());
		
		accno1.makeDeposit(350);
		accno1.makeDeposit(1065);
		accno1.makeDeposit(2100);
		accno1.payBill(680);
		accno1.accrue();
		System.out.println(accno1.toString());

	}

}

class RBCAccount implements IInterest {
	// Defining the properties of the client's account and using encapsulation
	private static int iD = 1000;					//the ID is internal and must be unique to each new account, hence we will set this to static
	private String accNumber;		//we want the acc number to be = iD + 2 random numbers + first two SIN numbers
	private String transitNumber = "067452";
	private String accName;
	private String SIN;
	private double accBalance;
	
	// Constructors
	public RBCAccount(String SIN, double firstDeposit) {
		accBalance = firstDeposit;
		this.SIN = SIN;
		iD++;
		setAccountNumber();
		
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accNumber = iD + "" + random + SIN.substring(0,2);
		System.out.println("Your New Account Number is: " + accNumber);
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public void payBill(double amount) {
		System.out.println("Debit: " + amount);
		accBalance = accBalance - amount;
		availableBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Credit: " + amount);
		accBalance = accBalance + amount;
		availableBalance();
	}
	
	public void availableBalance() {
		System.out.println("Current Balance: " + accBalance);
	}

	@Override
	public void accrue() {
		accBalance = accBalance * (1 + rate/100);
		availableBalance();
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + accName + "]\n" + "[Account Number: " + accNumber + "]\n" + "[Transit #: " + transitNumber + "]\n" + "[Balance: " + accBalance +"]"; 
	}
	
	
	
}
