package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// We want to create a new bank account for RBC clients
		//instantiate an object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0134568";
		acc1.setName("Anthony Joshua");
		System.out.println(acc1.getName());
		acc1.balance = 5000;
		acc1.deposit(4000);
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
		acc1.setSsn("234987045");
		System.out.println(acc1.getSsn());
		acc1.setRate();
		acc1.newRate();
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "09885558";
		BankAccount acc3 = new BankAccount("Savings Account", 3589.96);
		acc3.accountNumber = "09833456";
		acc3.checkBalance();
		*/
		

	}

}
