package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1. Define the file (path) that we want to read
		String filename = "/Users/ejikeudeze/Documents/Files/FileToRead";
		
		// This variable text was declared here so we can use it inside the try block
		String text = null;
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		// 3. Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			// 4. Read the file
			text = br.readLine();
			br.close(); // we can put this at the end of the try-catch block or within the finally block but will be asked to add another try-catch which will be messy, so it is better to just add it here
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		System.out.println(text);
		

	}

}
