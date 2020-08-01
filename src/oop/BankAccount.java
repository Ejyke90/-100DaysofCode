package oop;

public class BankAccount implements IRate {
	
	//Define the variables for a bank account
	String accountNumber;
	
	// static keyword >> means that variable belongs to the class and not the object instance
	// final keyword >> means that that variable is constant and cannot be changed in the main class >> often static and final go together
	// whenever you instantiate an object and want to use a property (say routing number) uniquely to that new object, then you do not use
	// static. But if you want to access something (property) directly as pertaining to the class and not a specific instance then you're
	// going to use the static keyword
	
	private static final String routingNumber = "56572";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// in between variables and methods we have what we call constructors
	// Constructors are known as unique methods
		//1. They are used to define/setup/initialize the properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Finally, constructors have NO return type
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	// we cannot override a constructor but we can overload it
	// Overloading means calling the same method name with different arguments:
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		// let's create a new variable
		String msg = "";
		// you can also write the above message as String msg = null;
		
		if (initDeposit < 1000) {
			msg = "ERROR! Insufficient initial deposit";
			
		}
		else {
			msg = "Thank you for the initial deposit of: $" + initDeposit;
		}
		if (initDeposit >= 1000) {
			balance = initDeposit;
		}
		else {
			msg = "ERROR! Talk to an agent!";
		}
		System.out.println(msg);
		
	}
	
	// for encapsulation, we use setters and getters because it is best practice not to allow the user to be able to define or set 
	// the variable names (instance variables). So we use setters and getters method after the constructor block
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	// Variable are only accessible within the block in which they were defined. So as the initDeposit was defined within the 3rd 
	// BankAccount method or block, you cannot use it in say the deposit method or function below.
	// routing number is a static variable, account type, balance, and ssn are instance variables while, msg is a local variable
	
	
	
	// the functions/methods or the various things that can be done with the account
	
	public String getSsn() {
		return "SSN: " + ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// INTERFACE methods
	public void setRate() {
		System.out.println("The current rate is 20%");
	}
	public void newRate() {
		System.out.println("The new rate is now 23.5%");
	}
	

	// this is a public access modifier and is accessible anywhere
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT!!");
	}
	
	// this is an example of a default access modifier, it can be accessed within the project
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW!!!");
		
	}
	
	// This is an example of a private access modifier. It (the method) can only be accessed from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent Transaction: " + activity);
		System.out.println("Your new Balance is: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ Name: " + name + ". " + "Routing #: " + routingNumber + ". " +  " BALANCE of: $" + balance + "]"; 
	}
	
	
	// Access modifiers >> we have private, default, protected and public.
	
}
