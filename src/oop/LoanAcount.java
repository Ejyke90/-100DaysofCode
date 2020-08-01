package oop;

public class LoanAcount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void newRate() {
		System.out.println("New Rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammortization Schedule");
	}

}
