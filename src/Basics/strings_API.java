package Basics;

public class strings_API {

	public static void main(String[] args) {
		java.lang.String bookTitle;
		java.lang.String choiceWord = "Lord";
		bookTitle = "The Lord of the Rings!";
		
		if (bookTitle.contains(choiceWord)) {
			System.out.println("The Choice word contains the word " + choiceWord);
		}
		
		java.lang.String browser = "Safari";
		if (browser.equalsIgnoreCase("safari")) {
			System.out.println("The browser type is " + browser);
		}
		
		java.lang.String firstName = "Alfred";
		java.lang.String lastName = "Udeze";
		java.lang.String SIN = "0567209567";
		
		System.out.println("There are " + SIN.length() + " digits in your SIN number.");
		if(SIN.length() == 9) {
			System.out.println("SIN number is valid");
		}
		else{
			System.out.println("SIN is invalid");
		}
		
		// So we want to print the initials and the last four and first four digits of the SIN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(SIN.substring(5));
		System.out.println(SIN.substring(0,4));

	}

}
