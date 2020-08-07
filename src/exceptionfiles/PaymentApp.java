package exceptionfiles;

import java.util.Scanner;

// In this application we want to take payment from users

public class PaymentApp {

	public static void main(String[] args) {
		
		double payment = 0;
		boolean paymentisPtive = true;
		// Steps involved
		// 1. Ask the user for input
		
		do {
		
			System.out.print("Enter the Payment Amount: ");
			
			// 2. Get the amount and test the value and Handle exceptions appropriately
			
			Scanner in = new Scanner(System.in);
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					paymentisPtive = true;
				}
				
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please Try Again");
				paymentisPtive =  false;
				
			}
		
		}while(!paymentisPtive);
		
		
		// 4. Print confirmation
		System.out.println("Thank you for your payment: $" +payment);

	}

}
