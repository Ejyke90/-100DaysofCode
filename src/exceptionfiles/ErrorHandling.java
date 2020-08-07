package exceptionfiles;

public class ErrorHandling {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		
		// The steps error handling are
		// 1. Identify the problem area (in this example that would be line 15
		// 2. Surround the area with the try-catch block
		
		try{
			int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot Divide by Zero");
			System.out.println(e.toString());
		}
		
		String[] states = {"NY", "TX", "CA", "MI"};
		for (int i=0; i<=states.length; i++) {
			try{
				System.out.println(states[i]);
			} catch (ArrayIndexOutOfBoundsException d) {	//you can have as much catch blocks as you want
				System.out.println("ERROR: INDEX OUTSIDE OF ARRAY DOMAIN");
				System.out.println(d.toString());
			} finally {		// this executes regardless of whether catch does or not
				System.out.println("Iterating through the array >> States");
			}
			
		
		}
		System.out.println("PROGRAM IS ENDING");
	

	}
}
