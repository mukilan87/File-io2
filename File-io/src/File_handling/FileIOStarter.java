package File_handling;

import java.io.File;
import java.io.IOException;

public class FileIOStarter {

	public static void main(String[] args) {
		File theFile = new File("sample.txt");//It's just an object
		
		System.out.println("Files exists : " + theFile.exists());
		
		try {
			theFile.createNewFile();//This might create a new file
			
			System.out.println("Now does it exist : " + theFile.exists());
		} catch (IOException e) {
			System.out.println("Some issues while creating the file : " + e.getMessage());
		}

	}

}