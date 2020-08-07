package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path we want to write
		String filename = "/Users/ejikeudeze/Documents/Files/FileToWrite";
		String message = "I am writing data to this new file";
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		
		try {
			// 3. Open the file
			FileWriter fw;
			fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error: Could not read file " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file writer");
		}
		
		
		
		
		

	}

}
