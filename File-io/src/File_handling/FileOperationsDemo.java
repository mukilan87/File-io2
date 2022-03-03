package File_handling;
import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {

	public static void main(String[] args) {
		
		File newFolder = new File("newFolder");
		
		newFolder.mkdir();//Creates a directory
		
//		This line adds a new file into the folder: newFolder 
		File theFile = new File(newFolder, "first.txt");
		
		try {
			//This creates the file
			theFile.createNewFile();
			
		//Add another file into the same folder
			File anotherFile = new File(newFolder, "second.txt");
			anotherFile.createNewFile();
			
//			Delete a file
			//anotherFile.delete();
			
//			Delete a directory
			System.out.println("Folder deleted : " + newFolder.delete());//Can't delete a non-empty directory
			
			
//			Rename a file
			anotherFile.renameTo(new File(newFolder, "updatedName.txt"));
			
//			Display all the files in a particular folder:
			String []files = new String[50];
			
			File searchForFiles = new File("newFolder");
			
			files = searchForFiles.list();
			
			for(String fileName : files) {
				System.out.println(fileName);
			}
			
			
		} catch (IOException e) {
			System.out.println("Issues while creating the file : " + e.getMessage());
		}

	}

}
