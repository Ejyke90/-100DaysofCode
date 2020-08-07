package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class Password {

	public static void main(String[] args) {
		// I am trying to read a file that contains multiple sets of passwords and test them to see if they meet the criteria
		
		//reading the file
		
		
		String filename = "/Users/ejikeudeze/Documents/Files/Password";
		String [] passwds = new String [13];
		
				
				
				
		File file = new File (filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwds.length; i++) {
				passwds[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read  the file");
			e.printStackTrace();
		}
				
		// A valid password has the following:
			// 1. A number
			// 2. A letter
			// 3. A special character
					
		for (String passwd : passwds) {
			System.out.println("*******\n" + passwd + "\n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			for (int n = 0;n < passwd.length();n++) {
				// condition 1: contains number
				if ("0123456789".contains(passwd.substring(n, n+1))) {
					hasNumber = true;
				//	System.out.println("Position " + n + " contains a number");
				}
				// condition 2: contains letter
				else if("abcdefghijklmnopqrstuvwxyz".contains(passwd.substring(n, n+1).toLowerCase())) {
					hasLetter = true;
				//	System.out.println("Position " + n + " contains a letter");
				}
				//condition 3: contains character
				else if ("!@#$%^&.+=)*".contains(passwd.substring(n, n+1))) {
					hasSpecialChar = true;
				//	System.out.println("Position " + n + " contains a special character");
				}
				else {
					try {throw new InvalidCharException(passwd.substring(n, n+1));
					} catch (InvalidCharException e) {e.toString();}
					
				}
				
					
			}
			// Test & Exception handling
			try {
				if (!hasNumber) {throw new NumberCriteriaException(passwd);}
				else if (!hasLetter) {throw new LetterCriteriaException(passwd);}
				else if (!hasSpecialChar) {throw new SpecialCharCriteria(passwd);}
				else {System.out.println("Valid Password");}
			} catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteria e) {
				System.out.println("Invalid Password");
				System.out.println(e.toString());
			}
		}
	}
}

class InvalidCharException extends Exception {
	String ch;
	// create a constructor
	public InvalidCharException(String ch) {
		this.ch = ch;
	}
	//override the toString
	public String toString() {
		return "InvalidCharException " + ch;
	}
}

class NumberCriteriaException extends Exception {
	String passwd;
	// create a constructor
	public NumberCriteriaException(String passwd) {
		this.passwd = passwd;
	}
	//override the toString
	public String toString() {
		return "NumberCriteriaException " + passwd;
	}
}

class LetterCriteriaException extends Exception {
	String passwd;
	// create a constructor
	public LetterCriteriaException(String passwd) {
		this.passwd = passwd;
	}
	//override the toString
	public String toString() {
		return "LetterCriteriaException " + passwd;
	}
}

class SpecialCharCriteria extends Exception {
	String passwd;
	// create a constructor
	public SpecialCharCriteria(String passwd) {
		this.passwd = passwd;
	}
	//override the toString
	public String toString() {
		return "SpecialCharCriteria " + passwd;
	}
}








