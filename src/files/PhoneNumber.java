package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumber {

	public static void main(String[] args) {
		// I am trying to read phone numbers from a file and test some conditions
		
		
		String filename = "/Users/ejikeudeze/Documents/Files/PhoneNumbers";
		String [] phoneNums = new String [8];
		String phoneNum = "";
		
		
		File file = new File (filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<phoneNums.length; i++) {
				phoneNums[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		
		// A valid phone number has: (this is to test or check that the phone number is valid
					// 10 digits
					// Area code cannot start in 0 or 9
					// Can't have 911 in the phone
		for (int i=0; i<phoneNums.length; i++) {
			phoneNum = phoneNums[i];
			try {
				if (phoneNum.length() != 10) {
					throw new TenDigitsException(phoneNum);
				}
				
				// for strings you use .equals instead of == or = 
				if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
					throw new AreaCodeException(phoneNum);
				}
				
				// using a for loop to check for 911 in the phone numbers
				for (int n=0; n<phoneNum.length()-2; n++) {
					if (phoneNum.substring(n, n+1).equals("9")) {
						if (phoneNum.substring(n+1, n+3).equals("11")) {
							throw new EmergencyException(phoneNum);
						}
					}
				}
				System.out.println(phoneNum);
			} catch (TenDigitsException e) {
				System.out.println("ERROR: Phone number is not 10 digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("Error: Phone number has an invalid area code");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("Error: Invalid 911 sequence found");
				System.out.println(e.toString());
			}
		}
			
		
		

	}

}

class TenDigitsException extends Exception {
	String num;
	// create a constructor (overload it)
	TenDigitsException (String phoneNum) {
		this.num = phoneNum;
	}
	public String toString() {
		return ("TenDigitsException " + num);
	}
}

class AreaCodeException extends Exception {
	String num;
	// create a constructor (overload it)
	AreaCodeException (String phoneNum) {
		this.num = phoneNum;
	}
	public String toString() {
		return ("AreaCodeException " + num);
	}
}

class EmergencyException extends Exception {
	String num;
	// create a constructor (overload it)
	EmergencyException (String phoneNum) {
		this.num = phoneNum;
	}
	public String toString() {
		return ("EmergencyException " + num);
	}
}







