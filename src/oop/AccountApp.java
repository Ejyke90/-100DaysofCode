package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAcount la = new LoanAcount();
		la.setRate();
		la.newRate();
		la.setTerm(20);
		la.setAmmortSchedule();
		
		IRate account1 = new LoanAcount();
		account1.setRate();
		account1.newRate();
		
		// Polymorphism changes where we are pointing
		// so in the last example above we created a new accont1 based on IRate properties but it is pointing to the LoanAcount properties

	}

}
