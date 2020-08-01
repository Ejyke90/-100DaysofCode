package Basics;

public class task1 {

	public static void main(String[] args) {
		// I want to write a function that takes a value a and returns the sum from 1 to a
		System.out.println(sum(15));

	}
	
	public static int sum(int a) {
		int sum = 0;
		for (int i = 1; i<= a; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
			
		}
		return sum;
	}
	

}
