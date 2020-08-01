package Basics;

public class task3 {

	public static void main(String[] args) {
		// Write three functions that return the min, avg, and max values of an array.
		
		int[] numbers = {5, -238, 0, -2, -567, 9};
		int[] scores = {3,8,9,4,5,100,2};
		System.out.println(findMin(numbers));
		System.out.println(findMax(scores));
		System.out.println("the average value is: " + findAvg(scores));

	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	// for the average we will find the sum first and divide it by the array length or number of elements in the array
	
	public static int findAvg(int[] arr) {
		int sum = 0;
		for (int c = 0; c < arr.length; c++) {
			sum = sum + arr[c];
		}
		System.out.println("the sum is: " + sum);
		return sum/arr.length;
	}

}
