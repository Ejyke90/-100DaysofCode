package Basics;

public class task2 {

	public static void main(String[] args) {
		// writing a function that computes factorial of numbers
		// i will use the recursion method
		
		System.out.println(fac(10));

	}
	
	public static int fac(int b) {
		if (b == 0) {
			return 1;
			
		}
		return fac(b - 1) * b;
	}

}
